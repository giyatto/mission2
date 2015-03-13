<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <%@page import="org.nhn.next.db.*"%>
    <%@page import="org.nhn.next.user.*"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="./commons/_head.jspf" %>
</head>
<body>
	<%@ include file="./commons/_top.jspf" %>

	
	<div class="container">
		<div class="row">
			<div class="span12">
				<section id="typography">
				<div class="page-header">
					<h1>회원정보 수정</h1>
				</div>
				
				<form class="form-horizontal" action="/form_action" method="post">
					
					<div class="control-group">
						<label class="control-label" for="userId">사용자 아이디</label>
						<div class="controls">
							<input type="text" id="userId" name="userId" value="<c:out value="${ dbUser.getUserId()}"></c:out>" readonly />
						</div>
					</div>
					
					
					<!-- 비밀번호 수정 부분 추가 필요  -->
					
					<div class="control-group">
						<label class="control-label" for="password">현재 비밀번호</label>
						<div class="controls">
							<input type="password" id="password" name="password" value="" required/>
						</div>
					</div>
					
					<!-- 
					
					<div class="control-group">
						<label class="control-label" for="password">새 비밀번호</label>
						<div class="controls">
							<input type="password" id="new_password" name="new_password" value="" />
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="password">새 비밀번호 확인</label>
						<div class="controls">
							<input type="password" id="new_password_confirm" name="new_password_confirm" value="" />
						</div>
					</div>
					
					 -->
					
					<div class="control-group">
						<label class="control-label" for="name">이름</label>
						<div class="controls">
							<input type="text" id="name" name="name" value="<c:out value="${ dbUser.getName()}"></c:out>" required/>
						</div>
					</div>
					
					<div class="control-group">
						<label class="control-label" for="email">이메일</label>
						<div class="controls">
							<input type="text" id="email" name="email" value="<c:out value="${ dbUser.getEmail()}"></c:out>" required/>
						</div>
					</div>
					
					<div class="control-group">
						<div class="controls">
							<button type="submit" class="btn btn-primary">수정</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>



</body>
</html>