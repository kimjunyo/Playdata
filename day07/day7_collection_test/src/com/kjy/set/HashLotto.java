package com.kjy.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class HashLotto {

	public HashLotto() {
		// TODO Auto-generated constructor stub
	}
	
	public static void hashSetLotto() {
		HashSet<Integer> lotto=new HashSet<Integer>();
		
		/**	임의의 수 6개 추출하여 저장
		 * 	로또 번호: 45
		 * 	임의의: Math.random(): 0~1 사이의 실수
		 *		  Random.class nextInt(범위)
		 *		  nextInt(3): 0, 1, 2
		 */
		Random r=new Random();
		for(int n=0;n<6;n++) {
			int lottoNum=r.nextInt(45);
			lotto.add(lottoNum+1);
		}
		
		List<Integer> lottoList=new LinkedList<Integer>(lotto);
		System.out.println(lottoList);
		
		Collections.sort(lottoList); //원본 데이터 바꾸기 때문에, 주의 요망!
		System.out.println(lottoList);
	}

}
