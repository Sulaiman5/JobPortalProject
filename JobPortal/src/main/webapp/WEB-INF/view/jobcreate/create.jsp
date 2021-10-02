<jsp:include page="/WEB-INF/view/common/header.jsp" />

  <nav style="font-size: 35px; text-align: center;">
   <a href="/createJob/create" class="btn btn-primary"><h1>Job create</h1></a>
   <a href="/payment/payment" class="btn btn-primary"><h1>Payment</h1></a>
  </nav>

<h1 align="center" style="color: fuchsia;"> Create your advertis</h1>

<div class="container">
   <form action="/createJob/save" method="POST">
   <div class="row">
    <div class="col-sm-3"></div>
    <div class="col-sm-6" style="background-color: window;">

    <label>Advertiser name</label>
	  	<select class="form-control select2" name="adver_code" id="adver_code" style="width: 100%;">
		<c:forEach items="${advertiser}" var="dd">
			<option value="${dd.code}">${dd.fname}</option>
		</c:forEach>
		</select>
	  <input type="hidden" name="adver_name" id="adver_name"/>
	<label>Job code</label>
	<input type="text" name="create_code" class="form-control" />
	
	<label>Job name</label>
	<input type="text" name="jobname" class="form-control" />
	
	<label>Job Title</label>
	<input type="text" name="jobtitle" class="form-control" />
	
	<label>Job Responsibilities</label>
	<input type="text" name="responsibilities" class="form-control" />
	
	<label>Educational Requirements</label>
	<input type="text" name="educational" class="form-control" />
	
	<label>Experience Requirements</label>
	<input type="text" name="experience" class="form-control" />
	
	<label>Job Seeker age</label>
	<input type="text" name="age" class="form-control" />
	
	<label>Job Location</label>
	<input type="text" name="joblocation" class="form-control" />
	
	<label>Salary</label>
	<input type="text" name="salary" class="form-control" /><br/>

	<input type="submit" value="Save" class="btn btn-primary">
	</div>
    <div class="col-sm-3"></div>
  </div>
   </form>
</div>

<script type="text/javascript">
$("#adver_name").val($("#adver_code :selected").text());
$("#$adver_code").on("change", function(){
	$("#adver_name").val($("#adver_code :selected").text());
})

</script>
</body>
</html>