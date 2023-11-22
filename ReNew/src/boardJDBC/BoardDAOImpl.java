package boardJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements DAO {
	
	//db연결
	private Connection conn; //실행시킬 정보
	private PreparedStatement pst; //실행
	private String query;
	private ResultSet rs;
	
	public BoardDAOImpl() {
		//데이터베이스 정보 객체 생성
		DataBaseConnectinon dbc = DataBaseConnectinon.getInstance();
		conn = dbc.getConnection();
	}

	//메서드 처리

	//글쓰기
	//글쓰기용 : title, writer, content
	@Override
	public int insert(BoardVO bVO) {
		// TODO Auto-generated method stub
		System.out.println("insert DAO success!!");
		query = "insert into board(title, writer, content) values(?,?,?)";
		
		try {
			pst = conn.prepareStatement(query);
			
			pst.setString(1, bVO.getTitle());
			pst.setString(2, bVO.getWriter());
			pst.setString(3, bVO.getContent());
			
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("insert error");
		}
		
		return 0;
	}

	//전체 리스트용 : bno, title, writer, moddate
	@Override
	public List<BoardVO> selectList() {
		// TODO Auto-generated method stub
		System.out.println("selectList DAO success!!");
		query = "select * from board";
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		try {
			pst = conn.prepareStatement(query);
			
			rs = pst.executeQuery();
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String moddate = rs.getString("moddate");
				int readCount = rs.getInt("readcount");
				list.add(new BoardVO(bno, title, writer, moddate, readCount));
			}
			return list;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("selectList error");
		}
		return null;
	}

	
	
	//상세 페이지용 : 전체  //printDetail()
	public BoardVO selectOne(int bno) {
		// TODO Auto-generated method stub
		System.out.println("selectOne DAO success!!");
		query = "select * from board where bno = ?";
		
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			rs = pst.executeQuery();
				
				if(rs.next()) {
					return new BoardVO(
							rs.getInt("bno"),
							rs.getString("title"),
							rs.getString("writer"),
							rs.getString("content"),
							rs.getString("regdata"),
							rs.getString("moddate"),
							rs.getInt("readcount"));
				}
	
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("selectOne error");
			e.printStackTrace();
		}
		
		return null;
	}

	//글 수정용 : bno, title, content
	@Override
	public int update(BoardVO bVO) {
		// TODO Auto-generated method stub
		System.out.println("update DAO success!!");
		query = "update board set title = ?, content= ?, moddate = now() where bno = ?";
		
		try {
			pst = conn.prepareStatement(query);
			
			pst.setString(1, bVO.getTitle());
			pst.setString(2, bVO.getContent());
			pst.setInt(3, bVO.getBno());
			
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("update error");
		}
		return 0;
	}
	
	//글 삭제  //delete from board where bno = 1;
	@Override
	public int delete(int bno) {
		// TODO Auto-generated method stub
		System.out.println("delete DAO success!!");
		query = "delete from board where bno = ?";
		
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			
			return pst.executeUpdate();
					
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("delete error");
		}
		
		return 0;
	}

	@Override
	public boolean checkNum(int bno) {
		// TODO Auto-generated method stub
		System.out.println("checkNum DAO success!!");
		query = "select bno from board where bno = ?";
		
		try {
			pst = conn.prepareStatement(query);
	        pst.setInt(1, bno);
			rs = pst.executeQuery();
			if(rs.next()) {
				return true;
			}else {
	            return false;
	        }
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("checkNum error");
		}
		
		return false;
	}

	@Override
	public int insertReadCount(int bno) {
		System.out.println("insertReadCount DAO success!!");
		query = "update board set readCount= readCount+1 where bno = ?";
		
		try {
			pst = conn.prepareStatement(query);
			
			pst.setInt(1, bno);
			
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("updateReadCount error");
		}
		return 0;
	}
	
	
		

	

	
		
	
	
}
