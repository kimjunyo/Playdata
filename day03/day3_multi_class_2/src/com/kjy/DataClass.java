package com.kjy;

public class DataClass {
	BookClass[] books=new BookClass[15];
	public DataClass() {
		init();
	}
	public void init() {
		this.books[0]=new BookClass("DO it HTML 5 CSS 3", "�����", "�������ۺ���", 16800, "06365234.jpg", 20);
		this.books[1]=new BookClass("��� �� �������� ���� HTML5 CSS3 �Թ�",  "���μ�", "�Ѻ��̵��", 30000, "06992821.jpg", 21);
		this.books[2]=new BookClass("HTML5 CSS3�� �Բ��ϴ� �帲���� CS6 ������ �����ϱ�",   "�����", "���", 24000, "07056591.jpg", 10);
		this.books[3]=new BookClass("Head First HTML5 Programming", "�����ں��� �ӽ�, ���� ������", "�Ѻ��̵��", 34000, "06950729.jpg", 20);
		this.books[4]=new BookClass("����鼭 ���� HTML5 CSS3 jQuery",  "�߹�",   "�Ѻ��̵��", 25000, "06837215.jpg", 23);
		this.books[5]=new BookClass("HTML5 CSS3", "��뼮", "�ε��", 25000, "06741081.jpg", 15);
		this.books[6]=new BookClass("HTML5 CSS3 WebGL�� ����ְ� ���� HTML5 ���� ���α׷���", "������ ���̵帰",  "������", 30000, "06980245.jpg", 10);
		this.books[7]=new BookClass("HTML5 ĵ���� �Ϻ� ���̵�",  "���̺�� ��", "��Ű�Ͻ�",   40000, "07085557.jpg", 10);
		this.books[8]=new BookClass("���ο����ǹ����̵� HTML 5 CSS 3",    "����ȯ ������ �� 1��",     "����̵��", 28000, "06630397.jpg", 16);
		this.books[9]=new BookClass("HTML5�� CSS3�� �ۼ��ϴ� ������ �� ������", "�� ������",  "����������", 30000, "06983417.jpg", 20);
		this.books[10]=new BookClass("HTML5�� ���̴� �׸�å","ANK Co Ltd", "���ȴ�", 31500, "06992821.jpg", 21);
		this.books[11]=new BookClass("HTML5 Canvas", "��Ƽ�� ��ư, ���� ��ư",   "�Ѻ��̵��", 38000, "06806523.jpg", 20);
		this.books[12]=new BookClass("���������� HTML5 CSS3 �� ���۷���",  "�������� ����ε�",  "������", 20000, "07114432.jpg", 10);
		this.books[13]=new BookClass("���� �����̴� HTML5 CSS3 ����Ʈ������ ����", "��뼮", "�ε��", 25000, "06880352.jpg", 10);
		this.books[14]=new BookClass("iOS�� �ȵ���̵带 ���� HTML5", "�κ� �н�",  "�Ѻ��̵��", 33000, "07041351.jpg", 10);
	}

}
