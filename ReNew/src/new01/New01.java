package new01;

import java.time.LocalDateTime;
import java.util.Date;

public class New01 {

	public static void main(String[] args) {
		/* ȫ�浿 �ֹε�Ϲ�ȣ�� 881122-1234567�̴�
		 * ������� => ������� : 881122, ���� : ��(1,3) ��(2,4)
		 * */
		String pin = "881122-1234567";
		
		String arr [] = pin.split("-");
		String arr2 [] = arr[1].split("");
		String gender = "";
		
		if(arr2[0].equals("2") || arr2[0].equals("4")) {
			gender = "��";
		}else {
			gender = "��";
		}
		
		System.out.println("������� : "+arr[0]+", ���� : "+gender);
		
		//������ Ǯ��
		String pin1 = "881122-1234567";
		String birth = pin.substring(0, pin.indexOf("-"));
		System.out.println("������� : "+birth);
		String ch = pin.substring(pin.indexOf("-")+1,8);
		//System.out.println(ch);
		//char '' == / String "" equals()
		
		if(ch.equals("1") || ch.equals("3")) {
			System.out.println("���� : ��");
		}else {
			System.out.println("���� : ��");
		}

	}

}
