package practise;

import java.util.*;
public class My_map {
public static void main(String[] args) {
	Map<Integer,MyStudent> map=new HashMap<Integer,MyStudent>();
	map.put(11,new MyStudent(11,"Sasid",33333));
	map.put(22, new MyStudent(22,"Adity",225000));
	map.put(33,new MyStudent(33,"Messi",845000));
	Set<Integer> keys=map.keySet();
	for(Integer k:keys) {
		System.out.println(k);
	}
	Collection<MyStudent> values=map.values();
	values.forEach((val)->System.out.println(val));
	
}
}