<%@ include file="/header.jsp" %>
<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>
        <a href="/user/list" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
            <i class="fas fa-download fa-sm text-white-50"></i> User list</a>
    </div>
    <div>
        <div class="card shadow mb-4">
            <!-- Card Header - Dropdown -->
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Add user</h6>
            </div>
            <div class="card-body">
                <form method="post">
                    <div class="form-group">
                        <label for="userName">Name</label>
                        <input name="userName" type="text" class="form-control" id="userName" placeholder="User name">
                    </div>
                    <div class="form-group">
                        <label for="userEmail">Email</label>
                        <input name="userEmail" type="email" class="form-control" id="userEmail" placeholder="User email">
                    </div>
                    <div class="form-group">
                        <label for="userPassword">Password</label>
                        <input name="userPassword" type="password" class="form-control" id="userPassword" placeholder="User password">
                    </div>

                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <div id="dataTable_wrapper" class="dataTables_wrapper dt-bootstrap4">
                        <div class="row">
                            <div class="col-sm-12">
                                <div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /.container-fluid -->


<%@ include file="/footer.jsp" %>