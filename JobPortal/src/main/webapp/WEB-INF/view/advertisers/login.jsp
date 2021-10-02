<jsp:include page="/WEB-INF/view/common/header.jsp" />


<div class="jumbotron text-center">
  <h1 style="color: info">Advertiser Login Form</h1>
</div>

<div class="container">
  <div class="row">
    <div class="col-sm-3"></div>
    <div class="col-sm-6" style="background-color:  #99ff99">
      <form action="/advertiser/login" method="POST">
	<label style="font-size: 25px">Your Email</label>
	<input type="email" name="email" class="form-control" placeholder="Enter your email"/> <br/>
	
	<label style="font-size: 25px">Password</label>
	<input type="text" name="password" class="form-control" placeholder="Enter your password" /> <br/>
	<button type="submit" value="Login" class="btn btn-primary">Login</button><br/>
	
		<h2 style="text-align:left;float:left;"><a href="/advertiser/create">Sign Up</a></h2>
		<h2 style="text-align:right;float:right;"><a href="/user/forgetform">Forget Password?</a></h2>
		<hr style="clear: both;"/>
     </form>
    </div>
    <div class="col-sm-3"></div>
  </div>
</div>
</body>
</html>