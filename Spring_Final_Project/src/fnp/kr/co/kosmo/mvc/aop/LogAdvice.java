package fnp.kr.co.kosmo.mvc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {

	/**
	 * 07-18 YoungJin
	 * 모든 Controller의 메소드 실행 전 로그 출력용
	 * @param jp
	 */
	@Before("execution(* fnp.kr.co.kosmo.mvc.controller.*.*.*(..))")
	public void beforeControllerLog(JoinPoint jp) {
		System.out.println(
				"[" + jp.getTarget().getClass().getSimpleName() + " - " + jp.getSignature().getName() + "] Before Log");
	}

	/**
	 * 07-18 YoungJin
	 * 모든 Controller의 메소드 실행 후 로그 출력용
	 * @param jp
	 */
	@After("execution(* fnp.kr.co.kosmo.mvc.controller.*.*.*(..))")
	public void afterControllerLog(JoinPoint jp) {
		System.out.println(
				"[" + jp.getTarget().getClass().getSimpleName() + " - " + jp.getSignature().getName() + "] After Log");
	}
	
	/**
	 * 07-18 YoungJin
	 * 모든 Service의 메소드 실행 전 로그 출력용
	 * @param jp
	 */
	@Before("execution(* fnp.kr.co.kosmo.mvc.service.*.*.*(..))")
	public void beforeServiceLog(JoinPoint jp) {
		System.out.println(
				"[" + jp.getTarget().getClass().getSimpleName() + " - " + jp.getSignature().getName() + "] Before Log");
	}

	/**
	 * 07-18 YoungJin
	 * 모든 Service의 메소드 실행 후 로그 출력용
	 * @param jp
	 */
	@After("execution(* fnp.kr.co.kosmo.mvc.service.*.*.*(..))")
	public void afterServiceLog(JoinPoint jp) {
		System.out.println(
				"[" + jp.getTarget().getClass().getSimpleName() + " - " + jp.getSignature().getName() + "] After Log");
	}
	
	/**
	 * 07-18 YoungJin
	 * 모든 Dao의 메소드 실행 전 로그 출력용
	 * @param jp
	 */
	@Before("execution(* fnp.kr.co.kosmo.mvc.dao.*.*.*(..))")
	public void beforeDaoLog(JoinPoint jp) {
		System.out.println(
				"[" + jp.getTarget().getClass().getSimpleName() + " - " + jp.getSignature().getName() + "] After Log");
	}
	
	/**
	 * 07-18 YoungJin
	 * 모든 Dao의 메소드 실행 후 로그 출력용
	 * @param jp
	 */
	@After("execution(* fnp.kr.co.kosmo.mvc.dao.*.*.*(..))")
	public void afterDaoLog(JoinPoint jp) {
		System.out.println(
				"[" + jp.getTarget().getClass().getSimpleName() + " - " + jp.getSignature().getName() + "] After Log");
	}

}
