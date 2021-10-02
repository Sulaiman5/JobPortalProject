<jsp:include page="/WEB-INF/view/common/header.jsp" />

<fieldset style="border: double; color: green;">

  <h1 align="center">User Registration Form</h1>
  
<div class="container">
  <div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">
    
   <form action="/user/register" method="POST">	
	<label>Name</label>
	<input type="text" name="name" class="form-control" /> <br/>
	
	<label>Username</label>
	<input type="text" name="username" class="form-control" /> <br/>
	
	<label>Password</label>
	<input type="text" name="password" class="form-control" /> <br/>
	
	<input type="submit" value="Register" class="btn btn-primary">
   </form>
    </div>
    <div class="col-sm-4"></div>
  </div>
</div>
</fieldset>
</body>
</html>