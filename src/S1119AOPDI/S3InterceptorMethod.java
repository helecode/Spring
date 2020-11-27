package S1119AOPDI;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;


public class S3InterceptorMethod implements MethodInterceptor{
	//����֪ͨ
	private static final Logger log = Logger.getLogger(S3InterceptorMethod.class);
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("����ǰ֪ͨ");
		Object target = arg0.getThis(); //  ��ȡ���������
		Method method = arg0.getMethod(); //  ��ȡ��������
		Object[] args = arg0.getArguments(); //  ��ȡ��������
		log.info(" ���� " + target + "  �� " + method.getName() + "  ������������Σ�"
		+ Arrays.toString(args));
		try { Object result = arg0.proceed(); //  ����Ŀ�귽������ȡĿ�귽������ֵ
		log.info(" ���� " + target + "  �� " + method.getName() + "  ������ "
		+ " ��������ֵ��" + result);
		System.out.println("���ƺ�֪ͨ");
		return result;
		
		} catch (Throwable e) {
		log.error(method.getName() + "  ���������쳣��" + e); throw e;
		
		}
		
	}


	
}	
