<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta http-equiv="Expires" content="0"><meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Cache-Control" content="no-store">
<link rel="icon" type="image/ico" href="/xiaoyu/img/favicon.ico">
<link href="/bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet" >
<link href="/jBox-0.3.2/jBox.css" rel="stylesheet">
<link rel="stylesheet" href="/stephanwagner/97f7f8-00a5dd.css">
<script src="/jquery/jquery-1.12.2.min.js" type="text/javascript"></script>
<script src="/jBox-0.3.2/jBox.min.js" type="text/javascript"></script>
<script src="/bootstrap-3.3.6-dist/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript" src="/xiaoyu/common.js"></script>
</head>
<script type="text/javascript">
</script>
<body>
	<div class="header">
		<div class="container">
			<div class="span-10">
				<span><a class="header_w" href="/xiaoyu/xiaoyu.me.html">首页</a></span>
			</div>
			<!-- <div class="prepend-10 span-4 last" style="text-align: right;">
				<a class="header_w" style="padding-right: 15px;"
					href="#">注册</a> <a class="header_w"
					style="padding-right: 0px;" href="/html/app/webLogin.html">登录</a>
			</div> -->
		</div>
	</div>
	<div class="content">
<div class="panel panel-default">
   <div class="panel-heading">${user.nickName}</div>
      <div class="panel-body">
		<img alt="" src="${user.img}" class="img-circle" height="100px" width="100px">
   	  </div>
   	  <div class="panel-body">
		<%= session("user") %>
   	  </div>
   <ul class="list-group">
      <li class="list-group-item"></li>
   </ul>
</div>
	</div>
	<div class="footer container">
</div>
	<div class="footer container">
		<hr class="hr-10">
		<div class="copyright span-5 append-9">
			©2016-20xx 小雨 <a href="#">xiaoyu.me</a>
		</div>
		<div class="span-2 last">
			<a href="#">关于ME</a>
		</div>
	</div>

</body>

</html>