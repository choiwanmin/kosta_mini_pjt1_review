package Project1.Intro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import JDBC.DBConnect;

public class IntroDao {
	private DBConnect db;

	public IntroDao() {
		db = DBConnect.getInstance();
	}
	
	// 이력서 등록
	public void insert(Intro i, int num) {
		Connection conn = db.conn();

		String sql = "insert into intro values(?,?,?,seq_intro.nextval,?)";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, i.getTitle());
			pstmt.setString(3, i.getContent());
			pstmt.setString(4, i.getSubmit());

			int cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	// 이력서 수정 - 제목, 내용, 제출 회사
	public void update(Intro i) {
		Connection conn = db.conn();

		String sql = "update intro set title=?, content=?, submit=?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, i.getTitle());
			pstmt.setString(2, i.getContent());
			pstmt.setString(3, i.getSubmit());

			int cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// 이력서 삭제
	public void delete(int id) {
		Connection conn = db.conn();

		String sql = "delete from intro where id=?";

		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);

			int cnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	// 이력서 조회(번호)
	public Intro selectById(int id) {
		Connection conn = db.conn();
		String sql = "select * from intro where id=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return new Intro(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	// 이력서 조회(제목)
	public ArrayList<Intro> selectByTitle(String title) {
		Connection conn = db.conn();
		String sql = "select * from intro where title like ? order by id";
		ArrayList<Intro> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + title + "%");

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Intro(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	// 이력서 조회(전체)
	public ArrayList<Intro> selectAll() {
		Connection conn = db.conn();
		String sql = "select * from intro order by id";
		ArrayList<Intro> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Intro(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
}

