package com.mycompany.springframework.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginCheckFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, //request는 httpservletrequest가 생략되어있는것. 모든 요청은 httpservletrequest로 행해짐
						 ServletResponse response,
						 FilterChain chain)
			throws IOException, ServletException {
		
		//전처리
		log.info("전처리 실행**********");
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		
		String requestURI = httpServletRequest.getRequestURI();
		String requestURL = httpServletRequest.getRequestURL().toString();
		log.info("requestURI: " + requestURI);
		log.info("requestURL: " + requestURL);
		if(requestURI.contains("/mypage")) { // 요청은 mypage로 했는데 login 값이 null 이면 다시 loginForm으로 가기 때문에 redirect
			HttpSession session = httpServletRequest.getSession();
			if(session.getAttribute("login") == null) {
				//로그인을 안했으니 로그인 폼으로 리다이렉팅 / 응답은 다 response로 해야한다.
				String contextPath = request.getServletContext().getContextPath();
				httpServletResponse.sendRedirect(contextPath + "/ch02/loginForm");
				return; // 리턴하면 메소드 종료
			}
		}
		
		//----------------------------------
		chain.doFilter(request, response);
		//----------------------------------
		
		//후처리
		log.info("후처리 실행**********");
	}

}
