package S1118BeanDI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S2BeanTest {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//1.构造注入
			//参数名注入
		S1BeanDIStudent s1Student1=(S1BeanDIStudent) ac.getBean("s1Student1");
		System.out.println(s1Student1.toString());
			//参数索引值注入
		S1BeanDIStudent s1Student2=(S1BeanDIStudent) ac.getBean("s1Student2");
		System.out.println(s1Student2.toString());
			//参数数据类型注入
		S1BeanDIStudent s1Student3=(S1BeanDIStudent) ac.getBean("s1Student3");
		System.out.println(s1Student3.toString());
		//2.命名空间注入
		S1BeanDIStudent s1Student4=(S1BeanDIStudent) ac.getBean("s1Student4");
		System.out.println(s1Student4.toString());
		//3.数组集合注入
		S3ArrayCollection s3ArrayCollection=(S3ArrayCollection) ac.getBean("s3ArrayCollection");
		System.out.println(s3ArrayCollection.toString());
		int a[]=s3ArrayCollection.getA();
		for(int i:a){
			System.out.println(i+"\t");
		}
		List<String> list=s3ArrayCollection.getList();
		Iterator<String> i=list.iterator();
		while(i.hasNext()){
			System.out.println(i.next()+"\t");
		}
				
		Set<Double> set=s3ArrayCollection.getSet();
		Iterator<Double> iset=set.iterator();
		while(iset.hasNext()){
			System.out.println(iset.next()+"\t");
		}
		Map<String,Integer> map=s3ArrayCollection.getMap();

		Set<Map.Entry<String, Integer>> setMap=map.entrySet();
		Iterator<Map.Entry<String, Integer>> it=setMap.iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> m=it.next();
			System.out.println(m.getKey()+"--->"+m.getValue());
		}
	
		
		
	}
}
