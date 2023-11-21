package JDBC;

import java.util.List;

public class ProductServiceImpl implements Service {
	//ServiceImpl <=> DAO
	
	private DAO dao; //interface로 생성 -> DAOImpl로 구현
	public ProductServiceImpl() {
		dao = new ProductDAOImpl(); //구현체
	}
	
	//구현
	
	//상품 등록 메서드
	@Override
	public int register(Product p) {
		System.out.println("register_service success!!");
		//dao에서 사용되는 메서드는 실제 db에서 사용하는 명령어와 비슷하게 메서드를 작성
		return dao.insert(p);
	}
	
	//상품 리스트 출력
	@Override
	public List<Product> list() {
		System.out.println("list_service success!!");
		return dao.selectList();
	}

	//상품 1개만 등록
	@Override
	public Product detail(int pno) {
		System.out.println("detail_service success!!");
		return dao.selectOne(pno);
	}

	//상품 수정
	@Override
	public int modify(Product p) {
		System.out.println("modify_service success!!");
		return dao.update(p);
	}
	
	//상품 삭제
	@Override
	public int remove(int pno) {
		System.out.println("remove_service success!!");
		return dao.delete(pno);
	}
	

}
