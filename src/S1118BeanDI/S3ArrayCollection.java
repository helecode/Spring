package S1118BeanDI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class S3ArrayCollection {
	private int a[];
	private List<String> list;
	private Set<Double> set;
	private Map<String,Integer> map;
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<Double> getSet() {
		return set;
	}
	public void setSet(Set<Double> set) {
		this.set = set;
	}

	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "S3ArrayCollection [a=" + Arrays.toString(a) + ", list=" + list
				+ ", set=" + set + ", map=" + map + "]";
	}
	
	
}
