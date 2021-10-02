<jsp:include page="/WEB-INF/view/common/header.jsp" />

   <h1>Login</h1>
   	 <form action="/login" method="post">
		<fieldset class="form-group position-relative has-icon-left mb-1">
			<input type="text" class="form-control form-control-lg input-lg" id="username" name="username" placeholder="User Name">
			<div class="form-control-position">
			    <i class="icon-head"></i>
			</div>
		</fieldset>
		<fieldset class="form-group position-relative has-icon-left">
			<input type="password" class="form-control form-control-lg input-lg" id="password" name="password" placeholder="Enter Password" required>
			<div class="form-control-position">
			    <i class="icon-key3"></i>
			</div>
		</fieldset>
		<div style="text-align: center;">
		  <input type="submit" value="Login" />
	    </div>     
	</form>
  </body>
</html>