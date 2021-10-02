<jsp:include page="/WEB-INF/view/common/header.jsp" />

<h1 align="center">Advertiser's Ad Payment</h1>
<div class="container">
   <form action="/payment/paymentsave" method="POST">
   <input type="hidden" name="id" value="${b.id}"/>
   <div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4" style="background-color: aqua;">
       <label><h4>Advertiser name</h4></label>
	  	<select class="form-control select2" name="adver_code" id="adver_code" style="width: 100%;">
		<c:forEach items="${advertiser}" var="dd">
			<option value="${dd.code}">${dd.email}</option>
		</c:forEach>
		</select>
	<input type="hidden" name="adver_email" id="adver_email"/>
	
	 <label class="form-label"><h4>Payment Method:</h4> </label> 
		<select class="form-control" name="payment" onchange="myFunction()">
			<option value="Cash">Cash</option>
			<option value="BKash">BKash</option>
			<option value="VISA">VISA</option>
			<option value="PayPal">PayPal</option>
			<option value="MasterCard">MasterCard</option>
			<option value="AmericanExpress">AmericanExpress</option>
		</select>
		<div id="transactionField">
		<label><h4>Transaction ID:</h4></label> 
		 <input type="text" class="form-control" name="transactionid"/>
	  </div>
	<label><h4>Adver fee</h4></label>
	<input type="text"  class="form-control" name="fee"/><br/>
	
	<input type="submit" value="SubmitPayment" class="btn btn-primary"/>
	</div>
    <div class="col-sm-4"></div>
  </div>
  </form>
</div>

<script type="text/javascript">
	$("#adver_email").val($("#adver_code :selected").text());
	$("#$adver_code").on("change", function(){
	$("#adver_email").val($("#adver_code :selected").text());
})

</script>
<script type="text/javascript">
	//hide
	document.getElementById("transactionField").style.display = 'none';

	//show
	function myFunction() {

		document.getElementById("transactionField").style.display = '';
		var  checkBox = document.getElementById("checkId");
		 if (checkBox.checked == true) {
		 document.getElementById("passDiv").style.display = '';
		 }else{
		 document.getElementById("passDiv").style.display = 'none'; 
		 }
	}
</script>

</body>
</html>
