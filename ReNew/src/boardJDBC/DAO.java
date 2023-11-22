package boardJDBC;

import java.util.List;

public interface DAO {

	int insert(BoardVO bVO);

	List<BoardVO> selectList();

	BoardVO selectOne(int bno);

	int update(BoardVO bVO);

	int delete(int bno);

	boolean checkNum(int bno);

	int insertReadCount(int bno);

}
