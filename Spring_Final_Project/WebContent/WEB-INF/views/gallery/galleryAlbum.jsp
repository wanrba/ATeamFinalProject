<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!-- 파일업로드 -->
<form name="fileForm" action="galleryup.do" method="post" enctype="multipart/form-data">
        <input multiple="multiple" type="file" name="picture" />
        <input type="text" name="p_title"/>
        <input type="submit" value="전송" />
    </form>



<!-- 사진 출력 -->
<div>
<table border="1">
<c:forEach var="e" items="${info }">
<tr><th>
       <p>업로드 날짜 : ${e.p_date } 제목 : ${e.p_title}</p>
         <c:forTokens var="data" items="${e.picture}" delims=",">
         <img src="resources/imgUpload/${data}" style="width: 80px;"/>
         </c:forTokens>
         </th></tr>
</c:forEach>
</table>
</div>
