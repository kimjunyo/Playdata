package com.kjy;

public class EMPClass { //class ����
	String name;       	//�̸�
	String joinDate;   	//������
	String lastVisitDate; // �����湮��
	int numVisit;//	�湮Ƚ��
	String gender;//         ����
	String age;//         	���ɴ�
 
	public EMPClass() {//�⺻ ������
		
	}
	//�����ڴ� public ��� Ŭ������
	public EMPClass(String str) { //�⺻ �����ڿ� ���� Overloading ������ ����
		this.setSplit(str); //�����ڿ��� method�� ������ ��� ��		
	}//������ END
	
	//�ż���� public ��ȯŸ�� �ż���� �̷������� �ؾ���
	//���ڿ��� ���� �и��Ͽ� ����(�ʵ�)������ ����(����)�ϴ� �ż���
	public void setSplit(String str) {
		String[] split=str.split(",");
		this.name=split[0]; //this�� class�� ���� �ٷ� ã��:���� �ӵ��� ����:scope��Ģ �ȵ���
		this.joinDate=split[1];
		this.lastVisitDate=split[2];
		this.numVisit=Integer.parseInt(split[3]);
		this.gender=split[4];
		this.age=split[5];
	}
	public static float[] getPortion(int male, int female, int entire){
		float malePortion=(float)male/entire;
		float femalePortion=(float)female/entire;
		float[] mfPortion= {malePortion,femalePortion};
		return mfPortion;
	}
	

}//Ŭ���� END
