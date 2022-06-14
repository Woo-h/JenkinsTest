<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>로그인 페이지</title>
	<link rel="stylesheet" type="text/css" href="./css/loginPage.css">
</head>
<body>
	<h1>Jenkins Webhook 성공</h1>
	<h1>Jenkins Webhook 성공</h1>
	<h1>Jenkins Webhook 성공</h1>
	<h1>Jenkins Webhook 성공</h1>
	<h1>Jenkins Webhook 성공</h1>
	<h1>Jenkins Webhook 성공</h1>
	<h1>Jenkins Webhook 성공</h1>
	<h1>Jenkins Webhook 성공</h1>
	<!-- 베리 페리 색상 코드 : #6667AB -->
    <div id="container">
        <form action="./login.do" method="post" id="loginForm">
            <div class="loginLogo"></div>
            <div class="loginAlert">
                <span>${msg}</span>
            </div>
            <input id="loginId" name="username" type="text" placeholder="계정">
            <input id="loginPw" name="password" type="password" placeholder="비밀번호">
            <input id="loginBtn" type="submit" value="로그인">
        </form>
    </div>
</body>
</html>