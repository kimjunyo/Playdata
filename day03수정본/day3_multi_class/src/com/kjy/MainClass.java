package com.kjy;

import java.util.ArrayList;

// MainClass: ������Ʈ ��ü�� ��Ʈ�� �ϴ� ����
// Controller ����
public class MainClass {
	static String s="aaaas";
	static int a=10;
	static final int b=100;
	//final: �ʱ� ���� ���� �������� ���ϵ��� �����ִ� Ű����
	
	public static void main(String[] args) {
//		MemberClass m1= new MemberClass();
//		
//		Object m2=new MemberClass();
//		
//		MemberClass m3=(MemberClass) m2;
//		System.out.println(s); //static�� ���� ������ �ȵǴ� ����: static�ʿ��� ��� �Ǵϱ�
//		
		a=3300;
//		m1.a=1000;
//		m1.b=20000;
//		System.out.println(m1.a+"  "+m3.a);
//		System.out.println(m1.b+"  "+m3.b);
//		m1.test(m1.a);
//		m3.test(m3.a);
//		MemberClass.b=1234556;
//		System.out.println(m1.b+"  "+m3.b);
//		MethodClass.splitText();
		
		//("92001", "590327-1839240", "���±�", 920, "����", "1997")
		
		
//		System.out.println("���� �Ⱓ: "+(2023-m.hirDate)+"��");
//		DataClass dc= new DataClass();
//		for(int idx=0;idx<dc.members.length;idx++) {
//			System.out.print(dc.members[idx].pname+"\t");
//			System.out.println(2023-dc.members[idx].hirDate);
//		}
		DataClass dc=new DataClass();
		//���� �����͵��� dc��ü ���� members��� �迭�� ����!!
		ArrayList<Integer> pAges=MethodClass.age(dc.members); //static�� ������ �̿� ���� �ٷ� class���� ȣ�� ����
												 //���� static�� �� ������ ���� ��ü ������ ��
												 //ex) MethodClass mc=new MethodClass(); mc.age(dc.members);
		PrintClass.prn(dc.members,pAges); //�� ģ���� ��������
		float gradesAvg=MethodClass.gradeAvg(dc.students);
		PrintClass.prnGrade(gradesAvg);
	}//main END
}
