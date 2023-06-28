package com.kjy;

public class FileMainClass {

	public static void main(String[] args) {
//		FileMethodClass.filewrite("c:/filetest/text.txt");
//		FileMethodClass.fileread("C:\\Workingspace\\day5_file\\src\\com\\kjy\\FileMethodClass.java");
//		int[] test= {10,20,30,40,50};
//		for(int num:test) {
//			System.out.println(num);
//		}
		String uri="C:\\filetest\\words.txt";
		FileDataClass fdc=new FileDataClass(uri);
		System.out.println(fdc.words.get(0));
		int[] counts=FileMethodClass.fileread("C:\\filetest\\hadup.txt", fdc.words);
		String tags=FileMethodClass.createHTML(fdc.words, counts);
		FilePrintClass.saveHTML("C:\\filetest\\search.html", tags);
	}

}
