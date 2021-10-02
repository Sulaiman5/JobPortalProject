<jsp:include page="/WEB-INF/view/common/header.jsp" />

<h1 align="center">Advertiser account create form</h1>
<div class="container">
   <form action="/advertiser/update" method="POST">
   <input type="hidden" name="id" value="${b.id}"/>
   <div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4" style="background-color: aqua;">	
	<label>First Name</label>
	<input type="text" name="fname" class="form-control" value="${b.fname}"/>
	
	<label>Surname</label>
	<input type="text" name="surname" class="form-control" value="${b.surname}" />
	
	<label>address</label>
	<input type="text" name="address" class="form-control" value="${b.address}"/>
	
	<label>Email</label>
	<input type="text" name="email" class="form-control" value="${b.email}"/>
	
	<label>Password</label>
	<input type="password" name="password" class="form-control" value="${b.password}" />
	
	<label>Company Name</label>
	<input type="text" name="comname" class="form-control" value="${b.comname}"/><br/>
	
	<input type="submit" value="update" class="btn btn-primary">
	</div>
    <div class="col-sm-4"></div>
  </div>
   </form>
</div>
</body>
</html>