<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="isEdit" value="${employee.id != null}"/>
<h3><c:out value="${isEdit ? 'Edit' : 'Add'}"/> Employee</h3>

<form:form modelAttribute="employee"
           method="post"
           action="${pageContext.request.contextPath}/employees/${isEdit ? 'update/' += employee.id : 'save'}">
  <article>
    <label>Name
      <form:input path="name" />
      <form:errors path="name" cssClass="error"/>
    </label>

    <label>Email
      <form:input path="email"/>
      <form:errors path="email" cssClass="error"/>
    </label>

    <label>Salary
      <form:input path="salary" type="number" step="0.01"/>
      <form:errors path="salary" cssClass="error"/>
    </label>

    <label>Employment Type
      <form:select path="employmentType">
        <form:options items="${employmentTypes}"/>
      </form:select>
    </label>

    <label>Department
      <select name="departmentId">
        <option value="">-- none --</option>
        <c:forEach var="d" items="${departments}">
          <option value="${d.id}" <c:if test="${employee.department != null && employee.department.id == d.id}">selected</c:if>>
            ${d.name}
          </option>
        </c:forEach>
      </select>
    </label>
  </article>

  <fieldset>
    <legend>Address</legend>
    <label>Street <form:input path="address.street"/></label>
    <label>City   <form:input path="address.city"/></label>
    <label>State  <form:input path="address.state"/></label>
    <label>ZIP    <form:input path="address.zip"/></label>
  </fieldset>

  <button type="submit">${isEdit ? 'Update' : 'Save'}</button>
  <a href="${pageContext.request.contextPath}/employees/list">Cancel</a>
</form:form>
