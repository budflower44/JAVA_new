package new01;

import java.util.*;

public class New05 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// new 04 Ŭ������ �ܾ����� �޼���� �и�
		// �޼��忡�� ������ map�� �޾Ƽ� ���
		
		HashMap<String, String> wordBook = new HashMap<>();

		
		a: while(true) {
			System.out.println("�ܾ �Է��Ͻ÷��� 1���� �������ּ���. �ƴϸ� 2��");
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
			System.out.println("�ܾ� : "+tmp+", �ǹ� : "+wordBook.get(tmp));
		}
	}
	
	//��� : �ܾ�:�ǹ̸� �Է¹޾� map�� ����
	//map�� �޼��� �ȿ��� �����Ͽ� ����
	//make()
	public static HashMap<String, String> make() {
		HashMap<String, String> wordMap = new HashMap<>();
		
		
		System.out.println("�ܾ� �Է�");
		String key = scan.next();
		System.out.println("�ǹ� �Է�");
		String value = scan.next();
		wordMap.put(key, value);
		
		return wordMap;
	}
	
	
}
