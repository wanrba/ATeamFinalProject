<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<div>
<input type="number" step="1000" max="1000000" id="deposit" >
<button type="button" name="apibtn" id="apibtn">결제하기</button>

</div>
<script>
   $(function() {
      $('#apibtn').click(function() {
		var deposit = 
		$.ajax({
			url:"kakaopay.do",
			dataType:'JSON',                        
			success:function(data) {     
				alert("success")
				var box = data.next_redirect_pc_url;
				//window.open(box);
				location.href = data.next_redirect_pc_url + "?tid=" 
					+ data.tid + "&pg_token=" + data.pg_token;
            },//  + "?pg_token=" + data.pg_token;
            error : function(error) {
            	alert("error")
            	alert(error);
            }
         });
      });
   });
</script>