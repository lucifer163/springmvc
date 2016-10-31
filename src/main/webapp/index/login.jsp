<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<LINK rel="Bookmark" href="/favicon.ico">
<LINK rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="js/html5.js"></script>
<script type="text/javascript" src="js/respond.min.js"></script>
<script type="text/javascript" src="js/PIE_IE678.js"></script>
<![endif]-->
<link href="../public/css/H-ui.css" rel="stylesheet" type="text/css" />
<link href="../public/css/H-ui.login.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="js/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>hehe</title>
</head>
<body>
	<input type="hidden" id="TenantId" name="TenantId" value="" />
	<div class="header"></div>
	<div class="loginWraper">
		<div id="loginform" class="loginBox">
			<form action="index.html" method="post">
				<div class="formRow user">
					<input id="" name="" type="text" placeholder="账户"
						class="input_text input-big">
				</div>
				<div class="formRow password">
					<input id="" name="" type="password" placeholder="密码"
						class="input_text input-big">
				</div>
				<div class="formRow">
					<label for="online"> <input type="checkbox" name="online"
						id="online" value=""> 使我保持登录状态
					</label>
				</div>
				<div class="formRow">
					<input name="" type="submit" class="btn radius btn-success btn-big"
						value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;"> <input
						name="" type="reset" class="btn radius btn-default btn-big"
						value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
				</div>
			</form>
		</div>
	</div>
	<div class="footer">V2.0</div>
	<script type="text/javascript" src="../public/js/jquery.min.js"></script>
	<script type="text/javascript" src="../public/js/H-ui.js"></script>

</body>
</html>