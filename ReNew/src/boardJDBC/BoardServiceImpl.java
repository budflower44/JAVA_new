package boardJDBC;

import java.util.List;

public class BoardServiceImpl implements Service {
	
	private DAO dao;
	
	public BoardServiceImpl() {
		dao = new BoardDAOImpl();
	}
	
	//메서드 처리
	
	//글쓰기
	@Override
	public int write(BoardVO bVO) {
		// TODO Auto-generated method stub
		System.out.println("write service success!!");
		return dao.insert(bVO);
	}
	
	//전체 리스트
	@Override
	public List<BoardVO> showList() {
		// TODO Auto-generated method stub
		System.out.println("showList service success!!");
		return dao.selectList();
	}
	
	//한개만 추출 (detail)
	@Override
	public BoardVO showListOne(int bno) {
		// detail 페이지 열기
		System.out.println("showListOne service success!!");
		//update 잘 처리되면 1리턴
		int isOk = dao.insertReadCount(bno);
		return (isOk>0) ? dao.selectOne(bno):null;
	}
	
	//글 수정
	@Override
	public int modify(BoardVO bVO) {
		// TODO Auto-generated method stub
		System.out.println("modify service success!!");
		return dao.update(bVO);
	}
	
	//글 삭제
	@Override
	public int remove(int bno) {
		// TODO Auto-generated method stub
		System.out.println("remove service success!!");
		return dao.delete(bno);
	}
	
	//동일넘버 체크
	@Override
	public boolean checkNum(int bno) {
		// TODO Auto-generated method stub
		System.out.println("checkNum service success!!");
		return dao.checkNum(bno);
	}

}
