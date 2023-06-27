package com.kjy;

import java.util.ArrayList;

//DataClass: ��� ȸ���� ������ �����ϴ� ����.
//���� MySQL�� ����...

public class DataClass {
	ArrayList<MemberClass> members=new ArrayList<MemberClass>();
	ArrayList<StudentClass> students=new ArrayList<StudentClass>();
	public DataClass() {
		init();
		initStudent();
	}
	
	public void init() { //�ʱ�ȭ �޼��� //this.�� �ٿ��� ã�°� �������⶧���� �ӵ��� ������
		this.members.add(new MemberClass("92001", "590327-1839240", "���±�", 920, "����", "1997")); 
		this.members.add(new MemberClass("92002", "690702-1350026", "����", 910, "�α���", "2003"));
		this.members.add(new MemberClass("92301", "741011-2765501", "�ּ���", 910, "�α���", "2005"));
		this.members.add(new MemberClass("92302", "750728-1102458", "���¼�", 920, "����", "1999"));
		this.members.add(new MemberClass("92501", "620505-1200546", "��ö��", 900, "������", "2007"));
		this.members.add(new MemberClass("92502", "740101-1830264", "��μ�", 910, "�α���", "2005"));
		
	}
	
	public void initStudent() {
		this.students.add(new StudentClass("1292001", "900424-1825409", "�豤��", 3, "����", 92));
		this.students.add(new StudentClass("1292002", "900305-1730021", "������", 3, "����", 20));
		this.students.add(new StudentClass("1292003", "891021-2308302", "������", 4, "����", 55));
		this.students.add(new StudentClass("1292301", "890902-2704012", "������", 2, "�뱸", 78));
		this.students.add(new StudentClass("1292303", "910715-1524390", "�ڱ���", 3, "����", 54));
		this.students.add(new StudentClass("1292305", "921011-1809003", "�����", 4, "�λ�", 88));
		this.students.add(new StudentClass("1292501", "900825-1506390", "��ö��", 3, "����", 73));
		this.students.add(new StudentClass("1292502", "911011-1809003", "���¼�", 3, "����", 95));
	}

}
