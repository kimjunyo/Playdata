package com.kjy;

// MethodClass: ������Ʈ�� �ʿ��� ������ �޼ҵ�鸸 �����ϴ� Ŭ����
public class MethodClass {

	public MethodClass() { //�⺻ ������
	}
	public static void splitText() { //��� Ŭ�������� ��� ����
		System.out.println("splitText() ȣ��� ");
	}
	
	//MainClass�� main() ������ ȣ��
	//main()������ ���� �����͵��� ������ members �迭�� ����!
	public static int[] age(MemberClass[] members) {
		int ages[]=new int[members.length];	//��� �������� ���̸� ������ �迭
		for(int idx=0;idx<members.length;idx++) {
			String temp=members[idx].firstNo.substring(0,2);
			String temp2=members[idx].lastNo.substring(0,1);
			int temp3=Integer.parseInt(temp);

			if(temp2.equals("3") | temp2.equals("4")) {
				ages[idx]=2023-(2000+temp3);
			}
			else {
				ages[idx]=2023-(1900+temp3);
			}
		
		}
		return ages;	//������ ���̵��� main()���� ��ȯ
						//main()������ int[] Ÿ���� ���� ������ ����...��)int[] pAges=mc.age(dc.members);
	
	}
	public static float gradeAvg(StudentClass[] students) {
		int gradeSum=0;
		for(int idx=0;idx<students.length;idx++) {
			gradeSum+=students[idx].grade;
		}
		return (float)gradeSum/students.length;
	}
}
