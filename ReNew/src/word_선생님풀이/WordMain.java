package word_������Ǯ��;

import java.io.IOException;
import java.util.*;

public class WordMain {

	public static void main(String[] args) {
		// mane 1.�ܾ���2.�ܾ�˻�3.�ܾ����4.�ܾ����5.����
		
		Scanner scan = new Scanner(System.in);
		WordManager wm = new WordManager();
		
		int menu = -1;
		
		do {
			System.out.println("1.�ܾ���|2.�ܾ�˻�|3.�ܾ����|4.�ܾ����|5.���Ϸ����|6.����");
			System.out.println("menu >> ");
			menu = scan.nextInt();
			try {
			switch(menu) {
			case 1: wm.insertWord(scan); break;
			case 2: wm.searchWord(scan); break;
			case 3: wm.modifyWord(scan); break;
			case 4: wm.printWord(); break;
			case 5: wm.filePrint(); break;
			case 6: System.out.println("����"); break;
			default :
				System.out.println("�߸��� �޴�~!!");
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("���� ��� error!!");
				e.printStackTrace();
			}
		}while(menu != 6);
	}

}
