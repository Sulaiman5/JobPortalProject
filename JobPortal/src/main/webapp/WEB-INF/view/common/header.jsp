<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Job Sector</title>
</head>
<body>

<header id="header" class="fixed-top d-flex align-items-center" style="background-color: #ccffcc">
    <div class="container d-flex align-items-center justify-content-between">
      <div>
      <marquee direction="up" scrolldelay="150" onmouseover="wait()">
		<div class="small"><h1 style="color: green"><b>Job Sector</b></h1></div>
		</marquee>
      </div>
      <nav id="navbar" class="navbar" style="font-size: 22px;">
       
          <a class="nav-link scrollto active" href="/createJob/show">Home</a>
          <a class="nav-link scrollto" href="/advertiser/create">Advertiser</a>
          <a class="nav-link scrollto"  href="/jobseeker/create">Job Seeker</a>
          <a class="nav-link scrollto" href="/createJob/show">Job application</a>
          <a class="nav-link scrollto" href="/user/loginpage">Login</a>
          <a class="nav-link scrollto" href="#contact">Contact</a>
          <a class="nav-link scrollto" href="/logout">Logout</a>
      </nav><!-- .navbar -->
    </div>
  </header><!-- End Header --><br/><br/><br/>