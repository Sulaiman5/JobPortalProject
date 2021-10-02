<jsp:include page="/WEB-INF/view/common/header.jsp" />

	
<h1 style="text-align: center; color: green">Job seeker application form</h1><br/>
<div class="container">
    <form action="/jobseeker/save" method="POST">
    <div class="row">
    <div class="col-sm-1"></div>
    <div class="col-sm-2">
    <label >First Name</label>
    </div>
    <div class="col-sm-3">
	<input type="text" name="fname" class="form-control" /> <br/>
	</div>
	<div class="col-sm-2">
    <label>Last Name</label>
    </div>
    <div class="col-sm-3">
	<input type="text" name="lname" class="form-control" /> <br/>
   </div>
   <div class="col-sm-1"></div>
   </div>
     <div class="row">
    <div class="col-sm-1"></div>
    <div class="col-sm-2">
    <label >Present Address</label>
    </div>
    <div class="col-sm-3">
    <textarea  name="presentaddress"  class="form-control"  rows="3" cols="3"></textarea><br/>
	</div>
	<div class="col-sm-2">
    <label>Permanent Address</label>
    </div>
    <div class="col-sm-3">
	 <textarea  name="permanentaddress"  class="form-control"  rows="3" cols="3"></textarea> <br/>
   </div>
   <div class="col-sm-1"></div>
   </div>
     <div class="row">
    <div class="col-sm-1"></div>
    <div class="col-sm-2">
    <label >NID</label>
    </div>
    <div class="col-sm-3">
	<input type="text" name="nid" class="form-control" /> <br/>
	</div>
	<div class="col-sm-2">
    <label> Phone Number</label>
    </div>
    <div class="col-sm-3">
	<input type="text" name="number" class="form-control" /> <br/>
   </div>
   <div class="col-sm-1"></div>
   </div>
 	<div class="row">
    <div class="col-sm-1"></div>
    <div class="col-sm-2">
    <label >Email</label>
    </div>
    <div class="col-sm-3">
	<input type="email" name="email" class="form-control" /> <br/>
	</div>
	<div class="col-sm-2">
    <label> Password</label>
    </div>
    <div class="col-sm-3">
	<input type="password" name="password" class="form-control" /> <br/>
   </div>
   <div class="col-sm-1"></div>
   </div>
    <div class="row">
    <div class="col-sm-1"></div>
    <div class="col-sm-2">
   <label>Job seeker code</label>
    </div>
    <div class="col-sm-3" >
    <input type="text" name="seeker_code" class="form-control" />
    </div>
    <div class="col-sm-2">
    <input type="submit" value="Register" class="btn btn-primary">
	</div>
	<div class="col-sm-3">
	<a href="/jobseeker/loginpage"><b style="color: green">Login</b></a>
	</div>
   <div class="col-sm-1"></div>
   </div>
   	
   </form>
</div>
</body>
</html>