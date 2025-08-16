<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<jsp:useBean id="pageTitle" scope="request" class="java.lang.String"/>
<%
request.setAttribute("pageTitle", "Error");
request.setAttribute("contentPage", "error_content.jsp");
%>
<jsp:include page="layout.jsp"/>
