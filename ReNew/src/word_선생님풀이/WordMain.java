package word_선생님풀이;

import java.io.IOException;
import java.util.*;

public class WordMain {

	public static void main(String[] args) {
		// mane 1.단어등록2.단어검색3.단어수정4.단어출력5.종료
		
		Scanner scan = new Scanner(System.in);
		WordManager wm = new WordManager();
		
		int menu = -1;
		
		do {
			System.out.println("1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.파일로출력|6.종료");
			System.out.println("menu >> ");
			menu = scan.nextInt();
			try {
			switch(menu) {
			case 1: wm.insertWord(scan); break;
			case 2: wm.searchWord(scan); break;
			case 3: wm.modifyWord(scan); break;
			case 4: wm.printWord(); break;
			case 5: wm.filePrint(); break;
			case 6: System.out.println("종료"); break;
			default :
				System.out.println("잘못된 메뉴~!!");
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("파일 출력 error!!");
				e.printStackTrace();
			}
		}while(menu != 6);
	}

}
