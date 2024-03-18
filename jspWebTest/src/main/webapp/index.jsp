<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String cmd=request.getParameter("cmd");
if(cmd!=null){
	switch(cmd){
	case "left":
		out.println("왼쪽이동");
		break;
	case "right":
		out.println("오른쪽이동");
		break;
	case "up":
		out.println("위로이동");
		break;
	case "down":
		out.println("아래로이동");
		break;
	case "skill1":
		out.println("스킬1발동");
		break;
	case "skill2":
		out.println("스킬2발동");
		break;
	case "skill3":
		out.println("스킬3발동");
		break;
	}
	
}

%>
<a href="index.jsp?cmd=left">좌</a>
<a href="index.jsp?cmd=right">우</a>
<a href="index.jsp?cmd=up">위</a>
<a href="index.jsp?cmd=down">아래</a>
<a href="index.jsp?cmd=skill1">기술1</a>
<a href="index.jsp?cmd=skill2">기술2</a>
<a href="index.jsp?cmd=skill3">기술3</a>


</body>
</html>