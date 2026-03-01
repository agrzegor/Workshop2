<%@ include file="/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

  <!-- Page Heading -->
  <div class="text-center mt-5">
    <div class="error mx-auto" data-text="Error">Error</div>
    <p class="lead text-gray-800 mb-4">Something Went Wrong</p>
    <p class="text-gray-500 mb-5">
      ${sessionScope.get("errorMessage")} != null ? ${sessionScope.get("errorMessage")}
      : "An unexpected error has occurred. Please try again later."}
    </p>
    <a href="/user/list" class="btn btn-primary">
      <i class="fas fa-home"></i> Back to Home
    </a>
  </div>

</div>
<!-- /.container-fluid -->

<%@ include file="/footer.jsp" %>