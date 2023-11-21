package JDBC;

import java.util.List;

public class ProductServiceImpl implements Service {
	//ServiceImpl <=> DAO
	
	private DAO dao; //interface�� ���� -> DAOImpl�� ����
	public ProductServiceImpl() {
		dao = new ProductDAOImpl(); //����ü
	}
	
	//����
	
	//��ǰ ��� �޼���
	@Override
	public int register(Product p) {
		System.out.println("register_service success!!");
		//dao���� ���Ǵ� �޼���� ���� db���� ����ϴ� ��ɾ�� ����ϰ� �޼��带 �ۼ�
		return dao.insert(p);
	}
	
	//��ǰ ����Ʈ ���
	@Override
	public List<Product> list() {
		System.out.println("list_service success!!");
		return dao.selectList();
	}

	//��ǰ 1���� ���
	@Override
	public Product detail(int pno) {
		System.out.println("detail_service success!!");
		return dao.selectOne(pno);
	}

	//��ǰ ����
	@Override
	public int modify(Product p) {
		System.out.println("modify_service success!!");
		return dao.update(p);
	}
	
	//��ǰ ����
	@Override
	public int remove(int pno) {
		System.out.println("remove_service success!!");
		return dao.delete(pno);
	}
	

}
