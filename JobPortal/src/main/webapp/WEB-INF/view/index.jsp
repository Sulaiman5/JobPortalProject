<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/view/common/header.jsp" />
<h1 align="center" style="color: fuchsia;">Application for the job</h1>

<div class="container">
  <div class="row">
	<div class="col-md-1"></div>
	 <div class="col-md-10">
	 
		 <c:forEach items="${createJob}" var="c">
		 <div class="container" style="background-color: #F0F8FF;"> 
			
			<a href="/createJob/edit/${c.id}"><h1>${c.jobtitle} </h1></a>
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
	
	<!-- ======= Contact Section ======= -->
	<section id="contact" class="contact">
		<div class="container">

			<div class="section-title" data-aos="fade-up">
				<h2>Contact Us</h2>
			</div>

			<div class="row">

				<div class="col-lg-4 col-md-6" data-aos="fade-up"
					data-aos-delay="100">
					<div class="contact-about">
						<h3>Job portal</h3>
						<p>Cras fermentum odio eu feugiat. Justo eget magna fermentum
							iaculis eu non diam phasellus.</p>
						<div class="social-links">
							<a href="#" class="twitter"><i class="bi bi-twitter"></i></a> <a
								href="#" class="facebook"><i class="bi bi-facebook"></i></a> <a
								href="#" class="instagram"><i class="bi bi-instagram"></i></a> <a
								href="#" class="linkedin"><i class="bi bi-linkedin"></i></a>
						</div>
					</div>
				</div>

				<div class="col-lg-3 col-md-6 mt-4 mt-md-0" data-aos="fade-up"
					data-aos-delay="200">
					<div class="info">
						<div>
							<i class="ri-map-pin-line"></i>
							<p>
								A108 Adam Street<br>Gendaria, Dhaka-1100
							</p>
						</div>

						<div>
							<i class="ri-mail-send-line"></i>
							<p>info@example.com</p>
						</div>

						<div>
							<i class="ri-phone-line"></i>
							<p>+1 5589 55488 55s</p>
						</div>

					</div>
				</div>

				<div class="col-lg-5 col-md-12" data-aos="fade-up"
					data-aos-delay="300">
					<form action="forms/contact.php" method="post" role="form"
						class="php-email-form">
						<div class="form-group">
							<input type="text" name="name" class="form-control" id="name"
								placeholder="Your Name" required>
						</div>
						<div class="form-group">
							<input type="email" class="form-control" name="email" id="email"
								placeholder="Your Email" required>
						</div>
						<div class="form-group">
							<input type="text" class="form-control" name="subject"
								id="subject" placeholder="Subject" required>
						</div>
						<div class="form-group">
							<textarea class="form-control" name="message" rows="5"
								placeholder="Message" required></textarea>
						</div>
						<div class="my-3">
							<div class="loading">Loading</div>
							<div class="error-message"></div>
							<div class="sent-message">Your message has been sent. Thank
								you!</div>
						</div>
						<div class="text-center">
							<button type="submit">Send Message</button>
						</div>
					</form>
				</div>

			</div>

		</div>
	</section>
	<!-- End Contact Section -->

</main>
<!-- End #main -->
<jsp:include page="/WEB-INF/view/common/footer.jsp" />