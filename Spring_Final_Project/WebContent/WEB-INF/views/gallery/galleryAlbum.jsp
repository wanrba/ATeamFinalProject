<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!-- ���Ͼ��ε� -->
<form name="fileForm" action="galleryup.do" method="post" enctype="multipart/form-data">
        <input multiple="multiple" type="file" name="picture" />
        <input type="text" name="p_title"/>
        <input type="submit" value="����" />
    </form>



<!-- ���� ��� -->
<div>
<table border="1">
<c:forEach var="e" items="${info }">
<tr><th>
       <p>���ε� ��¥ : ${e.p_date } ���� : ${e.p_title}</p>
         <c:forTokens var="data" items="${e.picture}" delims=",">
         <img src="resources/imgUpload/${data}" style="width: 80px;"/>
         </c:forTokens>
         </th></tr>
</c:forEach>
</table>
</div>
