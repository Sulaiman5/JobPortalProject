<jsp:include page="/WEB-INF/view/common/header.jsp" />


<h1 align="center" style="color: fuchsia;">Advertiser create your account</h1>

<div class="container">
   <form action="/advertiser/save" method="POST">
   <div class="row">
    <div class="col-sm-3"></div>
    <div class="col-sm-6" style="background-color: #ddff99">
    
    <label>Advertiser code</label>
	<input type="text" name="adver_code" class="form-control" />
		
	<label>First Name</label>
	<input type="text" name="fname" class="form-control" />
	
	<label>Surname</label>
	<input type="text" name="surname" class="form-control" />
	
	<label>address</label>
	<input type="text" name="address" class="form-control" />
	
	<label>Email</label>
	<input type="text" name="email" class="form-control" />
	
	<label>Password</label>
	<input type="password" name="password" class="form-control" />
	
	<label>Company Name</label>
	<input type="text" name="comname" class="form-control" /><br/>
	
	<input type="submit" value="Save" class="btn btn-primary">
	<a href="/advertiser/loginpage" class="btn btn-primary btn-r btn-l nav-xhr">Login</a>
	</div>
    <div class="col-sm-3"></div>
  </div>
   </form>
</div>
</body>
</html>