<%@ page pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
  <title>${initParam.app}</title>
</head>
<body>
   <h1>Los primos</h1>
   
   <form action="primo" method="get">
      Número: <input type="text" name="numero" />
      <input type="submit" />
   </form>
   <c:if test="${!empty param.numero}">
     ${param.numero} ${esPrimo?'':'No'} es primo <br />
     El siguiente primo es ${siguiente}
   </c:if>
</body>
</html>