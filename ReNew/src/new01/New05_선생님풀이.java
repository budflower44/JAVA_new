package new01;

import java.util.*;

public class New05_������Ǯ�� {

	public static void main(String[] args) {
		// new 04 Ŭ������ �ܾ����� �޼���� �и�
		// �޼��忡�� ������ map�� �޾Ƽ� ���
		HashMap<String, String> map = make();
		System.out.println(map);
		
		for(String key : map.keySet()) {
			System.out.println(key+" : "+map.get(key));
		}
	}
	
	//��� : �ܾ�:�ǹ̸� �Է¹޾� map�� ����
	//map�� �޼��� �ȿ��� �����Ͽ� ����
	//make()

	public static HashMap<String, String> make(){
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է¹��� ���� : ");
		int size = scan.nextInt();
		
		while(map.size() < size) {
			System.out.println("�ܾ� : ");
			String word = scan.next();
			System.out.println("�ǹ� : ");
			String mean = scan.next();
			
			map.put(word, mean);
		}
		return map;
	}
}
