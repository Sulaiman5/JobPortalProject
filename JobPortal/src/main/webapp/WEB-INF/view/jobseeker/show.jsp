<jsp:include page="/WEB-INF/view/common/header.jsp" />

  <!-- Content Wrapper. Contains page content -->
  <div class="container">
    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-12">
          <div class="card">
            <div class="card-header">
				<h1 style="color:#7B68EE">Total job seeker account</h1>
            </div>
            <!-- /.card-header -->
            <div class="card-body">
              <table id="example2" class="table table-bordered table-hover">
                <thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Present Address</th>
						<th>Permanent Address</th>
						<th>NID</th>
						<th>Phone Number</th>
						<th>Email</th>
						<th>Password</th>
						<th>Approve</th>
						<th>Delete</th>
					</tr>
                </thead>
                <tbody>
					<c:forEach items="${jobseeker}" var="t">
						<tr>
							<td>${t.fname}</td>
							<td>${t.lname}</td>
							<td>${t.presentaddress}</td>
							<td>${t.permanentaddress}</td>
							<td>${t.nid}</td>
							<td>${t.number}</td>
							<td>${t.email}</td>
							<td>${t.password}</td>
							<td><a href="/jobseeker/edit/${t.id}">Approve</a></td>
							<td><a href="/jobseeker/delete/${t.id}">Delete</a></td>
						</tr>
		            </c:forEach>
                </tbody>
                <tfoot>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Present Address</th>
						<th>Permanent Address</th>
						<th>NID</th>
						<th>Phone Number</th>
						<th>Email</th>
						<th>Password</th>
						<th>Approve</th>
						<th>Delete</th>
					</tr>
                </tfoot>
              </table>
            </div>
            <!-- /.card-body -->
          </div>
          <!-- /.card -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="float-right d-none d-sm-block">
      <b>Version</b> 3.0.0-rc.5
    </div>
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="/app-assets/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="/app-assets/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- DataTables -->
<script src="/app-assets/plugins/datatables/jquery.dataTables.js"></script>
<script src="/app-assets/plugins/datatables-bs4/js/dataTables.bootstrap4.js"></script>
<!-- AdminLTE App -->
<script src="/app-assets/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="/app-assets/dist/js/demo.js"></script>
<!-- page script -->
<script>
  $(function () {
    $("#example1").DataTable();
    $('#example2').DataTable({
      "paging": true,
      "lengthChange": true,
      "searching": false,
      "ordering": true,
      "info": true,
      "autoWidth": false,
    });
  });
</script>
</body>
</html>
