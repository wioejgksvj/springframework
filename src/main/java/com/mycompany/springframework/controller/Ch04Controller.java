package com.mycompany.springframework.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.springframework.dto.Ch04LoginForm;
import com.mycompany.springframework.dto.Ch04LoginFormValidator;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/ch04")
public class Ch04Controller {
	@GetMapping("/loginForm")
	public String loginForm() {
		return "ch04/loginForm";
	}
	
	@InitBinder("ch04LoginForm")
	public void ch04LoginFomrmValidator(WebDataBinder binder) {
		binder.setValidator(new Ch04LoginFormValidator());
	}
	
	@PostMapping("/login")
	public String login(@Valid Ch04LoginForm loginForm, Errors errors) {
		if(errors.hasErrors()) {
			log.info("유효성 검사 실패");
			return "ch04/loginForm";
		}

		log.info("유효성 검사 성공");
		
		log.info("mid: " + loginForm.getMid());
		log.info("mpassword: " + loginForm.getMpassword());
		return "redirect:/";
	}
}
