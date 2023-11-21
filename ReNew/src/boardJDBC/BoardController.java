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
			System.out.println("--게시판--");
			System.out.println("1.글쓰기|2.글목록보기|3.글상세보기");
			System.out.println("4.글수정|5.글삭제|6.종료");
			System.out.println(">> 메뉴선택 : ");
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
		System.out.println("삭제할 글 번호 입력");
		int bno = scan.nextInt();
		if(svc.checkNum(bno)) {
			int isOk = svc.remove(bno);
			System.out.println("글 삭제"+(isOk>0?"성공":"실패"));
		}else {
			System.out.println("찾는 번호가 없습니다.");
		}
	}
	
	//글 수정용 : bno, title, content
	private void modify() {
		// TODO Auto-generated method stub
		// bno  //update board set title = '시향기수정', content= '오듀엘르', moddate = now() where bno = 1;
		System.out.println("수정할 글 번호 입력");
		int bno = scan.nextInt();
		if(svc.checkNum(bno)) {
			System.out.println("수정할 제목 입력");
			scan.nextLine();
			String title = scan.nextLine();
			System.out.println("수정할 내용 입력");
			String content = scan.nextLine();
		
			BoardVO bVO = new BoardVO(bno, title, content);
			int isOk = svc.modify(bVO);
			System.out.println("수정"+(isOk>0?"완료":"실패"));
		}else {
			System.out.println("찾는 번호가 없습니다.");
		}
		
	}
	
	//상세 페이지용 : 전체  //printDetail()
	private void showListOne() {
		// TODO Auto-generated method stub
		// bno 매개변수 -> select * from board where bno = 1;
		System.out.println("상세 보기 번호 입력");
		int bno = scan.nextInt();
		if(svc.checkNum(bno)) {
			BoardVO bVO = svc.showListOne(bno);
			if (bVO != null) {
	            // 해당 번호의 글이 존재하면 출력
	            bVO.printDetail();	
			}
		}else {
			System.out.println("찾는 번호가 없습니다.");
		}
	}
	
	//전체 리스트용 : bno, title, writer, moddate
	private void showList() {
		// TODO Auto-generated method stub
		List<BoardVO> list = svc.showList();
		System.out.println("--전체 글 리스트--");
		for(BoardVO b : list) {
			System.out.println(b);
		}
	}
	
	//글쓰기용 : title, writer, content
	private void write() {
		// TODO Auto-generated method stub
		System.out.println("--글쓰기--");
		System.out.println("제목 입력");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.println("작성자 입력");
		String writer = scan.next();
		System.out.println("내용 입력");
		scan.nextLine();
		String content = scan.nextLine();
		
		BoardVO bVO = new BoardVO(title, writer, content);
		
		int isOk = svc.write(bVO);
		System.out.println("글쓰기 "+(isOk>0?"성공":"실패"));
		
	}
	
}
