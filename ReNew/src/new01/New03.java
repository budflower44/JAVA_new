package new01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class New03 {

	public static void main(String[] args) {
		/* �÷��� �����ӿ�ũ
		 * 
		 * List, Set, Map
		 * - List : ������ ����, �ߺ����� ����, �迭�� ����
		 * - Set : ������ �������� ����, �ߺ����� �ȵ�.
		 * - Map : 2���� �����͸� ������ ����, �������� X
		 *  - key(�ߺ��Ұ���), value(�ߺ�����)
		 * */
		
		// ����Ʈ�� �����ϰ� 1���� 10���� ������ �� ���
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		for(Integer temp : list) {
			System.out.print(temp+" ");
		}
		
		System.out.println();
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("ȫ�浿", 89);
		map.put("�迵��", 78);
		map.put("��ö��", 48);
		
		System.out.println(map);
		
		for(String tmp : map.keySet()) {
			System.out.println(tmp+" : "+map.get(tmp));
		}
		
	}

}
