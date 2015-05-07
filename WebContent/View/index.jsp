<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" 
import = "com.sds.icto.guestbook.vo.GuestBookVO, java.util.*" %>
<% 

List<GuestBookVO> list = (List<GuestBookVO>)request.getAttribute("list");

%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form action="" method="post">
	

	<table border=1 width=500>
		<tr>
			<td>이름</td><td><input type="text" name="name"></td>
			<td>비밀번호</td><td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td colspan=4><textarea name="message" cols=60 rows=5></textarea></td>
		</tr>
		<tr>
			<td colspan=4 align=right>
			<input type = "hidden" name = "a" value = "insert" />
			<input type="submit" VALUE=" 확인 "></td>
		</tr>
	</table>
	</form>
	<br>
		<%for(GuestBookVO vo : list){ %>
	<table width=510 border=1>
		<tr>
			<td>[<%=vo.getNo() %>]</td>
			<td><%=vo.getName() %></td>
			<td><%=vo.getReg_date() %></td>
			<td><a href="/GuestBook2/View/deleteform.jsp?no=<%=vo.getNo()%>">삭제</a></td>
		</tr>
		<tr>
			<td colspan=4><%=vo.getMessage() %></td>
		</tr>
	</table>
	<br>
	<% } %>
</body>
</html>