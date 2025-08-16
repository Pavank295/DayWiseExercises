<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:useBean id="pageTitle" scope="request" class="java.lang.String"/>
<%
request.setAttribute("pageTitle", "Employee Form");
request.setAttribute("contentPage", "form_content.jsp");
%>
<jsp:include page="layout.jsp"/>
