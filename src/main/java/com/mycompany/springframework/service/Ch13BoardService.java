package com.mycompany.springframework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.springframework.dao.mybatis.Ch13BoardDao;
import com.mycompany.springframework.dto.Ch13Board;
import com.mycompany.springframework.dto.Ch13Pager;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j		// 비지니스 로직
public class Ch13BoardService { 
	@Autowired
	private Ch13BoardDao boardDao; // Ch13BoardDao는 interface 이고 @Autowired 가 관리 객체를 넣어준다. / 서비스가 Dao를 주입받는다.
	
	public List<Ch13Board> getBoardList(Ch13Pager pager) {
		List<Ch13Board> list = boardDao.selectList(pager);
		return list;
	}
	
	
	public Ch13Board getBoard(int bno) {
		Ch13Board board = boardDao.selectByBno(bno);
		return board;
	}
	
	//게시물 작성 기능
	public void writeBoard(Ch13Board board) {
		log.info("실행");
		log.info("insert 전bno: " + board.getBno());
		boardDao.insert(board);
		log.info("insert 후bno: " + board.getBno());
		int bno = board.getBno(); // 추가적으로 bno를 이용할 수 있다.
		
	}
	
	public void updateBoard(Ch13Board board) {
		boardDao.update(board);
		
	}
	
	public void deleteBoard(int bno) {
		boardDao.delete(bno);
	}


	public int getTotalRows() {
		int totalRows = boardDao.countRows();
		return totalRows;
	}


	public Ch13Board getBoardAttach(int bno) {
		Ch13Board board = boardDao.selectAttachByBno(bno);
		return board;
	}


	public void addHitcount(int bno) {
		boardDao.updateHitcount(bno);
		
	}
}
