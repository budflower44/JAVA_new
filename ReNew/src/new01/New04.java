package new01;

import java.util.*;

public class New04 {

	public static void main(String[] args) {
		/* �ܾ���
		 * �ܾ� : �ǹ�
		 * 
		 * map���� ����
		 * �Է¹��� �ܾ��� ������ �޾Ƽ� �� ��ŭ map�� �߰�
		 * �ֿܼ� ���
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, String> wordBook = new HashMap<>();
		
		a : while(true) {
			System.out.println("�ܾ �Է��Ͻ÷��� 1���� �������ּ���. �ƴϸ� 2��");
			int choose = scan.nextInt();
			switch(choose) {
			case 1 : 
				System.out.println("�ܾ� �Է�"); 
				String word = scan.next();
				System.out.println("�� �Է�"); 
				String mean = scan.next();
				wordBook.put(word, mean);
			break;
			case 2 : break a;
			default : break;
			}
		}
		System.out.println(wordBook);
		
		for(String tmp : wordBook.keySet()) {
			System.out.println("�ܾ� : "+tmp+", �ǹ� : "+wordBook.get(tmp));
		}
		
		//������Ǯ��
		HashMap<String, String> map = new HashMap<>();
		
		System.out.println("�ܾ� ���� : ");
		int size = scan.nextInt();
		
		while(map.size()<size) {
			System.out.println("�ܾ� : ");
			String word = scan.next();
			System.out.println("�ǹ� : ");
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
