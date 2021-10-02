<jsp:include page="/WEB-INF/view/common/header.jsp" />

<h1 style="text-align: center; color: green">Job seeker application form</h1><br/>
<div class="container">
    <form action="/jobseeker/update" method="POST">
    <input type="hidden" name="id" value="${j.id}"/>
    <div class="row">
    <div class="col-sm-1"></div>
    <div class="col-sm-2">
    <label >First Name</label>
    </div>
    <div class="col-sm-3">
	<input type="text" name="fname" value="${j.fname}" class="form-control" /> <br/>
	</div>
	<div class="col-sm-2">
    <label>Last Name</label>
    </div>
    <div class="col-sm-3">
	<input type="text" name="lname" value="${j.lname}" class="form-control" /> <br/>
   </div>
   <div class="col-sm-1"></div>
   </div>
     <div class="row">
    <div class="col-sm-1"></div>
    <div class="col-sm-2">
    <label >Present Address</label>
    </div>
    <div class="col-sm-3">
    <textarea  name="presentaddress"  class="form-control" name="${j.presentaddress}" rows="3" cols="3"></textarea><br/>
	</div>
	<div class="col-sm-2">
    <label>Permanent Address</label>
    </div>
    <div class="col-sm-3">
	 <textarea  name="permanentaddress"  class="form-control" name="${j.permanentaddress}" rows="3" cols="3"></textarea> <br/>
   </div>
   <div class="col-sm-1"></div>
   </div>
     <div class="row">
    <div class="col-sm-1"></div>
    <div class="col-sm-2">
    <label >NID</label>
    </div>
    <div class="col-sm-3">
	<input type="text" name="nid" class="form-control" value="${j.nid}" /> <br/>
	</div>
	<div class="col-sm-2">
    <label> Phone Number</label>
    </div>
    <div class="col-sm-3">
	<input type="text" name="number" class="form-control" value="${j.number}" /> <br/>
   </div>
   <div class="col-sm-1"></div>
   </div>
 	<div class="row">
    <div class="col-sm-1"></div>
    <div class="col-sm-2">
    <label >Email</label>
    </div>
    <div class="col-sm-3">
	<input type="email" name="email" class="form-control" value="${j.email}" /> <br/>
	</div>
	<div class="col-sm-2">
    <label> Password</label>
    </div>
    <div class="col-sm-3">
	<input type="password" name="password" class="form-control" value="${j.password}" /> <br/>
   </div>
   <div class="col-sm-1"></div>
   </div>
    <div class="row">
    <div class="col-sm-1"></div>
    <div class="col-sm-2">
    </div>
    <div class="col-sm-7">
     <input type="submit" value="Update" class="btn btn-primary">
	</div>
   <div class="col-sm-1"></div>
   </div>
   	
   </form>
</div>
</body>
</html>