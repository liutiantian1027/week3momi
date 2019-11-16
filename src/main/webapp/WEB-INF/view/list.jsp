<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--  <link href="/resource/bootstrap/css/bootstrap.css" rel="stylesheet">  
 <script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script> 
 <script type="text/javascript" src="/resource/bootstrap/js/bootstrap.js"></script> -->
 <link rel="stylesheet" href="css/index3.css">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
</head>
<body>
<form action="list.do" method="post">
	按规模<input type="text" name="name">
	按类型<input type="text" name="tname">
	<input type="submit" value="查询">
</form>
<table>
	<tr>
		<td>公司名称</td>
		<td>营业执照号</td>
		<td>法人代表</td>
		<td>注册资金</td>
		<td>公司类型</td>
		<td>成立日期</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${info.list }" var="c">
	<tr>
		<td>${c.name }</td>
		<td>${c.regist_no }</td>
		<td>${c.corporation }</td>
		<td>${c.capital }</td>
		<td>${c.tid }</td>
		<td>${c.created }</td>
		<td>操作</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="10">
			当前页${info.pageNum }/${info.pages },共${info.total }条数据
			<a href="list.do?pageNum=1">首页</a>
			<a href="list.do?pageNum=${info.prePage }">上一页</a>
			<a href="list.do?pageNum=${info.nextPage }">下一页</a>
			<a href="list.do?pageNum=${info.pages }">尾页</a>
		</td>
	</tr>
</table>
</body>
</html>