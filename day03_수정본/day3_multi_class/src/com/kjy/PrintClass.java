package com.kjy;

import java.util.ArrayList;

// PrintClass: ��¿� �ش��ϴ� �޼���鸸 ����.
// ����: HTML�� ���� GUI/UI��� ��ü...
// View ����
public class PrintClass {

	public PrintClass() { //�⺻ ������
	}
	
	public static void prn(ArrayList<MemberClass> members,ArrayList<Integer> arr) { //����� ���� �޼���
		for(int idx=0;idx<arr.size();idx++) {
			System.out.println(members.get(idx).pname+" ������ ����: " +arr.get(idx));
		}
		
	}
	public static void prnGrade(float gradeAvg) {
		System.out.println("\n�л����� ���: "+gradeAvg);
	}

}
