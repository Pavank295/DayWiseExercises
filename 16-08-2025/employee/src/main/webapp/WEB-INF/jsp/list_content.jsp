<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<form method="get" action="${pageContext.request.contextPath}/employees/list">
  <input type="text" name="q" placeholder="Search by name" value="${q}"/>
  <button type="submit">Search</button>
  <a class="right" href="${pageContext.request.contextPath}/employees/new">+ Add Employee</a>
</form>

<table role="grid">
  <thead>
  <tr>
    <th>ID</th><th>Name</th><th>Email</th><th>Type</th><th>Dept</th><th>Actions</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="e" items="${employees}">
    <tr>
      <td>${e.id}</td>
      <td>${e.name}</td>
      <td>${e.email}</td>
      <td>${e.employmentType}</td>
      <td><c:out value="${e.department != null ? e.department.name : '-'}"/></td>
      <td>
        <a href="${pageContext.request.contextPath}/employees/edit/${e.id}">Edit</a> |
        <a href="${pageContext.request.contextPath}/employees/delete/${e.id}"
           onclick="return confirm('Delete employee ${e.name}?')">Delete</a>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>

<c:if test="${empty employees}">
  <p>No employees yet. <a href="${pageContext.request.contextPath}/employees/new">Create one</a>.</p>
</c:if>
