<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

	request.setCharacterEncoding("utf-8");

	//이메일을 등록합니다.
	//인서트 끝났는데 결과 쟤한테 알아왕

	String no = request.getParameter("no");
	%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form method="post" action="/GuestBook2/GB?a=delete">
	<input type='hidden' name="no" value="<%=no%>">
	<table>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="password"></td>
			<td><input type="submit" value="확인"></td>
			
			<td><a href="/GuestBook2/GB">메인으로 돌아가기</a></td>
		</tr>
	</table>
	</form>
</body>
</html>