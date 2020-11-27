package S1119AOPDI;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * 通过MethodBeforeAdvice实现前置增强
 */
//前置通知、后置通知、环绕通知、异常通知、引入通知
public class S1MethodBeforeAdvice implements MethodBeforeAdvice {
	private static final Logger log = Logger.getLogger(S1MethodBeforeAdvice.class);
 //method表示要执行方法,argument表示执行的方法的参数,target表示使用的类的对象
	//重写接口中的方法
	public void before(Method method, Object[] arguments, Object target)
			throws Throwable {
		System.out.println("====前通知=====");
		log.info("调用 " + target + " 的 " + method.getName() + " 方法。方法入参："
				+ Arrays.toString(arguments));
	}
	public void update(){
		System.out.println("---updateupdateupdateupdate---");
	}
}

