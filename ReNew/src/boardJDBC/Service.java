package boardJDBC;

import java.util.List;

public interface Service {

	int write(BoardVO bVO);

	List<BoardVO> showList();

	BoardVO showListOne(int bno);

	int modify(BoardVO bVO);

	int remove(int bno);

	boolean checkNum(int bno);

}
