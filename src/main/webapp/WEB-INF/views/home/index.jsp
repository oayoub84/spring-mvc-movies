<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>
		Home
	</h1>
	<c:url var="movieListUrl" value="/movies" />
	[<a href="${movieListUrl}">Movies list</a>]
</body>
</html>
