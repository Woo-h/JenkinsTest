<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/home.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" 
href="https://cdn.datatables.net/v/dt/dt-1.11.5/datatables.min.css"/>

<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.11.5/datatables.min.js"></script>
<script type="text/javascript" src="./js/home.js"></script>
</head>
<body>
	<div id="container">
        <%@include file="./nav.jsp" %>
        <main>
            <%@include file="./header.jsp" %>
            <div id="content">
            	<div id="adminContent">
            		<form id="frmContent" action="./insEmp.do" method="post">
            			<div id="frmTop">
            				<div id="insProfile">
            					프로필 사진
            				</div>
            				<div id="insValue">
	            				<input id="empName" name="emp_name" type="text" placeholder="name">
	            				<input id="empEmail" name="emp_email" type="email" placeholder="email">
	            				<input type="hidden" name="emp_password">
            				<select name="dept_no">
            					<option>부서</option>
            					<option value="01">인사부</option>
            					<option value="02">관리부</option>
            					<option value="03">개발부</option>
            					<option value="04">영업부</option>
            				</select>
            				<select name="rank_no">
            					<option>직급</option>
            					<option value="01">사원</option>
            					<option value="02">대리</option>
            					<option value="03">과장</option>
            					<option value="04">차장</option>
            					<option value="05">부장</option>
            					<option value="06">대표</option>
            				</select>
            				</div>
            			</div>
            			<div id="frmMiddle">
            				<input type="text" name="emp_address" placeholder="자택주소">
            				<input type="text" name="emp_nfc" placeholder="nfc">
            				<input type="button" value="NFC 읽기">
            			</div>
            			<div id="frmBottom">
            				<input type="submit" value="등록">
            				<input type="button" value="취소">
            			</div>
            		</form>
            	</div>  
            </div>
        </main>
    </div>
</body>
</html>