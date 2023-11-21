package word;

import java.util.*;

public class WordManager {
	
	Word wd = new Word();
//	Scanner scan = new Scanner(System.in);
	String word = "";
	String mean = "";
	
	public void inputWord(Scanner scan) {
		System.out.println("단어 입력");
		word = scan.next();
		System.out.println("의미 입력");
		mean = scan.next();
		wd.wordMap(word, mean);
	}
	
	public void searchWord(Scanner scan) {
		System.out.println("검색할 단어 입력");
		String search = scan.next();
		for(String key : wd.wordMap(word, mean).keySet()) {
			if(wd.wordMap(word, mean).containsKey(key)) {
				System.out.println("찾으시는 단어가 없습니다.");
			}else if(key.equals(search)) {
				System.out.println(key+" : "+wd.wordMap(word, mean).get(key));				
			}
		}
		
	}
	
	public void fixedWord(Scanner scan) {
		System.out.println("수정할 단어 입력");
		String search = scan.next();
		for(String key : wd.wordMap(word, mean).keySet()) {
			if(wd.wordMap(word, mean).containsKey(key)) {
				System.out.println("찾으시는 단어가 없습니다.");
			}else if(key.equals(search)) {
				wd.wordMap(word, mean).remove(key, wd.wordMap(word, mean).get(key));
				System.out.println("수정 단어 입력");
				String fixWord = scan.next();
				System.out.println("수정 의미 입력");
				String fixMean = scan.next();
				wd.removeWord(key, fixWord, fixMean);
			}
		}
	}
	
	public void printWords() {
//		System.out.println(wd.wordMap(word, mean));
		for(String key : wd.wordMap(word, mean).keySet()) {
			System.out.println(key+" : "+wd.wordMap(word, mean).get(key));
		}
	}

	

}
