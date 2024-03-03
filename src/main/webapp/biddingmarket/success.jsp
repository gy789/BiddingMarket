<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title> 支付成功</title>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="shortcut icon" href="<%=basePath%>biddingmarket/favicon.ico"> <link href="<%=basePath%>biddingmarket/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="<%=basePath%>biddingmarket/css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="<%=basePath%>biddingmarket/css/animate.css" rel="stylesheet">
    <link href="<%=basePath%>biddingmarket/css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">


    <div class="middle-box text-center animated fadeInDown">
        <h1>支付完成</h1>
        <h3 class="font-bold">谢谢你使用本系统</h3>

        <div class="error-desc">
            <br/>关闭当前继续使用系统
        </div>
    </div>

    <!-- 全局js -->
    <script src="<%=basePath%>biddingmarket/js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=basePath%>biddingmarket/js/bootstrap.min.js?v=3.3.6"></script>

    
    

</body>

</html>
