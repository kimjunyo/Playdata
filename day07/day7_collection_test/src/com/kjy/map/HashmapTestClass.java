package com.kjy.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashmapTestClass {

	public HashmapTestClass() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 기본데이터타입
	 * int 		char
	 * Integer 	Character
	 */
	public static void hashMapTest() {
		Map<String, Integer> map=new HashMap<String, Integer>();
		//HashMap<String, Integer> map2=new HashMap<String, Integer>();
		//실무에서는 활용 X
		
		map.put("a", 10);
		map.put("a", 20);
		map.put("a", 30); //키 하나 존재
		
		map.put("b", 40);
		map.put("c", 50);
		map.put("d",60);
		System.out.println(map.size());
		
		/** 데이터를 추출: get(키 이름)**/
		System.out.println(map.get("c"));
		
		/**	HashMap의 키 이름들만 추출: keySet()
		 * 	keySet()의 반환 타입 Set<값에 대한 데이터 타입>
		 */
		Set<String> key=map.keySet();
		
		//1.LinkedList 형태로 바꾸어 호출
		List<String> list=new LinkedList<String>(key);//생성자에게 set객체를 전달
		// 순서는 set이 무작위기 때문에 무작위로 들어감
		
		for(String s:list) {
			System.out.println(s);
		//2.Iterator 형태로 변환하여 출력
		//	Iterator: 열거형
		}
		Iterator<String> iter=key.iterator();
		while(iter.hasNext()) { // iter.hasNext(): 추출할 데이터가 있는지 여부(true/false)
			System.out.println(iter.next());
		}
		
	} // hashMapTest() END
	public static void hashMapStudent() {
		Student s1=new Student(10,"test1");
		Student s2=new Student(20,"test2");
		Student s3=new Student(30,"test3");
		Student s4=new Student(40,"test4");
		
		Map<String,Student>map=new HashMap<String,Student>();
		map.put("a", s1);
		map.put("b", s2);
		map.put("c", s3);
		map.put("d", s4);
		System.out.println(map);
		System.out.println(s1);
//		1.LinkedList
		List<Student>list=new LinkedList<Student>(map.values());
		for(Student s:list) {
			System.out.println(s.toString());
		}
//		2.Iterator
		Iterator<String> list2=map.keySet().iterator();
		while(list2.hasNext()) {
			System.out.println(list2.next());
		}
	}

}
