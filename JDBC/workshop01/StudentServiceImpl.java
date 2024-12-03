package workshop01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import exam02.RecordNotFoundException;

public class StudentServiceImpl implements StudentService {

	String driver = "com.mysql.cj.jdbc.Driver"; // 패키지.클래스
	String url = "jdbc:mysql://localhost:3306/testdb";
	String userid = "root";
	String passwd = "1234";
	
	StudentDAO dao;
	
	public StudentServiceImpl() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void setStudentDAO(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<StudentDTO> selectList() {
		Connection con = null;
		List<StudentDTO> list = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			list = dao.selectList(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public List<StudentDTO> selectName(String str) {
		Connection con = null;
		List<StudentDTO> list = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			list = dao.selectName(con, str);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	@Override
	public List<StudentDTO> selectEntYear(int start, int end) {
		Connection con = null;
		List<StudentDTO> list = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			list = dao.selectEntYear(con, start, end);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public List<StudentDTO> selectNo(String str) {
		Connection con = null;
		List<StudentDTO> list = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			list = dao.selectNo(con, str);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	@Override
	public int updateAbsYn(String str) throws RecordNotFoundException {
		Connection con = null;
		int n = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			n = dao.updateAbsYn(con, str);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return n;
	}
	
	@Override
	public int updateCapacity() {
		Connection con = null;
		int n = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			n = dao.updateCapacity(con);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return n;
	}
	
	@Override
	public List<StudentGradeDTO> searchGrade(String str) throws RecordNotFoundException {
		Connection con = null;
		List<StudentGradeDTO> list = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			list = dao.searchGrade(con, str);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
