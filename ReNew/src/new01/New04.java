package new01;

import java.util.*;

public class New04 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어 : 의미
		 * 
		 * map으로 생성
		 * 입력받을 단어의 개수를 받아서 그 만큼 map에 추가
		 * 콘솔에 찍기
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, String> wordBook = new HashMap<>();
		
		a : while(true) {
			System.out.println("단어를 입력하시려면 1번을 선택해주세요. 아니면 2번");
			int choose = scan.nextInt();
			switch(choose) {
			case 1 : 
				System.out.println("단어 입력"); 
				String word = scan.next();
				System.out.println("뜻 입력"); 
				String mean = scan.next();
				wordBook.put(word, mean);
			break;
			case 2 : break a;
			default : break;
			}
		}
		System.out.println(wordBook);
		
		for(String tmp : wordBook.keySet()) {
			System.out.println("단어 : "+tmp+", 의미 : "+wordBook.get(tmp));
		}
		
		//선생님풀이
		HashMap<String, String> map = new HashMap<>();
		
		System.out.println("단어 개수 : ");
		int size = scan.nextInt();
		
		while(map.size()<size) {
			System.out.println("단어 : ");
			String word = scan.next();
			System.out.println("의미 : ");
			String mean = scan.next();
			
			map.put(word, mean);
		}
		
		Iterator<String>it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();
			System.out.println(word+":"+map.get(word));
		}
		
		
		scan.close();
	}

}
