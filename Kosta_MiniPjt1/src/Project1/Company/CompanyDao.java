package Project1.Company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import JDBC.DBConnect;

public class CompanyDao {

	private DBConnect db;

	public CompanyDao() {
		db = DBConnect.getInstance();
	}

	// 기업 정보 등록
	public int insertCompany(Company c) {
		Connection conn = db.conn();
		int cnt = 0;
		String sql = "insert into company values(0,company_seq.nextval,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, c.getCname());
			ps.setString(2, c.getField());
			ps.setString(3, c.getId());
			ps.setString(4, c.getTell());
			ps.setString(5, c.getEmail());
			ps.setString(6, c.getAddr());
			cnt = ps.executeUpdate();
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
		return cnt;
	}

	// 기업 번호로 정보 수정 - 기업이름, 기업분야, 기업전화번호, 기업 이메일, 기업주소
	public int updateCompany(Company c, int cnum) {
		Connection conn = db.conn();
		int cnt = 0;
		String sql = "update company set cname=?, field=?, tell=?, email=?, addr=? where cnum=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, c.getCname());
			ps.setString(2, c.getField());
			ps.setString(3, c.getTell());
			ps.setString(4, c.getEmail());
			ps.setString(5, c.getAddr());
			ps.setInt(6, cnum);
			cnt = ps.executeUpdate();
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
		return cnt;
	}

	// 기업 정보 삭제
	public int deleteCompany(int cnum) {
		Connection conn = db.conn();
		int cnt = 0;
		String sql = "delete from company where cnum=?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, cnum);
			cnt = ps.executeUpdate();
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
		return cnt;
	}

	// 기업 정보 조회 (분야)
	public ArrayList<Company> selectCompanyByField(Company c) {
		ArrayList<Company> list = new ArrayList<>();
		Connection conn = db.conn();
		String sql = "select * from company where field =?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, c.getField());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Company(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(6),
						rs.getString(7), rs.getString(8), rs.getString(9)));
			}
			return list;
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

	// 기업 정보 전체조회
	public ArrayList<Company> selectAllCompany(Company c) {
		ArrayList<Company> list = new ArrayList<>();
		Connection conn = db.conn();
		String sql = "select * from company";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Company(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(6),
						rs.getString(7), rs.getString(8), rs.getString(9)));
			}
			return list;
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
}
