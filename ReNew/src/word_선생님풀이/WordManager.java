package word_선생님풀이;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WordManager {

	private ArrayList<Word> list = new ArrayList<>(); 
	
	public void insertWord(Scanner scan) {
		// 단어등록
		System.out.println("단어:");
		String word = scan.next();
		System.out.println("의미:");
		String mean = scan.next();
		
		Word w = new Word(word, mean);
		list.add(w);
		System.out.println("등록완료");
	}

	public void searchWord(Scanner scan) {
		// 단어 검색
		System.out.println("검색단어:");
		String w = scan.next();
		for(Word tmp : list) {
			if(tmp.getWord().equals(w)) {
				System.out.println("--검색결과--");
				System.out.println(tmp);
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}

	public void modifyWord(Scanner scan) {
		// 단어 수정 : 의미만 수정
		System.out.println("수정단어:");
		String w = scan.next();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWord().equals(w)) {
				System.out.println("의미입력:");
				String m = scan.next();
				//list.get(i).setMean(m);
				//단어도 같이 수정해야할 때 편리
				Word word = new Word(w,m);
				list.set(i, word);
			}
		}
		System.out.println("검색 결과가 없습니다.");
		
	}

	public void printWord() {
		// 단어 전체 출력
		System.out.println("--단어장--");
		for(Word tmp : list) {
			System.out.println(tmp);
		}
		
	}

	public void filePrint() throws IOException {
		// 파일로 출력
			FileWriter fw = new FileWriter("word.text");
			BufferedWriter bw = new BufferedWriter(fw);
			
			StringBuffer sb = new StringBuffer();
			
			String data = "";
			int cnt = 0; //리스트의 index
			
			while(cnt <list.size()) {
				sb.append(list.get(cnt).toString());
				sb.append("\r\n"); //줄바꿈
				cnt++;
			}
			data = sb.toString();
			System.out.println(data);
			fw.write(data);
			fw.close();
	}

}
