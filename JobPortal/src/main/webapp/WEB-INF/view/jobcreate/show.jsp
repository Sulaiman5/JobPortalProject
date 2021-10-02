<jsp:include page="/WEB-INF/view/common/header.jsp" />
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<h1 align="center" style="color: fuchsia;">Application for the job</h1>

<div class="container">
  <div class="row">
	<div class="col-md-1"></div>
	 <div class="col-md-10">
	 
		 <c:forEach items="${createJob}" var="c">
		 <div class="container" style="background-color: #F0F8FF;"> 
			
			<a href="/createJob/edit/${c.id}">

			   <h1>${c.jobtitle} </h1></a>
				<div style="color:black">
					<div class="icon-box">
						<h3>
						    <i class="ri-money-pound-box-line" style="color: #02a102;"> &nbsp; ${c.salary}</i>
						</h3>
					</div>
					<div class="icon-box">
						<h3>
						    <i class="ri-map-pin-line" style="color: #206120;">${c.joblocation}</i>
						</h3>
					</div><br/> 
					<h4><b>Job Responsibilities</b></h4>
				  	    ${c.responsibilities} <br/><br/> 
					
					<h4><b>Educational Requirements</b></h4>
					    ${c.educational}<br/> <br/> </div>
				<hr/>
				</div>
				<hr/>
				
		</c:forEach>
		</div>
    <div class="col-md-1"></div>
    </div>
</div>
</body>
</html>