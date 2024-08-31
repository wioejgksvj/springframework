package com.mycompany.springframework.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/ch05")
public class Ch05Controller {
	@GetMapping("/header")
	public String header(@RequestHeader("user-Agent") String userAgent, // 헤더값을 얻는 방법1
			HttpServletRequest request, 
			Model model) {
		log.info("user-Agent: " + userAgent);
		
		// 헤더값을 얻는 방법2
		/*userAgent = request.getHeader("user-Agent");*/
		
		
		String browser = null;
		if(userAgent.contains("Edg")) {
			browser = "Edg";
			
		} else if (userAgent.contains("Chrome")) {
			browser = "Chrome";
			
		}
		
		model.addAttribute("browser", browser);
		
		String clientIp = request.getRemoteAddr();
		log.info("clientIp: " + clientIp);
		model.addAttribute("clientIp", clientIp);
		
		model.addAttribute("chNum", "ch05");
		return "ch05/header";
	}
	
	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse response) {
		//쿠키 생성 / 쿠키 생성은 서버쪽에서 한다.
		Cookie cookie1 = new Cookie("mid", "user1");
		/*cookie1.setMaxAge(60); // 1분동안 브라우저를 꺼도 쿠키는 살아 있다. / 대신 1분 뒤에는 쿠키가 사라진다.
		cookie1.setDomain("samsung.com");
		cookie1.setSecure(true);  // https에서만 쿠키를 전송하겠다.
		cookie1.setHttpOnly(true); // http는 쿠키를 수정 읽기를 못함/ 브라우저에 자바스크립트로 쿠키접근 허용 안함, https에서는 가능하다.
*/		
		Cookie cookie2 = new Cookie("memail", "user1@mycompany.com");

		
		//쿠키를 응답 헤더에 추가해서 브라우저로 보냄
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		return "redirect:/";
	}
	
	@GetMapping("/readCookie")
	public String readCookie(
			@CookieValue("mid") String mid,
			@CookieValue("memail") String memail,
			Model model) {
		log.info("mid: " + mid);
		log.info("memail: " + memail);
		
		model.addAttribute("mid", mid);
		model.addAttribute("memail", memail);
		
		model.addAttribute("chNum", "ch05");
		return "ch05/readCookie";
	}
}
