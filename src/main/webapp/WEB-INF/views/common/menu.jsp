<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


			<div class="accordion" id="accordionMenu">
			
				<div class="accordion-item">
					<h2 class="accordion-header">
						<button class="accordion-button" type="button"
							data-bs-toggle="collapse"
							data-bs-target="#Ch01"
							aria-expanded="true" aria-controls="Ch01">
							Ch01. 개발환경 구축
							</button>
					</h2>
					<div id="Ch01"
						class="accordion-collapse collapse">
						<div class="accordion-body">
							<ul>
								<li><a href="${pageContext.request.contextPath}/ch01/content">공통 레이아웃 작성</a></li>
							</ul>
						</div>
					</div>
				</div>													
			 
			 <div class="accordion-item">
					<h2 class="accordion-header">
						<button class="accordion-button" type="button"
							data-bs-toggle="collapse"
							data-bs-target="#Ch02"
							aria-expanded="true" aria-controls="Ch02">
							Ch02. Controller(RequestMapping)
							</button>
					</h2>
					<div id="Ch02"
						class="accordion-collapse collapse">
						<div class="accordion-body">
							<ul>
								<li><a href="${pageContext.request.contextPath}/ch02/getMethod">GET 방식</a></li>
								<li><a href="${pageContext.request.contextPath}/ch02/postMethod">POST 방식</a></li>
								<li><a href="${pageContext.request.contextPath}/ch02/returnModelAndView">ModelAndView 리턴</a></li>
								<li><a href="${pageContext.request.contextPath}/ch02/returnVoid">void 리턴</a></li>
								<li><a href="${pageContext.request.contextPath}/ch02/returnObject">object 리턴</a></li>
								<li><a href="${pageContext.request.contextPath}/ch02/mypage">MyPage(로그인 체크 여부 확인)</a></li>
								<li><a href="${pageContext.request.contextPath}/ch02/loginForm">로그인/로그아웃</a></li>
							</ul>
						</div>
					</div>
				</div>		
			
																	 
			 <div class="accordion-item">
					<h2 class="accordion-header">
						<button class="accordion-button" type="button"
							data-bs-toggle="collapse"
							data-bs-target="#Ch03"
							aria-expanded="false" aria-controls="Ch03">
							Ch03. Controller(매개변수)
							</button>
					</h2>
					<div id="Ch03"
						class="accordion-collapse collapse">
						<div class="accordion-body">
							<ul>
								<li><a href="${pageContext.request.contextPath}/ch03/receiveParamData?param1=문자열&param2=5&param3=3.14&param&param4=true&param5=2024-08-27">GET 방식 데이터 얻기</a></li>
								<li><a href="${pageContext.request.contextPath}/ch03/postMethodForm">POST 방식 폼 얻기</a></li>
								<li><a href="${pageContext.request.contextPath}/ch03/defaultValue?param1=문자열&param5=2024-08-27">param 생략시 default값 설정</a></li>
								<li><a href="${pageContext.request.contextPath}/ch03/otherArgName?param1=문자열&param2=5&param3=3.14&param&param4=true&param5=2024-08-27">파라미터 이름과 매개변수 이름이 다를 경우</a></li>
								<li><a href="${pageContext.request.contextPath}/ch03/commandObject?param1=문자열&param2=5&param3=3.14&param&param4=true&param5=2024-08-27">DTO로 파라미터 값을 모두 받기</a></li>
								<li><a href="${pageContext.request.contextPath}/ch03/ajaxParam">AJAX로 보낸 데이터를 DTO로 받기</a></li>
							</ul>
						</div>
					</div>
				</div>	
				
				<div class="accordion-item">
					<h2 class="accordion-header">
						<button class="accordion-button" type="button"
							data-bs-toggle="collapse"
							data-bs-target="#Ch04"
							aria-expanded="false" aria-controls="Ch04">
							Ch04. Controller(폼 유효성 검사)
							</button>
					</h2>
					<div id="Ch04"
						class="accordion-collapse collapse show">
						<div class="accordion-body">
							<ul>
								<li><a href="${pageContext.request.contextPath}/ch04/loginForm">로그인 폼</a></li>
								
							</ul>
						</div>
					</div>
				</div>
					
			</div>


		
				