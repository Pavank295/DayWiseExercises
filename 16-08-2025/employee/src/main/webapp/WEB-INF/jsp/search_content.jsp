<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<h3>Search Employee</h3>
<form method="get" action="${pageContext.request.contextPath}/employees/search">
  <div>
    <input type="number" name="id" placeholder="Search by ID"/>
    <button type="submit">Find by ID</button>
  </div>
</form>
<form method="get" action="${pageContext.request.contextPath}/employees/search">
  <div>
    <input type="text" name="name" placeholder="Search by Name"/>
    <button type="submit">Find by Name</button>
  </div>
</form>
