package com.mycompany.springframework.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.springframework.dto.Ch02LoginResult;
import com.mycompany.springframework.interceptor.LoginCheck;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/ch02")
@Slf4j
public class Ch02Controller {
	private static final Logger logger = LoggerFactory.getLogger(Ch02Controller.class);	
	
	
	@RequestMapping("/getMethod")
	public String getMethod(Model model) {
		log.info("실행");
		model.addAttribute("chNum", "ch02");
		return "ch02/getMethod";
	}
	
	/*@RequestMapping(value="/getAtag", method=RequestMethod.GET) 어노테이션 일때 2개 이상의 값을 넣을때 이런식으로 넣어야 한다.*/
	@GetMapping("/getAtag")
	public String getAtag(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "ch02/getMethod";
	}
	
	@GetMapping("/getFormTag")
	public String getFormTag(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "redirect:/";
		
	}
	
	@GetMapping("/getLocationHref")
	public String getLocationHref(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "ch02/getMethod";
	}	

	@GetMapping("/getAjax1")
	public String getAjax1(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "ch02/ajaxFragmentHtml";
	}
	
	@GetMapping("/getAjax2")
	public String getAjax2(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "ch02/ajaxJSON";
	}

	@GetMapping("/postMethod")
	public String postMethod(Model model) {
		log.info("실행");
		model.addAttribute("chNum", "ch02");
		return "ch02/postMethod";
	}
	
	@PostMapping("/postFormTag")
	public String postFormTag(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "ch02/postMethod";
	}
	
	@PostMapping("/postAjax1")
	public String postAjax1(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "ch02/ajaxFragmentHtml";
	}
	
	@PostMapping("/postAjax2")
	public String postAjax2(String bno, String bkind, Model model) {
		log.info("실행");
		log.info("bno: " + bno);
		log.info("bkind: " + bkind);
		model.addAttribute("chNum", "ch02");
		return "ch02/ajaxJSON";
	}

	@GetMapping("/returnModelAndView")
	public ModelAndView returnModelAndView() {
		log.info("실행");
		ModelAndView mav = new ModelAndView();
		mav.addObject("bno", 15);
		mav.addObject("bkind", "notice");
		mav.addObject("mid", "user1");
		mav.addObject("memail", "user1@mycompany.com");
		mav.setViewName("ch02/returnModelAndView");
		mav.addObject("chNum", "ch02");
		return mav;
	}

	@GetMapping("/returnVoid")
	public void returnVoid(HttpServletResponse response) throws IOException{
		log.info("실행");
		//{ }: 객체 JSONObject jsonObject = new JSONObject();
		//[ ]: 배열 JSONArray jsonArray = new JSONArray();
		
		//{ "result": "success", "mid", "user1" }
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("result", "success");
		jsonObject.put("mid", "user1");
		String json = jsonObject.toString();
		log.info(json);
		
		//응답 생성(헤더 contentType + 본문(데이터))
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println(json);
		pw.flush();
		pw.close();
		
	}

	@GetMapping(value="/returnObject", produces="application/json; charset=UTF-8") // produces: ""안에 있는 결과가 생성된다.
	@ResponseBody // Ch02LoginResult 객체가 응답 본문에 들어가게 해준다. 이때 Json으로 생성된 후 응답 바디로 들어가게 해준다.
	public Ch02LoginResult returnObject() { // dto객체를 json으로 안바꾸면 응답 바디로 넣지 못한다.
		log.info("실행");
		
		Ch02LoginResult obj = new Ch02LoginResult();
		obj.setResult("success");
		obj.setMid("user1");
		
		return obj;
	}
	
	@LoginCheck // 이 어노테이션이 붙어있는 경로는 로그인 검사를 하고 안붙어 있는 곳은 로그인 검사 안하는 식으로 / Login 어노테이션으로 로그인 체크 결정
	@GetMapping("/mypage")
	public String mypage(Model model) {
		log.info("실행");
		model.addAttribute("chNum", "ch02");
		return "ch02/mypage";
	}
	
	@GetMapping("/loginForm")
	public String loginForm(Model model) {
		log.info("실행");
		model.addAttribute("chNum", "ch02");
		return "ch02/loginForm";
	}	
	
	@PostMapping("/login")
	public String login(String mid, String mpassword, HttpSession session) {
		log.info("실행");
		log.info("mid: " + mid);
		log.info("mpassword: " + mpassword);
		//세션에 로그인 정보 저장
		session.setAttribute("login", mid);
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest session) {
		log.info("실행");
		//세션에 로그인 정보 삭제
		session.removeAttribute("login");
		return "redirect:/ch02/loginForm";
	}
}



