<jsp:include page="/WEB-INF/view/common/header.jsp" />

<body>
<div class="jumbotron text-center">
  <h1>User Login Form</h1>
</div>

<div class="container">
  <div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">
      <form action="/user/login" method="POST">	
	<label>Username</label>
	<input type="text" name="username" class="form-control" /> <br/>
	
	<label>Password</label>
	<input type="text" name="password" class="form-control" /> <br/>
	
	<input type="submit" value="Login" class="btn btn-primary">
		<h2><a href="/user/forgetform">Forget Password?</a></h2>
		<h2 align="left"><a href="/user/registerpage">Sign Up</a></h2>
     </form>
    </div>
    <div class="col-sm-4"></div>
  </div>
</div>
</body>
</html>