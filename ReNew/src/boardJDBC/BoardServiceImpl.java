package boardJDBC;

import java.util.List;

public class BoardServiceImpl implements Service {
	
	private DAO dao;
	
	public BoardServiceImpl() {
		dao = new BoardDAOImpl();
	}
	
	//�޼��� ó��
	
	//�۾���
	@Override
	public int write(BoardVO bVO) {
		// TODO Auto-generated method stub
		System.out.println("write service success!!");
		return dao.insert(bVO);
	}
	
	//��ü ����Ʈ
	@Override
	public List<BoardVO> showList() {
		// TODO Auto-generated method stub
		System.out.println("showList service success!!");
		return dao.selectList();
	}
	
	//�Ѱ��� ����
	@Override
	public BoardVO showListOne(int bno) {
		// TODO Auto-generated method stub
		System.out.println("showListOne service success!!");
		return dao.selectOne(bno);
	}
	
	//�� ����
	@Override
	public int modify(BoardVO bVO) {
		// TODO Auto-generated method stub
		System.out.println("modify service success!!");
		return dao.update(bVO);
	}

	@Override
	public int remove(int bno) {
		// TODO Auto-generated method stub
		System.out.println("remove service success!!");
		return dao.delete(bno);
	}

	@Override
	public boolean checkNum(int bno) {
		// TODO Auto-generated method stub
		return dao.checkNum(bno);
	}
}
