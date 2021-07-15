package fnp.kr.co.kosmo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerLogAdvice {

	@Before("execution(* fnp.kr.co.kosmo.mvc.controller.*.*(..))")
	public void beforeLog(JoinPoint jp) {
		System.out.println(
				"[" + jp.getTarget().getClass().getSimpleName() + " - " + jp.getSignature().getName() + "] Before Log");
	}

	@After("execution(* fnp.kr.co.kosmo.mvc.controller.*.*.*(..))")
	public void afterLog(JoinPoint jp) {
		System.out.println(
				"[" + jp.getTarget().getClass().getSimpleName() + " - " + jp.getSignature().getName() + "] After Log");
	}

}
