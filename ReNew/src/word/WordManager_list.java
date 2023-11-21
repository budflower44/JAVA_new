package word;

import java.util.*;

public class WordManager_list {
	
	Word_list wd = new Word_list();
//	Scanner scan = new Scanner(System.in);
	String word = "";
	String mean = "";
	
	ArrayList<Word_list> al = new ArrayList<Word_list>();
	
	public void inputWord(Scanner scan) {
		System.out.println("�ܾ� �Է�");
		word = scan.next();
		System.out.println("�ǹ� �Է�");
		mean = scan.next();
		al.add(new Word_list(word, mean));
	}
	
	public void searchWord(Scanner scan) {
		System.out.println("�˻��� �ܾ� �Է�");
		String search = scan.next();
		for(int i=0; i<al.size(); i++) {
			if(!al.get(i).getWord().contains(search)) {
				System.out.println("ã���ô� �ܾ �����ϴ�.");
				break;
			}else if(search.equals(al.get(i).getWord())) {
				System.out.println(al.get(i));
				break;
			}
		}
		
	}
	
	public void fixedWord(Scanner scan) {
		System.out.println("������ �ܾ� �Է�");
		String search = scan.next();
		for(int i=0; i<al.size(); i++) {
			if(!al.get(i).getWord().contains(search)) {
				System.out.println("ã���ô� �ܾ �����ϴ�.");
				break;
			}else if(search.equals(al.get(i).getWord())) {
				al.remove(i);
				System.out.println("���� �ܾ� �Է�");
				String fixWord = scan.next();
				System.out.println("���� �ǹ� �Է�");
				String fixMean = scan.next();
				al.add(new Word_list(fixWord, fixMean));
			}
		}
	}
	
	public void printWords() {
		System.out.println(al);
	}

	

}
