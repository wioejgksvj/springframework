package com.mycompany.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller /*스프링에서 홈컨트롤러를 자동으로 객체 생성*/
@Slf4j
public class HomeController {
	@RequestMapping("")
	public String index() {
		log.info("실행");
		return "home";

	}
}
