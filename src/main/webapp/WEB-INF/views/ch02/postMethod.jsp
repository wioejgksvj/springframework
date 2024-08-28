<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="/WEB-INF/views/common/top.jsp" %>

	<div class="card">
		<div class="card-header">
			POST 방식
		</div>
		
		<div class="card-body">		
			<form method="post" action="postFormTag"> <!-- form 태그 안 내용이 post이기 때문에 본문으로 들어간다. -->
				<div class="mb-3">
					  <label for="bno" class="form-label">게시물 번호</label>
					  <input type="number" class="form-control" id="bno" name="bno" value="5">
					</div>
				

					<div class="mb-3">
						  <label for="bkind" class="form-label">게시물 종류</label>
						  <input type="text" class="form-control" id="bkind" name="bkind" value="free">
						</div>
					<!-- 제출 버튼을 만드는 방법 -->					
					<input type="submit" value="제출" class="btn btn-info btn-sm"/>
					<!-- 제출 버튼을 만드는 방법2 -->
					<br/>
					<input class="mt-2" type="image" src="${pageContext.request.contextPath}/resources/image/img_submit.gif">
					<br/>
					<!-- 제출 버튼을 만드는 방법 -->
					<button class="mt-2 btn btn-info btn-sm" type="submit">제출</button>  <!-- 버튼이 form태그 안에 있으면 디폴트로 타입이 submit 값이된다. 그냥 버튼 사용하고 싶을땐 타입값 버튼으로 주면 된다.-->
			
			</form>	
			
			<hr/>
			
			<div class="mt-2">				
				<button onclick="requestPost1()" class="btn btn-info btn-sm mb-2">JavaScript: AJAX 이용</button>
				<button onclick="requestPost2()" class="btn btn-info btn-sm mb-2">JavaScript: AJAX 이용</button>
				<div id="ajaxResult" class="border mt-2">
				
				<div id="ajaxResult" class="border mt-2"></div>
				</div>
				
				<script>

					function requestPost1() {
						$.ajax({
							url: "postAjax1",
							method: "post",
							/* data: "bno=5&bkind=free" */
							data: {bno:5, bkind:"free"},
							success: function(data) { /* data에 html조각이 들어간다. */
								//data가 HTML 조각일 경우
									$("#ajaxResult").html(data);
									/* document.querySelector("#ajaxResult").innerHTML = data */ /* $랑 둘중 하나 사용하지만 둘다 아는게 중요. oti에선 보통 jquery */
								
							}
						});
					}
					
					 function requestPost2() {
			               $.ajax({
			                  url: "postAjax2",
			                  method: "post",
			                  //data: "bno=5&bkind=free"
			                  data: {bno:5, bkind:"free"},
			                  success: function(data) {
			                     //data가 JSON일 경우
			                     console.log(data);
			                     var content = "";
			                     content += "<div class='card'>";
			                     content += "   <div class='card-header'>AJAX의 JSON 응답</div>";
			                     content += "   <div class='card-body'>";
			                     
			                     data.data.forEach(function(item) {
			                        content += "<img height='100' src='${pageContext.request.contextPath}/resources/image/photos/" + item + "' class='me-2'>"
			                     });
			                     
			                     content += "   </div>";
			                     content += "</div>";
			                     $("#ajaxResult").html(content);
			                  }
			               });
			            }

					
				</script>
			</div>
		</div>
	</div>	

	<%@ include file="/WEB-INF/views/common/bottom.jsp" %>