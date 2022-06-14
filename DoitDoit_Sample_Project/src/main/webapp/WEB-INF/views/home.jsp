<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈 화면</title>
<link rel="stylesheet" href="./dist/fullcalendar-5.10.2/lib/main.css" />
<link rel="stylesheet" type="text/css" href="./css/home.css">
<script type="text/javascript" src="./dist/fullcalendar-5.10.2/lib/main.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript" src="./js/home.js"></script>
<script type="text/javascript" src="./js/cal.js"></script>
</head>
<body>
	<div id="container">
        <%@include file="./nav.jsp" %>
        <main>
            <%@include file="./header.jsp" %>
            <div id="content">
            <sec:authorize access="hasRole('ROLE_USER')">
                <div id="rContent">
                    <div id="calendar" class="rContent-home"></div>
                    <div id="resent" class="rContent-home"></div>
                </div>
            <%@include file="./aside.jsp" %>    
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
            	아이디 : <sec:authentication property="principal"/> ${principal} <br>
            	직급 : <sec:authentication property="Details" var="info"/>${info.rank_no}<br>
            	부서 : <sec:authentication property="Details" var="info"/>${info.dept_no}<br>
            	이름 : <sec:authentication property="Details" var="info"/>${info.emp_name}<br>
            	권한 : <sec:authentication property="Authorities"/> ${Authorities} <br>
            </sec:authorize>
            </div>
        </main>
    </div>
</body>
</html>