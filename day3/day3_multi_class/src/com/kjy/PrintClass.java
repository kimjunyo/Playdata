package com.kjy;

// PrintClass: ��¿� �ش��ϴ� �޼���鸸 ����.
// ����: HTML�� ���� GUI/UI��� ��ü...
// View ����
public class PrintClass {

	public PrintClass() { //�⺻ ������
	}
	
	public static void prn(MemberClass[] members,int[] arr) { //����� ���� �޼���
		for(int idx=0;idx<arr.length;idx++) {
			System.out.println(members[idx].pname+" ������ ����: " +arr[idx]);
		}
		
	}
	public static void prnGrade(float gradeAvg) {
		System.out.println("\n�л����� ���: "+gradeAvg);
	}

}
