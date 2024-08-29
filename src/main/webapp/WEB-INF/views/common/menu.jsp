<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


			<div class="accordion" id="accordionMenu">
			
				<div class="accordion-item">
					<h2 class="accordion-header">
						<button class="accordion-button ${chMum='ch01'?'':'collapsed'}" type="button"
							data-bs-toggle="collapse"
							data-bs-target="#Ch01"
							aria-expanded="${chNum=='ch01'}" aria-controls="Ch01">
							Ch01. 개발환경 구축
							</button>
					</h2>
					<div id="Ch01"
						class="accordion-collapse collapse show">
						<div class="accordion-body">
							<ul>
								<li><a href="${pageContext.request.contextPath}/ch01/content">공통 레이아웃 작성</a></li>
							</ul>
						</div>
					</div>
				</div>													
			 
			 <div class="accordion-item">
					<h2 class="accordion-header">
						<button class="accordion-button ${chMum='ch02'?'':'collapsed'}" type="button"
							data-bs-toggle="collapse"
							data-bs-target="#Ch02"
							aria-expanded="${chNum=='ch02'}" aria-controls="Ch02">
							Ch02. Controller(RequestMapping)
							</button>
					</h2>
					<div id="Ch02"
						class="accordion-collapse collapse ${chNum=='ch02'?'show':''}">
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
						<button class="accordion-button ${chMum='ch03'?'':'collapsed'} " type="button"
							data-bs-toggle="collapse"
							data-bs-target="#Ch03"
							aria-expanded="${chNum=='ch03'}" aria-controls="Ch03">
							Ch03. Controller(매개변수)
							</button>
					</h2>
					<div id="Ch03"
						class="accordion-collapse collapse ${chNum=='ch03'?'show':''}">
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
						<button class="accordion-button collapsed" type="button"
							data-bs-toggle="collapse"
							data-bs-target="#Ch04"
							aria-expanded="false" aria-controls="Ch04">
							Ch04. Controller(폼 유효성 검사)
							</button>
					</h2>
					<div id="Ch04"
						class="accordion-collapse collapse">
						<div class="accordion-body">
							<ul>
								<li><a href="${pageContext.request.contextPath}/ch04/loginForm">로그인 폼</a></li>
								
							</ul>
						</div>
					</div>
				</div>
				
				<div class="accordion-item">
					<h2 class="accordion-header">
						<button class="accordion-button collapsed" type="button"
							data-bs-toggle="collapse"
							data-bs-target="#Ch05"
							aria-expanded="false" aria-controls="Ch05">
							Ch05. Controller(헤더값 및 쿠키 설정)
							</button>
					</h2>
					<div id="Ch05"
						class="accordion-collapse collapse">
						<div class="accordion-body">
							<ul>
								<li><a href="${pageContext.request.contextPath}/ch05/header">요청 헤더값 얻기</a></li>
								<li><a href="${pageContext.request.contextPath}/ch05/createCookie">쿠키 생성</a></li>
								<li><a href="${pageContext.request.contextPath}/ch05/readCookie">쿠키 읽기</a></li>
								
							</ul>
						</div>
					</div>
				</div>
				
				<div class="accordion-item">
					<h2 class="accordion-header">
						<button class="accordion-button collapsed" type="button"
							data-bs-toggle="collapse"
							data-bs-target="#Ch06"
							aria-expanded="false" aria-controls="Ch06">
							Ch06. 포워드와 리다이렉트
							</button>
					</h2>
					<div id="Ch06"
						class="accordion-collapse collapse">
						<div class="accordion-body">
							<ul>
								<li><a href="${pageContext.request.contextPath}/ch06/forward">포워드</a></li>
								<li><a href="${pageContext.request.contextPath}/ch06/redirect">리다이렉트</a></li>
								<li><a href="${pageContext.request.contextPath}/ch06/sessionData">다른 요청시 세션 데이터 이용</a></li>
								<li><a href="${pageContext.request.contextPath}/ch06/cartview">장바구니 보기</a></li>
								<li><a href="${pageContext.request.contextPath}/ch06/productList">상품 목록 보기</a></li>
								
							</ul>
						</div>
					</div>
				</div>
				
				<div class="accordion-item">
					<h2 class="accordion-header">
						<button class="accordion-button collapsed" type="button"
							data-bs-toggle="collapse"
							data-bs-target="#Ch07"
							aria-expanded="false" aria-controls="Ch07">
							Ch07. 데이터 전달 및 데이터(객체) 사용 범위 및 데이터 전달
							</button>
					</h2>
					<div id="Ch07"
						class="accordion-collapse collapse">
						<div class="accordion-body">
							<ul>
								<li><a href="${pageContext.request.contextPath}/ch07/objectScope1">데이터(객체) 사용 범위</a></li>
								<li><a href="${pageContext.request.contextPath}/ch07/objectScope2">데이터(객체) 사용 범위</a></li>
							</ul>
						</div>
					</div>
				</div>
					
					<div class="accordion-item">
					<h2 class="accordion-header">
						<button class="accordion-button collapsed" type="button"
							data-bs-toggle="collapse"
							data-bs-target="#Ch08"
							aria-expanded="false" aria-controls="Ch08">
							Ch08. 세션 지원 API
							</button>
					</h2>
					<div id="Ch08"
						class="accordion-collapse collapse">
						<div class="accordion-body">
							<ul>
								<li><a href="${pageContext.request.contextPath}/ch08/login">로그인 폼</a></li>
								<li><a href="${pageContext.request.contextPath}/ch08/loginInfo">로그인 정보</a></li>
								<li><a href="${pageContext.request.contextPath}/ch08/logout">로그아웃</a></li>
							</ul>
						</div>
					</div>
				</div>
					
			</div>


		
				