package word;

import java.util.*;

public class WordManager_list {
	
	Word_list wd = new Word_list();
//	Scanner scan = new Scanner(System.in);
	String word = "";
	String mean = "";
	
	ArrayList<Word_list> al = new ArrayList<Word_list>();
	
	public void inputWord(Scanner scan) {
		System.out.println("단어 입력");
		word = scan.next();
		System.out.println("의미 입력");
		mean = scan.next();
		al.add(new Word_list(word, mean));
	}
	
	public void searchWord(Scanner scan) {
		System.out.println("검색할 단어 입력");
		String search = scan.next();
		for(int i=0; i<al.size(); i++) {
			if(!al.get(i).getWord().contains(search)) {
				System.out.println("찾으시는 단어가 없습니다.");
				break;
			}else if(search.equals(al.get(i).getWord())) {
				System.out.println(al.get(i));
				break;
			}
		}
		
	}
	
	public void fixedWord(Scanner scan) {
		System.out.println("수정할 단어 입력");
		String search = scan.next();
		for(int i=0; i<al.size(); i++) {
			if(!al.get(i).getWord().contains(search)) {
				System.out.println("찾으시는 단어가 없습니다.");
				break;
			}else if(search.equals(al.get(i).getWord())) {
				al.remove(i);
				System.out.println("수정 단어 입력");
				String fixWord = scan.next();
				System.out.println("수정 의미 입력");
				String fixMean = scan.next();
				al.add(new Word_list(fixWord, fixMean));
			}
		}
	}
	
	public void printWords() {
		System.out.println(al);
	}

	

}
