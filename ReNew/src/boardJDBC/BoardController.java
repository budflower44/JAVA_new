package boardJDBC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardController {
	
	private Scanner scan;
	private Service svc;
	private boolean flag;
	
	public BoardController() {
		scan = new Scanner(System.in);
		svc = new BoardServiceImpl();
		flag = true;
		printMenu();
	}

	private void printMenu() {
		while(flag) {
			System.out.println("--�Խ���--");
			System.out.println("1.�۾���|2.�۸�Ϻ���|3.�ۻ󼼺���");
			System.out.println("4.�ۼ���|5.�ۻ���|6.����");
			System.out.println(">> �޴����� : ");
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1: write();
				break;
			case 2: showList();
				break;
			case 3: showListOne();
				break;
			case 4: modify();
				break;
			case 5: remove();
				break;
				default: flag = false; break;
			}
		}
	}

	private void remove() {
		// TODO Auto-generated method stub
		System.out.println("������ �� ��ȣ �Է�");
		int bno = scan.nextInt();
		if(svc.checkNum(bno)) {
			int isOk = svc.remove(bno);
			System.out.println("�� ����"+(isOk>0?"����":"����"));
		}else {
			System.out.println("ã�� ��ȣ�� �����ϴ�.");
		}
	}
	
	//�� ������ : bno, title, content
	private void modify() {
		// TODO Auto-generated method stub
		// bno  //update board set title = '��������', content= '���࿤��', moddate = now() where bno = 1;
		System.out.println("������ �� ��ȣ �Է�");
		int bno = scan.nextInt();
		if(svc.checkNum(bno)) {
			System.out.println("������ ���� �Է�");
			scan.nextLine();
			String title = scan.nextLine();
			System.out.println("������ ���� �Է�");
			String content = scan.nextLine();
		
			BoardVO bVO = new BoardVO(bno, title, content);
			int isOk = svc.modify(bVO);
			System.out.println("����"+(isOk>0?"�Ϸ�":"����"));
		}else {
			System.out.println("ã�� ��ȣ�� �����ϴ�.");
		}
		
	}
	
	//�� �������� : ��ü  //printDetail()
	private void showListOne() {
		// TODO Auto-generated method stub
		// bno �Ű����� -> select * from board where bno = 1;
		System.out.println("�� ���� ��ȣ �Է�");
		int bno = scan.nextInt();
		if(svc.checkNum(bno)) {
			BoardVO bVO = svc.showListOne(bno);
			if (bVO != null) {
	            // �ش� ��ȣ�� ���� �����ϸ� ���
	            bVO.printDetail();	
			}
		}else {
			System.out.println("ã�� ��ȣ�� �����ϴ�.");
		}
	}
	
	//��ü ����Ʈ�� : bno, title, writer, moddate
	private void showList() {
		// TODO Auto-generated method stub
		List<BoardVO> list = svc.showList();
		System.out.println("--��ü �� ����Ʈ--");
		for(BoardVO b : list) {
			System.out.println(b);
		}
	}
	
	//�۾���� : title, writer, content
	private void write() {
		// TODO Auto-generated method stub
		System.out.println("--�۾���--");
		System.out.println("���� �Է�");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.println("�ۼ��� �Է�");
		String writer = scan.next();
		System.out.println("���� �Է�");
		scan.nextLine();
		String content = scan.nextLine();
		
		BoardVO bVO = new BoardVO(title, writer, content);
		
		int isOk = svc.write(bVO);
		System.out.println("�۾��� "+(isOk>0?"����":"����"));
		
	}
	
}
