package com.kjy;

import java.util.ArrayList;

// MethodClass: ������Ʈ�� �ʿ��� ������ �޼ҵ�鸸 �����ϴ� Ŭ����
public class MethodClass {

	public MethodClass() { //�⺻ ������
	}
	public static void splitText() { //��� Ŭ�������� ��� ����
		System.out.println("splitText() ȣ��� ");
	}
	
	//MainClass�� main() ������ ȣ��
	//main()������ ���� �����͵��� ������ members �迭�� ����!
	public static ArrayList<Integer> age(ArrayList<MemberClass> members) {
		ArrayList<Integer> ages=new ArrayList<Integer>();
		for(int idx=0;idx<members.size();idx++) {
			String temp=members.get(idx).getFirstNo().substring(0,2);
			String temp2=members.get(idx).getLastNo().substring(0,1);
			int temp3=Integer.parseInt(temp);

			if(temp2.equals("3") | temp2.equals("4")) {
				ages.add(2023-(2000+temp3));
			}
			else {
				ages.add(2023-(1900+temp3));
			}
		
		}
		return ages;	//������ ���̵��� main()���� ��ȯ
						//main()������ int[] Ÿ���� ���� ������ ����...��)int[] pAges=mc.age(dc.members);
	
	}
	public static float gradeAvg(ArrayList<StudentClass> students) {
		int gradeSum=0;
		for(int idx=0;idx<students.size();idx++) {
			gradeSum+=students.get(idx).grade;
		}
		return (float)gradeSum/students.size();
	}
}
