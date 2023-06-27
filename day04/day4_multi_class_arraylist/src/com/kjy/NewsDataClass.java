package com.kjy;

import java.util.ArrayList;

public class NewsDataClass {
	ArrayList<NewsClass> news=new ArrayList<NewsClass>();
	public NewsDataClass() {
		this.initNews();
	}
	
	private void initNews() { //private�� �ܺο��� ������ ���ϵ��� ���� �� ���� //��, class �տ� private�� ���̸� �ȵ� //�����ڵ� ���̸� �� ��
		this.news.add(new NewsClass("����Ź�", "nsd16500796.gif", "media.naver.com/press/032",  "������"));
		this.news.add(new NewsClass("�����Ϻ�", "nsd113224489.gif", "media.naver.com/press/005",  "������"));
		this.news.add(new NewsClass("�����Ϻ�", "nsd162737318.gif", "media.naver.com/press/020",  "������"));
		this.news.add(new NewsClass("����Ź�", "nsd165611664.gif", "media.naver.com/press/081",  "������"));
		this.news.add(new NewsClass("�������ϽŹ�", "nsd162522149.gif", "media.naver.com/press/086",  "������"));
		this.news.add(new NewsClass("������ȭ�Ϻ�", "nsd11502601.gif", "media.naver.com/press/021",  "������"));
		this.news.add(new NewsClass("�����Ϻ�", "nsd104440320.gif", "media.naver.com/press/022",  "������"));
		this.news.add(new NewsClass("�����Ϻ�", "nsd14948476.gif", "media.naver.com/press/023",  "������"));
		this.news.add(new NewsClass("�߾��Ϻ�", "nsd111948440.gif", "media.naver.com/press/025",  "������"));
		this.news.add(new NewsClass("�Ѱ跹", "nsd185116392.gif", "media.naver.com/press/028",  "������"));
		this.news.add(new NewsClass("�ѱ��Ϻ�", "nsd141114194.gif", "media.naver.com/press/038",  "������"));
		this.news.add(new NewsClass("NEWis", "nsd165223437.gif", "media.naver.com/press/003",  "������"));
		this.news.add(new NewsClass("jijicom", "nsd112912516.gif", "media.naver.com/press/376",  "������"));
		this.news.add(new NewsClass("�ѱ�����", "nsd10118864.gif", "media.naver.com/press/215",  "������"));
		this.news.add(new NewsClass("KBS", "nsd164033826.gif", "media.naver.com/press/056",  "������"));
		this.news.add(new NewsClass("MBC", "nsd1453778.gif", "media.naver.com/press/214",  "������"));
		this.news.add(new NewsClass("MBN", "nsd163758547.gif", "media.naver.com/press/057",  "������"));
		this.news.add(new NewsClass("SBS", "nsd183257911.gif", "media.naver.com/press/055",  "������"));
		this.news.add(new NewsClass("YTN", "nsd17425192.gif", "media.naver.com/press/052",  "������"));
		this.news.add(new NewsClass("���ϰ���", "nsd113526120.gif", "media.naver.com/press/009",  "������"));
		this.news.add(new NewsClass("�Ӵ�������", "nsd113754824.gif", "media.naver.com/press/008",  "������"));
		this.news.add(new NewsClass("�������", "nsd15338959.gif", "media.naver.com/press/011",  "������"));
		this.news.add(new NewsClass("�ƽþư���", "nsd165753754.gif", "media.naver.com/press/277",  "������"));
		this.news.add(new NewsClass("�̵��ϸ�", "nsd111247840.gif", "media.naver.com/press/018",  "������"));
		this.news.add(new NewsClass("ChosunBiz", "nsd19334215.gif", "media.naver.com/press/366",  "������"));
		this.news.add(new NewsClass("���̳��ȴ���", "nsd141641302.gif", "media.naver.com/press/014",  "������"));
		this.news.add(new NewsClass("�ѱ�����", "nsd162034351.gif", "media.naver.com/press/015",  "������"));
		this.news.add(new NewsClass("�ط������", "nsd182749494.gif", "media.naver.com/press/016",  "������"));
		this.news.add(new NewsClass("���ƴ���", "nsd101424267.gif", "media.naver.com/press/079",  "���ͳ�"));
		this.news.add(new NewsClass("NEWDAILY", "nsd102245777.gif", "media.naver.com/press/327",  "���ͳ�"));
		this.news.add(new NewsClass("���ϸ���", "nsd184410246.gif", "media.naver.com/press/368",  "���ͳ�"));
		this.news.add(new NewsClass("�̵�����", "nsd124110953.gif", "media.naver.com/press/006",  "���ͳ�"));
		this.news.add(new NewsClass("OhmyNews", "nsd102039590.gif", "media.naver.com/press/047",  "���ͳ�"));
		this.news.add(new NewsClass("PRESSian", "nsd184630885.gif", "media.naver.com/press/002",  "���ͳ�"));
		this.news.add(new NewsClass("������Ÿ�ӽ�", "nsd144911195.gif", "media.naver.com/press/029",  "IT������"));
		this.news.add(new NewsClass("����ʹ��", "nsd16353971.gif", "media.naver.com/press/293",  "IT������"));
		this.news.add(new NewsClass("���̴���24", "nsd113110902.gif", "media.naver.com/press/031",  "IT������"));
		this.news.add(new NewsClass("����Ʈ��Ʈ����", "nsd16110689.gif", "media.naver.com/press/372",  "IT������"));
		this.news.add(new NewsClass("���ڽŹ�", "nsd11405830.gif", "media.naver.com/press/030",  "IT������"));
		this.news.add(new NewsClass("JOONGANG DAILY", "nsd113635939.gif", "media.naver.com/press/330",  "IT������"));
		this.news.add(new NewsClass("Net Korea", "nsd18341092.gif", "media.naver.com/press/092",  "IT������"));
		this.news.add(new NewsClass("THE KOREA TIMES", "nsd92244365.gif", "media.naver.com/press/040",  "IT������"));
		this.news.add(new NewsClass("The Korea Herald", "nsd183039979.gif", "media.naver.com/press/044",  "IT������"));
		this.news.add(new NewsClass("KBS WORLD", "nsd14465916.gif", "media.naver.com/press/326",  "IT������"));
		this.news.add(new NewsClass("���̵��ϸ�", "nsd113852954.gif", "media.naver.com/press/117",  "����������"));
		this.news.add(new NewsClass("����������", "nsd16247594.gif", "media.naver.com/press/314",  "����������"));
		this.news.add(new NewsClass("����������", "nsd184854466.gif", "media.naver.com/press/073",  "����������"));
		this.news.add(new NewsClass("����������", "nsd184717404.gif", "media.naver.com/press/076",  "����������"));
		this.news.add(new NewsClass("sportalkorea", "nsd16579942.gif", "media.naver.com/press/139",  "����������"));
		this.news.add(new NewsClass("�ϰ�������", "nsd113052387.gif", "media.naver.com/press/241",  "����������"));
		this.news.add(new NewsClass("OSEN", "nsd102852391.gif", "media.naver.com/press/109",  "����������"));
		this.news.add(new NewsClass("GameMeca", "nsd183724.gif", "media.naver.com/press/356",  "�Ű���������"));
		this.news.add(new NewsClass("���е���", "nsd165049622.gif", "media.naver.com/press/363",  "�Ű���������"));
		this.news.add(new NewsClass("jungle", "nsd165310840.gif", "media.naver.com/press/345",  "�Ű���������"));
		this.news.add(new NewsClass("Software", "nsd113744707.gif", "media.naver.com/press/357",  "�Ű���������"));
		this.news.add(new NewsClass("�����Ź�", "nsd165524289.gif", "media.naver.com/press/122",  "�Ű���������"));
		this.news.add(new NewsClass("ScienceTimes", "nsd113446808.gif", "media.naver.com/press/355",  "�Ű���������"));
		this.news.add(new NewsClass("�ҳ��ѱ��Ϻ�", "nsd102746161.gif", "media.naver.com/press/329",  "�Ű���������"));
		this.news.add(new NewsClass("STYLECOM", "nsd18366175.gif", "media.naver.com/press/367",  "�Ű���������"));
		this.news.add(new NewsClass("�û�IN Live", "nsd182936757.gif", "media.naver.com/press/308",  "�Ű���������"));
		this.news.add(new NewsClass("����21", "nsd185025147.gif", "media.naver.com/press/140",  "�Ű���������"));
		this.news.add(new NewsClass("Ablenews", "nsd184148949.gif", "media.naver.com/press/328",  "�Ű���������"));
		this.news.add(new NewsClass("ELLE", "nsd16411268.gif", "media.naver.com/press/354",  "�Ű���������"));
		this.news.add(new NewsClass("�����Ź�", "nsd164815489.gif", "media.naver.com/press/310",  "�Ű���������"));
		this.news.add(new NewsClass("CARLIFE", "nsd135857948.gif", "media.naver.com/press/362",  "�Ű���������"));
		this.news.add(new NewsClass("�����Ź�", "nsd101830214.gif", "media.naver.com/press/123",  "�Ű���������"));
		this.news.add(new NewsClass("ä�ο���", "nsd14034411.gif", "media.naver.com/press/361",  "�Ű���������"));
		this.news.add(new NewsClass("�ڸ޵����", "nsd14156354.gif", "media.naver.com/press/296",  "�Ű���������"));
		this.news.add(new NewsClass("�Ѱ�BUSINESS", "nsd114627265.gif", "media.naver.com/press/050",  "�Ű���������"));
		this.news.add(new NewsClass("�ѱ����нŹ�", "nsd18493839.gif", "media.naver.com/press/384",  "�Ű���������"));
		this.news.add(new NewsClass("�ｺ����", "nsd17329660.gif", "media.naver.com/press/346",  "�Ű���������"));
		this.news.add(new NewsClass("EBS", "nsd145514832.gif", "media.naver.com/press/344",  "�Ű���������"));
		this.news.add(new NewsClass("PC���", "nsd15129878.gif", "media.naver.com/press/364",  "�Ű���������"));
		this.news.add(new NewsClass("���������Ϻ�", "nsd16493440.gif", "media.naver.com/press/335",  "������"));
		this.news.add(new NewsClass("�����Ϻ�", "nsd18354817.gif", "media.naver.com/press/087",  "������"));
		this.news.add(new NewsClass("����Ϻ�", "nsd142922938.gif", "media.naver.com/press/339",  "������"));
		this.news.add(new NewsClass("�泲�Ϻ�", "nsd11120405.gif", "media.naver.com/press/333",  "������"));
		this.news.add(new NewsClass("����Ϻ�", "nsd103125356.gif", "media.naver.com/press/337",  "������"));
		this.news.add(new NewsClass("�����Ϻ�", "nsd75053515.gif", "media.naver.com/press/338",  "������"));
		this.news.add(new NewsClass("�����Ϻ�", "nsd113635473.gif", "media.naver.com/press/083",  "������"));
		this.news.add(new NewsClass("�����Ź�", "nsd11332053.gif", "media.naver.com/press/332",  "������"));
		this.news.add(new NewsClass("�����Ϻ�", "nsd11342450.gif", "media.naver.com/press/089",  "������"));
		this.news.add(new NewsClass("���ϽŹ�", "nsd184317799.gif", "media.naver.com/press/088",  "������"));
		this.news.add(new NewsClass("�λ��Ϻ�", "nsd8215253.gif", "media.naver.com/press/082",  "������"));
		this.news.add(new NewsClass("�����Ϻ�", "nsd165845221.gif", "media.naver.com/press/385",  "������"));
		this.news.add(new NewsClass("������", "nsd14643703.gif", "media.naver.com/press/386",  "������"));
		this.news.add(new NewsClass("��õ�Ϻ�", "nsd14814726.gif", "media.naver.com/press/387",  "������"));
		this.news.add(new NewsClass("�����Ϻ�", "nsd14941869.gif", "media.naver.com/press/388",  "������"));
		this.news.add(new NewsClass("�����Ϻ�", "nsd183759971.gif", "media.naver.com/press/336",  "������"));
		this.news.add(new NewsClass("���ֵ����Ϻ�", "nsd19513821.gif", "media.naver.com/press/389",  "������"));
		this.news.add(new NewsClass("�����ǼҸ�", "nsd115524760.gif", "media.naver.com/press/334",  "������"));
		this.news.add(new NewsClass("�ߵ��Ϻ�", "nsd17122649.gif", "media.naver.com/press/390",  "������"));
		this.news.add(new NewsClass("��û�Ϻ�", "nsd162144955.gif", "media.naver.com/press/391",  "������"));
		this.news.add(new NewsClass("��û������", "nsd14118621.gif", "media.naver.com/press/331",  "������"));
		this.news.add(new NewsClass("OBS", "nsd101932455.gif", "media.naver.com/press/340",  "������"));
	}

}
