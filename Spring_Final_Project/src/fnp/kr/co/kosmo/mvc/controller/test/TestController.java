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
public class TestController { //payment�� �����ϸ� �� ��..
    
	/**
	 * īī������ ��� ���� 
	 * @return
	 */
	@RequestMapping("/kapaytest.do")
	public String kapaytest() {
		return "test/test";
	}
	
	/**
	 * ����� īī�����̱�ɿ��� ajax�� ��û�� apk, ������ ����
	 * @return
	 */
   @RequestMapping("/kakaopay.do")
   @ResponseBody
   public Object kakaopay() {     
      try {
         URL urls = new URL("https://kapi.kakao.com/v1/payment/ready");
         HttpURLConnection conn = (HttpURLConnection) urls.openConnection();
         conn.setRequestMethod("POST");
         conn.setRequestProperty("Authorization", "KakaoAK 9a8154b109a8b80cd2c0d7f8d7140eeb"); //īī������ �ڱ� adminAPI �� ��!        
         conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
         conn.setDoOutput(true);  // �⺻�� fasle �ε� true�� �ٲ���
         
         String text = "Ŀ�� ���� �Ա�";  //  QR�ڵ� ��� ������ ��ǰ��
         String name = URLEncoder.encode(text,"UTF-8");  // �ڵ������� �� �� �ѱ� ���ڵ� (1)         
         int price = 5555;          //  QR�ڵ� ��� ������ ��ǰ���� - int�� ����
         
         String params = "cid=TC0ONETIME&"
                 + "partner_order_id=partner_order_id&" // ������ �ֹ���ȣ, �ִ� 100��
                 + "partner_user_id=partner_user_id&" // ������ ȸ�� id, �ִ� 100��
                 + "item_name="+name+"&"   //  QR�ڵ� ��� ������ ��ǰ��
                 + "quantity=1&"
                 + "total_amount="+price +"&"   //  QR�ڵ� ��� ������ ��ǰ����
                 + "tax_free_amount=0&"
                 //http://localhost �� ��Ʈ��ȣ�� ����
                 + "approval_url=http://localhost/Spring_Final_Project/deposit.do?tid=qwiniwenqwinewi&"  // �ֹ� ������ �̵��� ����Ʈ �ּ� 
                 + "fail_url=http://localhost/Spring_Final_Project/loginForm.do&"    // �ֹ� ���н� �̵� ����Ʈ �ּ� 
                 + "cancel_url=http://localhost/Spring_Final_Project/insertCalendarDetailForm.do";  // �ֹ� ��ҽ� �̵� ����Ʈ �ּ� 
            
         OutputStream Ot = conn.getOutputStream();
         DataOutputStream Dot = new DataOutputStream(Ot);
         Dot.writeBytes(params);         
         Dot.close();  // Dot.flush(); �� �ڵ����� ����

         
         int results = conn.getResponseCode();

         BufferedReader br;
         if (results == 200) {
            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8")); // �ڵ������� �� �� �ѱ� ���ڵ� (2)            
         }else {
            br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));   // �ڵ������� �� �� �ѱ� ���ڵ� (2)
         }            
       
         
         JSONParser jp = new JSONParser();

         
         String datas = "";         
         datas = br.readLine();             
         System.out.println(jp.parse(datas));  //    Response Key Ȯ��
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