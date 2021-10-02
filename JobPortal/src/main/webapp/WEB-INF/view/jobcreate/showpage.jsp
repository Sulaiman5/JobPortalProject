<jsp:include page="/WEB-INF/view/common/header.jsp" />



<h1 align="center" style="color: fuchsia;">Application the job</h1>

<div class="container">
	<div id="test">
		<input type="hidden" name="id" value="${c.id}"/>
	    <div class="row">
	    <div class="col-sm-2"></div>
	    <div class="col-sm-8">
	    <h1 style="color: maroon;">${c.jobtitle}</h1>
					<div class="icon-box">
						<h3>
						    <i class="ri-money-pound-box-line" style="color: #02a102;"> &nbsp; ${c.salary}</i>
						    <i class="ri-map-pin-line" style="color: #206120;">${c.joblocation}</i>
						</h3>
					</div>
			<h1>Job name</h1>
			    ${c.jobname}<br/><br/>
			
			<h1>Job Title</h1>
			    ${c.jobtitle}<br/><br/>
			
			<h1>Job Responsibilities</h1>
			    ${c.responsibilities}<br/><br/>
			
			<h1>Educational Requirements</h1>
			    ${c.educational}<br/><br/>
			
			<h1>Experience Requirements</h1>
			    ${c.experience}<br/><br/>
				
			<h1>Job Location</h1>
			    ${c.joblocation}<br/><br/>
			
			<h1>Salary</h1>
			    ${c.salary}<br/><br/>
			
			<h1>Job Seeker age</h1>
			    ${c.age}<br/><br/>
			<button id="apply">Apply now</button>
		</div>
	    <div class="col-sm-2"></div>
	</div>
  </div>

  <form action="/apply/save" method="POST">
  <div class="container" id="test2">
	 <div class="row">
	    <div class="col-sm-2"></div>
	    <div class="col-sm-8">
	        <input type="text" name="seeker_code" id="seeker_code" placeholder="Enter your id"/>
		    <button id="btnSearch" type="button">Search</button><br/>
		    <label>Job Seeker Information</label><br/>
		    
		 <div class="row"> 
		 <div class="col-sm-6">
		  <input type="text" name="fname" id="seeker_fname" class="form-control"/>
		 </div>
		 <div class="col-sm-6">
		 <input type="text" name="lname" id="seeker_lname"  class="form-control"/>
		 </div>
		 </div><br/>
		 <div class="row"> 
		 <div class="col-sm-6">
		  <input type="email" name="email" id="seeker_email" class="form-control"/>
		 </div>
		 <div class="col-sm-6">
		 <input type="text" name="nid" id="seeker_nid"   class="form-control"/>
		 </div>
		 </div>

		<h3>Job title</h3>
		<input type="text"  name="jobtitle" placeholder="Your job title or qualification" class="form-control"/>
		
		<h3>Your home location</h3>
		<input type="text" id="salary" name="location" placeholder="Your job location" class="form-control"/>
		
		<h3>Curriculum Vitae (CV)</h3>
		<input type="file" id="proposel" name="civi" placeholder="Enter Your CV" class="form-control"/> 
		
		<h3>Message to the recruiter:</h3>
		<textarea  name="proposel" rows="4" cols="50" class="form-control" > </textarea><br/>
		
		<button id="save" type="submit"> Apply </button>
		
		</div>
	    <div class="col-sm-2"></div>
	</div>

 </div>
  
 </form>

  
</div>
<script>
$("#test2").hide();
	$("#apply").click( () => {
		$("#test").hide();
		
		$('#test2').show();
	});
	

	$("#btnSearch").on("click", function(){
		$.ajax('/jobseeker/edit_seeker/'+ $("#seeker_code").val(), {
		    type: 'GET',  // http method
		    success: function (data, status) {
		    	console.log(data);
	
		    	$("#seeker_fname").val(data.fname);
		    	
		    	$("#seeker_lname").val(data.lname);
		    	
		    	$("#seeker_email").val(data.email);
		    	
		    	$("#seeker_code").val(data.seeker_code);
		    	
		    	$("#seeker_nid").val(data.nid);
		    }
		});
	})
	

</script>
</body>
</html>