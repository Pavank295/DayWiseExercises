<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<h3>Oops!</h3>
<p><strong><c:out value="${message}"/></strong></p>
<p><small>Time: <c:out value="${timestamp}"/></small></p>
<p><a href="${pageContext.request.contextPath}/employees/list">Back to list</a></p>