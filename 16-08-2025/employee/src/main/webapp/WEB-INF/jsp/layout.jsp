<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>${pageTitle}</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css"/>
    <style> .container{max-width: 980px;} .right{float:right} </style>
</head>
<body>
<main class="container">
    <header>
        <h2>Employee MVC (JSP)</h2>
        <nav>
            <a href="${pageContext.request.contextPath}/employees/list">Home</a>
            <a href="${pageContext.request.contextPath}/employees/new">Add</a>
            <a href="${pageContext.request.contextPath}/employees/search">Search</a>
        </nav>
        <hr/>
    </header>

    <!-- content -->
    <jsp:include page="${contentPage}"/>

    <footer><hr/><small>&copy; <c:out value="${pageContext.request.serverName}"/></small></footer>
</main>
</body>
</html>
