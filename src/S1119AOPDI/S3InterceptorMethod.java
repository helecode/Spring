package S1119AOPDI;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;


public class S3InterceptorMethod implements MethodInterceptor{
	//环绕通知
	private static final Logger log = Logger.getLogger(S3InterceptorMethod.class);
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("环绕前通知");
		Object target = arg0.getThis(); //  获取被代理对象
		Method method = arg0.getMethod(); //  获取被代理方法
		Object[] args = arg0.getArguments(); //  获取方法参数
		log.info(" 调用 " + target + "  的 " + method.getName() + "  方法。方法入参："
		+ Arrays.toString(args));
		try { Object result = arg0.proceed(); //  调用目标方法，获取目标方法返回值
		log.info(" 调用 " + target + "  的 " + method.getName() + "  方法。 "
		+ " 方法返回值：" + result);
		System.out.println("环绕后通知");
		return result;
		
		} catch (Throwable e) {
		log.error(method.getName() + "  方法发生异常：" + e); throw e;
		
		}
		
	}


	
}	
