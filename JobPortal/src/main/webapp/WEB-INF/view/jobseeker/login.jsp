<jsp:include page="/WEB-INF/view/common/header.jsp" />

<div class="jumbotron text-center">
  <h1 style="color: green">Job Seeker Login Form</h1>
</div><br/>

<div class="container">
  <div class="row">
    <div class="col-sm-3"></div>
    <div class="col-sm-6" style="background-color: #b3ffb3">
    
    <form action="/jobseeker/login" method="POST">
	<label> <h4>Your Email</h4> </label>
	<input type="email" name="email" placeholder="Enter your email" required="required"  class="form-control"/> <br/>
	
	<label><h4>Password</h4></label>
	<input type="password" name="password" placeholder="Enter your password" required="required"  class="form-control"/> <br/>
	<button type="submit" value="Login" class="btn btn-primary">Login</button><br/>
	
	<h2 style="text-align:left;float:left;"><a href="/jobseeker/create">Sign Up</a></h2>
	<h2 style="text-align:right;float:right;"><a href="/jobseeker/forgetform">Forget Password?</a></h2>
	<hr style="clear: both;"/>
     </form>
    </div>
    <div class="col-sm-3"></div>
  </div>
</div>
</body>
</html>