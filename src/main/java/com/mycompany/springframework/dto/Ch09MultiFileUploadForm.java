package com.mycompany.springframework.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class Ch09MultiFileUploadForm {
	private String title;
	private String desc;
	private MultipartFile[] attach; // 여러개의 파일을 받을땐 배열로 표현

}
