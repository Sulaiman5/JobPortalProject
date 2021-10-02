<jsp:include page="/WEB-INF/view/common/header.jsp" />

<div class="" id="test">
<h1 style="text-align: center;">Look at your phone and enter the OTP number here</h1>
<form action="/payment/paymentsave1" method="POST">
 <div class="row">
    <div class="col-sm-3"></div>
    <div class="col-sm-6" style="background-color: window;">
	   <input type="hidden" name="id" value="${b.id}"/>
	   <input type="text" name="otpnumber" class="form-control" required="required"/><br>
	   <input type="submit" id="apply" value="submit"/>
	</div>
    <div class="col-sm-3"></div>
  </div>
</form>
</div>


<div id="test2">
<h1 style="text-align: center;">Your payment successful</h1>
<h4 style="text-align: center;">Your post has been activated by accepting your payment</h4>
</div>

<script type="text/javascript">
$("#test2").hide();
$("#apply").click( () => {
	$("#test").hide();

	$('#test2').show();
});
</script>
</body>
</html>