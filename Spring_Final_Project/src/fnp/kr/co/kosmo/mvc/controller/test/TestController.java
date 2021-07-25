package fnp.kr.co.kosmo.mvc.controller.test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController { //payment로 변경하면 될 듯..
    
	/**
	 * 카카오페이 기능 실행 
	 * @return
	 */
	@RequestMapping("/kapaytest.do")
	public String kapaytest() {
		return "test/test";
	}
	
	/**
	 * 실행된 카카오페이기능에서 ajax로 요청한 apk, 값들을 전송
	 * @return
	 */
   @RequestMapping("/kakaopay.do")
   @ResponseBody
   public Object kakaopay() {     
      try {
         URL urls = new URL("https://kapi.kakao.com/v1/payment/ready");
         HttpURLConnection conn = (HttpURLConnection) urls.openConnection();
         conn.setRequestMethod("POST");
         conn.setRequestProperty("Authorization", "KakaoAK 9a8154b109a8b80cd2c0d7f8d7140eeb"); //카카오페이 자기 adminAPI 쓸 것!        
         conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
         conn.setDoOutput(true);  // 기본이 fasle 인데 true로 바꿔줌
         
         String text = "커플 통장 입금";  //  QR코드 찍고 나오는 상품명
         String name = URLEncoder.encode(text,"UTF-8");  // 핸드폰에서 볼 때 한글 인코딩 (1)         
         int price = 5555;          //  QR코드 찍고 나오는 상품가격 - int로 변경
         
         String params = "cid=TC0ONETIME&"
                 + "partner_order_id=partner_order_id&" // 가맹점 주문번호, 최대 100자
                 + "partner_user_id=partner_user_id&" // 가맹점 회원 id, 최대 100자
                 + "item_name="+name+"&"   //  QR코드 찍고 나오는 상품명
                 + "quantity=1&"
                 + "total_amount="+price +"&"   //  QR코드 찍고 나오는 상품가격
                 + "tax_free_amount=0&"
                 //http://localhost 후 포트번호에 주의
                 + "approval_url=http://localhost/Spring_Final_Project/deposit.do?tid=qwiniwenqwinewi&"  // 주문 성공시 이동할 사이트 주소 
                 + "fail_url=http://localhost/Spring_Final_Project/loginForm.do&"    // 주문 실패시 이동 사이트 주소 
                 + "cancel_url=http://localhost/Spring_Final_Project/insertCalendarDetailForm.do";  // 주문 취소시 이동 사이트 주소 
            
         OutputStream Ot = conn.getOutputStream();
         DataOutputStream Dot = new DataOutputStream(Ot);
         Dot.writeBytes(params);         
         Dot.close();  // Dot.flush(); 가 자동으로 적용

         
         int results = conn.getResponseCode();

         BufferedReader br;
         if (results == 200) {
            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8")); // 핸드폰에서 볼 때 한글 인코딩 (2)            
         }else {
            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));   // 핸드폰에서 볼 때 한글 인코딩 (2)
         }            
       
         
         JSONParser jp = new JSONParser();

         
         String datas = "";         
         datas = br.readLine();             
         System.out.println(jp.parse(datas));  //    Response Key 확인
//         datas =  jp.parse(datas);
         return datas;      
         
//         return br.readLine();
         
      } catch (MalformedURLException e) {      
         e.printStackTrace();
      } catch (IOException e) { 
         e.printStackTrace();
      } catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      return "{\"result\":\"NO\"}";      
   }   

   
   @RequestMapping("/success")
   public String success(Model m) {   
         
      return "community/success";      
   }
   
}