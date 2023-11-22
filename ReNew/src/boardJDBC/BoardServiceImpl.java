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
	
	//�Ѱ��� ���� (detail)
	@Override
	public BoardVO showListOne(int bno) {
		// detail ������ ����
		System.out.println("showListOne service success!!");
		//update �� ó���Ǹ� 1����
		int isOk = dao.insertReadCount(bno);
		return (isOk>0) ? dao.selectOne(bno):null;
	}
	
	//�� ����
	@Override
	public int modify(BoardVO bVO) {
		// TODO Auto-generated method stub
		System.out.println("modify service success!!");
		return dao.update(bVO);
	}
	
	//�� ����
	@Override
	public int remove(int bno) {
		// TODO Auto-generated method stub
		System.out.println("remove service success!!");
		return dao.delete(bno);
	}
	
	//���ϳѹ� üũ
	@Override
	public boolean checkNum(int bno) {
		// TODO Auto-generated method stub
		System.out.println("checkNum service success!!");
		return dao.checkNum(bno);
	}

}
