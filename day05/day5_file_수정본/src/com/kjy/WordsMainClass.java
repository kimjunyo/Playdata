package com.kjy;

public class WordsMainClass {

	public static void main(String[] args) {
		WordsDataClass wdc=new WordsDataClass("C:\\filetest\\words.txt");
		int[] counts=WordsMethodClass.searchWords("C:\\filetest\\hadup.txt", wdc.words);
		String tags=WordsMethodClass.createHTML(counts, wdc.words);
		WordsPrintClass.saveHTML("C:\\filetest\\search.html", tags);
	}

}
