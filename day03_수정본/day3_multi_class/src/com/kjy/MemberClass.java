package com.kjy;

//�� ȸ���� ������ �ϳ��� �����ִ� ����
// Model ����
// ���������� ��ġ�� �͸�..
public class MemberClass {
//	int a=100;
	
//	static int b=20;
	//��� ������ �ʱⰪ ���� �ʼ�, �ڵ� �ʱ�ȭ�� ������
	String pno=null;//�������
	
	private String firstNo=null;//�ֹι�ȣ ���ڸ� //�������, ����
	private String lastNo=null;//�ֹι�ȣ ���ڸ� //����, ����
	String pname=null;//�����̸�
	int cCode=0;//Ŭ����(��) �ڵ��
	String pJob=null;//������å
	int hirDate=0;//�Ի翬�� //�������
	//�ڵ� ����ϸ� ctrl s
	
	public MemberClass() { //�⺻ ������
		
	}
	//                      pno     firstNo lastNo     pname    cCode       pJob          hirDate
	public MemberClass(String pno, String jumin, String pname, int cCode, String pJob, String hirDate) { //7�� �����͸� �޴� ������
		this.pno = pno;
		String[] temp=jumin.split("-");
		this.firstNo = temp[0];
		this.lastNo = temp[1];
		this.pname = pname;
		this.cCode = cCode;
		this.pJob = pJob;
		this.hirDate = Integer.parseInt(hirDate);
	}
	public String getFirstNo() {
		return firstNo;
	}
	public String getLastNo() {
		return lastNo;
	}

//	public void test(int p) {
//		System.out.println("test() �޼��� ȣ��: "+p);
//	}
}
