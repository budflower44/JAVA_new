package new01;

import java.util.Scanner;

public class New02 {

	public static void main(String[] args) {
		// for �� �̿��Ͽ� 1~10���� ¦���� ���
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i+" ");				
			}
		}
		System.out.println();
		
		//1���� ���� �Է��� ������ 5�� ����� ���
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int userNum = scan.nextInt();
		
		for(int i=1; i<=userNum; i++) {
			if(i%5==0) {
				System.out.print(i+" ");
			}
		}
		
		scan.close();
	}

}
