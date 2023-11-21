package new01;

import java.util.*;

public class New05 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// new 04 클래스의 단어장을 메서드로 분리
		// 메서드에서 리턴한 map을 받아서 출력
		
		HashMap<String, String> wordBook = new HashMap<>();

		
		a: while(true) {
			System.out.println("단어를 입력하시려면 1번을 선택해주세요. 아니면 2번");
			int choose = scan.nextInt();
			switch(choose) {
			case 1 : 
				wordBook = make();
			break;
			case 2 : break a;
			default : break;
			}
		}
		
		for(String tmp : wordBook.keySet()) {
			System.out.println("단어 : "+tmp+", 의미 : "+wordBook.get(tmp));
		}
	}
	
	//기능 : 단어:의미를 입력받아 map을 구성
	//map은 메서드 안에서 생성하여 리턴
	//make()
	public static HashMap<String, String> make() {
		HashMap<String, String> wordMap = new HashMap<>();
		
		
		System.out.println("단어 입력");
		String key = scan.next();
		System.out.println("의미 입력");
		String value = scan.next();
		wordMap.put(key, value);
		
		return wordMap;
	}
	
	
}
