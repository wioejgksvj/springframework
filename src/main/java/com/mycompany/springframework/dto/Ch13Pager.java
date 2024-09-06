package com.mycompany.springframework.dto;

import lombok.Data;

@Data
public class Ch13Pager {
	   private int totalRows;      //페이징 대상이 되는 전체 행수
	   private int totalPageNo;   //전체 페이지 수
	   private int totalGroupNo;   //전체 그룹 수
	   private int startPageNo;   //그룹의 시작 페이지 번호
	   private int endPageNo;      //그룹의 끝 페이지 번호
	   private int pageNo;         //현재 페이지 번호
	   private int pagesPerGroup;   //그룹당 페이지 수
	   private int groupNo;      //현재 그룹 번호
	   private int rowsPerPage;   //페이지당 행 수 / 한페이지 당 몇개의 번호가 보이게 할 것 인가
	   private int startRowNo;      //페이지의 시작 행 번호(1, ..., n)
	   private int startRowIndex;   //페이지의 시작 행 인덱스(0, ..., n-1) for mysql
	   private int endRowNo;      //페이지의 마지막 행 번호
	   private int endRowIndex;   //페이지의 마지막 행 인덱스
	
	   public Ch13Pager(int rowsPerPage, int pagesPerGroup, int totalRows, int pageNo) {
	      this.rowsPerPage = rowsPerPage;
	      this.pagesPerGroup = pagesPerGroup;
	      this.totalRows = totalRows; // 전체 페이지 행수에 페이지당 행수를 나누면 되는데, 남는 수가 있는지
	      this.pageNo = pageNo;
	
	      totalPageNo = totalRows / rowsPerPage;
	      if(totalRows % rowsPerPage != 0) totalPageNo++; // 남는 수를 확인 후 더해 주는것
	      
	      totalGroupNo = totalPageNo / pagesPerGroup;
	      if(totalPageNo % pagesPerGroup != 0) totalGroupNo++; // 전체 페이지 수를 그룹당 페이지수를 나누고
	      
	      groupNo = (pageNo - 1) / pagesPerGroup + 1; // 남는 수를 더해 주는것 / 자바는 정수 나누기 정수하면 정수가 나온다.
	      
	      startPageNo = (groupNo-1) * pagesPerGroup + 1; // ex) 1그룹일때는 1번 2그룹일땐 6번
	      
	      endPageNo = startPageNo + pagesPerGroup - 1;
	      if(groupNo == totalGroupNo) endPageNo = totalPageNo;
	      
	      startRowNo = (pageNo - 1) * rowsPerPage + 1; 
	      startRowIndex = startRowNo - 1;
	      endRowNo = pageNo * rowsPerPage;
	      endRowIndex = endRowNo - 1; 
	   }
}
