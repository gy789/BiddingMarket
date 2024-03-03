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


    <title> - 招标公告</title>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="shortcut icon" href="favicon.ico"> <link href="<%=basePath%>biddingmarket/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="<%=basePath%>biddingmarket/css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="<%=basePath%>biddingmarket/css/animate.css" rel="stylesheet">
    <link href="<%=basePath%>biddingmarket/css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-4">
                <div class="ibox">
                    <div class="ibox-title">
                        <span class="label label-primary pull-right">NEW</span>
                        <h5>IT-01 - 设计部</h5>
                    </div>
                    <div class="ibox-content">
                        <div class="team-members">
                            <a href="#"><img alt="member" class="img-circle" src="img/a1.jpg">
                            </a>
                            <a href="#"><img alt="member" class="img-circle" src="img/a2.jpg">
                            </a>
                            <a href="#"><img alt="member" class="img-circle" src="img/a3.jpg">
                            </a>
                            <a href="#"><img alt="member" class="img-circle" src="img/a5.jpg">
                            </a>
                            <a href="#"><img alt="member" class="img-circle" src="img/a6.jpg">
                            </a>
                        </div>
                        <h4>部门简介</h4>
                        <p>
                            平面设计（graphic design），也称为视觉传达设计，是以“视觉”作为沟通和表现的方式，透过多种方式来创造和结合符号、图片和文字，借此作出用来传达想法或讯息的视觉表现。
                        </p>
                        <div>
                            <span>当前项目进度：</span>
                            <div class="stat-percent">48%</div>
                            <div class="progress progress-mini">
                                <div style="width: 48%;" class="progress-bar"></div>
                            </div>
                        </div>
                        <div class="row  m-t-sm">
                            <div class="col-sm-4">
                                <div class="font-bold">项目</div>
                                12
                            </div>
                            <div class="col-sm-4">
                                <div class="font-bold">周期</div>
                                4个月
                            </div>
                            <div class="col-sm-4 text-right">
                                <div class="font-bold">预算</div>
                                &yen;200,913 <i class="fa fa-level-up text-navy"></i>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>


    </div>
    <!-- 全局js -->
    <script src="<%=basePath%>biddingmarket/js/jquery.min.js?v=2.1.4"></script>
    <script src="<%=basePath%>biddingmarket/js/bootstrap.min.js?v=3.3.6"></script>



    <!-- 自定义js -->
    <script src="<%=basePath%>biddingmarket/js/content.js?v=1.0.0"></script>


    
    

</body>

</html>
