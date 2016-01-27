<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<h2>Hello World!!</h2>

I am feeling: ${ mood.feeling }.

<a href="/one/reason/${ mood.feeling }"> Click here to know the reason </a>