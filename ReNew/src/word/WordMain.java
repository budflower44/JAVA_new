package word;

import java.util.*;

public class WordMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WordManager wm = new WordManager();
		
		Scanner scan = new Scanner(System.in);
		int a = 1;
		
		do {
			System.out.println("�޴� ��ȣ �Է�");
			System.out.println("1. �ܾ��� | 2. �ܾ�˻� | 3. �ܾ���� | 4. �ܾ���� | 5. ����");
			int menuNum = scan.nextInt();
			switch(menuNum) {
			case 1 : wm.inputWord(scan); break;
			case 2 : wm.searchWord(scan); break;
			case 3 : wm.fixedWord(scan); break;
			case 4 : wm.printWords(); break;
			case 5 : a=0; break;
				default : break;
			}
		}while(a==1);
		
		
		scan.close();
	}

}
