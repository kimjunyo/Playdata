package com.kjy;

//DataClass: ��� ȸ���� ������ �����ϴ� ����.
//���� MySQL�� ����...

public class DataClass {
	MemberClass[] members=new MemberClass[6];
	StudentClass[] students=new StudentClass[8];
	public DataClass() {
		init();
		initStudent();
	}
	
	public void init() { //�ʱ�ȭ �޼��� //this.�� �ٿ��� ã�°� �������⶧���� �ӵ��� ������
		this.members[0]=new MemberClass("92001", "590327-1839240", "���±�", 920, "����", "1997");
		this.members[1]=new MemberClass("92002", "690702-1350026", "����", 910, "�α���", "2003");
		this.members[2]=new MemberClass("92301", "741011-2765501", "�ּ���", 910, "�α���", "2005");
		this.members[3]=new MemberClass("92302", "750728-1102458", "���¼�", 920, "����", "1999");
		this.members[4]=new MemberClass("92501", "620505-1200546", "��ö��", 900, "������", "2007");
		this.members[5]=new MemberClass("92502", "740101-1830264", "��μ�", 910, "�α���", "2005");
		
	}
	
	public void initStudent() {
		this.students[0]=new StudentClass("1292001", "900424-1825409", "�豤��", 3, "����", 92);
		this.students[1]=new StudentClass("1292002", "900305-1730021", "������", 3, "����", 20);
		this.students[2]=new StudentClass("1292003", "891021-2308302", "������", 4, "����", 55);
		this.students[3]=new StudentClass("1292301", "890902-2704012", "������", 2, "�뱸", 78);
		this.students[4]=new StudentClass("1292303", "910715-1524390", "�ڱ���", 3, "����", 54);
		this.students[5]=new StudentClass("1292305", "921011-1809003", "�����", 4, "�λ�", 88);
		this.students[6]=new StudentClass("1292501", "900825-1506390", "��ö��", 3, "����", 73);
		this.students[7]=new StudentClass("1292502", "911011-1809003", "���¼�", 3, "����", 95);
	}

}
