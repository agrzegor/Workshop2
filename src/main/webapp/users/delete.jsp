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
            </div>
            <div class="container py-5">
                <div class="row justify-content-center">
                    <div class="col-md-6 col-lg-5">

                        <div class="card shadow-sm border-0">
                            <div class="card-body text-center p-4">

                                <div class="mb-4">
                                    <div class="display-6 text-danger">
                                    </div>
                                    <h4 class="mt-2">Confirm User Deletion</h4>
                                    <p class="text-muted small">
                                        This action cannot be undone.
                                    </p>
                                </div>

                                <!-- Example User Info -->
                                <div class="bg-light rounded p-3 mb-4 text-start">
                                    <strong>User Details:</strong>
                                    <hr>
                                    <p class="mb-1"><strong>Name:</strong>${user.userName}</p>
                                    <p class="mb-1"><strong>Email:</strong> ${user.email}</p>
                                </div>
                                <div class="row">
                                    <div class="col-6 pe-1">
                                        <a href="/user/list" class="btn btn-outline-secondary w-100">
                                            Cancel
                                        </a>
                                    </div>

                                    <div class="col-6 ps-1">
                                        <form action="/user/delete?id=${user.id}" method="post">
                                            <button type="submit" class="btn btn-danger w-100">
                                                Delete User
                                            </button>
                                        </form>
                                    </div>
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