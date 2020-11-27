package S1119AOPDI;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * ͨ��MethodBeforeAdviceʵ��ǰ����ǿ
 */
//ǰ��֪ͨ������֪ͨ������֪ͨ���쳣֪ͨ������֪ͨ
public class S1MethodBeforeAdvice implements MethodBeforeAdvice {
	private static final Logger log = Logger.getLogger(S1MethodBeforeAdvice.class);
 //method��ʾҪִ�з���,argument��ʾִ�еķ����Ĳ���,target��ʾʹ�õ���Ķ���
	//��д�ӿ��еķ���
	public void before(Method method, Object[] arguments, Object target)
			throws Throwable {
		System.out.println("====ǰ֪ͨ=====");
		log.info("���� " + target + " �� " + method.getName() + " ������������Σ�"
				+ Arrays.toString(arguments));
	}
	public void update(){
		System.out.println("---updateupdateupdateupdate---");
	}
}

