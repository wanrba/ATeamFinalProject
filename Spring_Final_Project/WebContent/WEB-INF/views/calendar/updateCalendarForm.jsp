<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<!-- 
CIDX
USER_CUPLENUM
CTITLE   		O
CSTARTDAY		O
CENDDAY			O
CLOCAL			O
CCONTENT		O
CCOLOR 			O 

** �� �ΰ� �÷� �߰��ؾ� �� ��
CSDTIME ���۽ð�
CEDTIME ����ð�
-->

</head>
<body>
	<h4>���� �����</h4>
	<br><form name="insertCalendar" method="post" action="insertCalendar.do" encType="UTF-8">
	
		<p><label for=cTitle><strong>����</strong></label>  
		<input type="text" id="cTitle" name="cTitle" class="calendartext" 
		value="${cdto.cTitle }"><br></p>
	
		<p><label for="cLocal"><strong>���</strong></label> 
		<input type="text" id="cLocal" name="cLocal" class="calendartext" 
		value="${cdto.cLocal}"><br></p>
	
		<p><label for="cStartDay"><strong>���� �Ͻ�</strong></label> 
      	<p><input type="date" id="cStartDay" name="cStartDay" value="${cdto.cStartDay }">
     	 <input type="time" id="csdtime" name="csdtime" value=""></p>
	
		<p><label for="cEndDay"><strong>���� �Ͻ�</strong></label> 
      	<input type="date" id="cEndDay" name="cEndDay" value="${cdto.cEndDay }">
      	<input type="time" id="cedtime" name="cedtime" value=""></p>
      	
	 	<p><label for="cContent">���� <br></label>
		<textarea id="cContent" name="cContent"rows="5" cols="33" placeholder="������ �Է�">${cdto.cContent }</textarea></p>
	
		<p><label for="cColor"><strong>�߿䵵</strong></label> 
		<input type="radio" name="cColor" value="high">����
		<input type="radio" name="cColor" value="middle">����
		<input type="radio" name="cColor" value="low">����</p>
	
	<!-- 	<h4>���� color! Ȥ�� ���� �־</h4>
		<input type="color" name="favcolor" value="#CC6600"> -->
	
  		<p><input type="submit" id="calendarinsert" value="Ȯ��">	
	     <input type="button" onclick="location.href='index.do'" value="���"></p>
	    <br>
   	<hr>
</form>
</body>
</html>