<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>新增用户页面</title>
</head>
<body>
	<div style="margin: 0 auto; width: 400px;">
		<form action="<%=basePath%>user" method="post">
			<!--此隐藏域可以被HiddenHttpMethodFilter所处理，然后分发到不同的HttpMethod的处理器上-->
			<input type="hidden" name="_method" value="put" />
			<table>
				<tr>
					<th>用户ID</th>
					<th>用户名称</th>
				</tr>
				<tr>
					<td><input type="text" name="userId" id="userId"
						value="${user.userId }" readonly="readonly" /></td>
					<td><input type="text" name="userName" id="userName"
						value="${user.userName }" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="保存用户" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>