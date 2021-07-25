<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${list }" var="e">
	<img src = "resources/fileUpload/${e.ex_thumb }" alt="">
	${e.ex_startday }
	${e.ex_endday }
	${e.ex_time }
	АЁАн : ${e.ex_pay }

</c:forEach>