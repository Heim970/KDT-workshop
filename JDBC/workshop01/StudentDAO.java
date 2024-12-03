package workshop01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exam02.RecordNotFoundException;

public class StudentDAO {
	
	public List<StudentDTO> selectList(Connection con) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		try {
			String sql = "select STUDENT_NO as 학번, "
					+ "student_name as 이름, "
					+ "department_no, "
					+ "concat(substr(student_ssn, 1, 8), repeat('*', 6)) as 주민번호, "
					+ "concat(substr(student_address, 1, 10), ' ...') as 주소, "
					+ "date_format(entrance_date, '%Y/%m/%d') as 입학년도, "
					+ "absence_yn as 휴학여부, "
					+ "COACH_PROFESSOR_NO "
					+ "from tb_student";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String stuNo = rs.getString(1);
				String stuName = rs.getString(2);
				String departNo = rs.getString(3);
				String stuSsn = rs.getString(4);
				String stuAddress = rs.getString(5);
				String entDate = rs.getString(6);
				char absYn = rs.getString(7).charAt(0);
				String coach = rs.getString(8);
				
				StudentDTO dto = new StudentDTO(stuNo, departNo, stuName, stuSsn, stuAddress, entDate, absYn, coach);
				list.add(dto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public List<StudentDTO> selectName(Connection con, String str) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		try {
			String sql = "select STUDENT_NO as 학번, student_name as 이름, department_no, concat(substr(student_ssn, 1, 8), repeat('*', 6)) as 주민번호, "
					+ "concat(substr(student_address, 1, 10), ' ...') as 주소, date_format(entrance_date, '%Y/%m/%d') as 입학년도, "
					+ "absence_yn as 휴학여부, COACH_PROFESSOR_NO from tb_student where student_name like ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, '%' + str + '%');
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String stuNo = rs.getString(1);
				String stuName = rs.getString(2);
				String departNo = rs.getString(3);
				String stuSsn = rs.getString(4);
				String stuAddress = rs.getString(5);
				if (stuAddress == null) stuAddress = "*** 주소 미상 ***";
				String entDate = rs.getString(6);
				char absYn = rs.getString(7).charAt(0);
				String coach = rs.getString(8);
				
				StudentDTO dto = new StudentDTO(stuNo, departNo, stuName, stuSsn, stuAddress, entDate, absYn, coach);
				list.add(dto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public List<StudentDTO> selectEntYear(Connection con, int start, int end) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		try {
			String sql = "select STUDENT_NO as 학번, student_name as 이름, department_no, concat(substr(student_ssn, 1, 8), repeat('*', 6)) as 주민번호, "
					+ "concat(substr(student_address, 1, 10), ' ...') as 주소, date_format(entrance_date, '%Y/%m/%d') as 입학년도, "
					+ "absence_yn as 휴학여부, COACH_PROFESSOR_NO from tb_student "
					+ "where date_format(entrance_date, '%Y') between ? and ? "
					+ "order by entrance_date desc";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String stuNo = rs.getString(1);
				String stuName = rs.getString(2);
				String departNo = rs.getString(3);
				String stuSsn = rs.getString(4);
				String stuAddress = rs.getString(5);
				if (stuAddress == null) stuAddress = "*** 주소 미상 ***";
				String entDate = rs.getString(6);
				char absYn = rs.getString(7).charAt(0);
				String coach = rs.getString(8);
				
				StudentDTO dto = new StudentDTO(stuNo, departNo, stuName, stuSsn, stuAddress, entDate, absYn, coach);
				list.add(dto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public List<StudentDTO> selectNo(Connection con, String str) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		try {
			String sql = "select STUDENT_NO as 학번, student_name as 이름, department_no, concat(substr(student_ssn, 1, 8), repeat('*', 6)) as 주민번호, "
					+ "concat(substr(student_address, 1, 10), ' ...') as 주소, date_format(entrance_date, '%Y/%m/%d') as 입학년도, "
					+ "absence_yn as 휴학여부, COACH_PROFESSOR_NO from tb_student "
					+ "where student_no in (";

			// sql에 검색할 학생 수만큼 ? 추가
			StringBuilder wildcards = new StringBuilder();
			String[] datas = str.split(",");
			for (int i = 0; i < datas.length; i++) {
				wildcards.append("?");
				if (i < datas.length - 1) wildcards.append(", ");
			}
			wildcards.append(")");
			pstmt = con.prepareStatement(sql + wildcards.toString());

			// ?에 데이터값 입력
			for (int i = 0; i < datas.length; i++) {
				pstmt.setString(i+1, datas[i]);
			}
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String stuNo = rs.getString(1);
				String stuName = rs.getString(2);
				String departNo = rs.getString(3);
				String stuSsn = rs.getString(4);
				String stuAddress = rs.getString(5);
				if (stuAddress == null) stuAddress = "*** 주소 미상 ***";
				String entDate = rs.getString(6);
				char absYn = rs.getString(7).charAt(0);
				String coach = rs.getString(8);
				
				StudentDTO dto = new StudentDTO(stuNo, departNo, stuName, stuSsn, stuAddress, entDate, absYn, coach);
				list.add(dto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
	public int updateAbsYn(Connection con, String str) throws RecordNotFoundException {
		PreparedStatement pstmt = null;
		int n = 0;

		String[] slist = str.split(",");
		
		try {
			String sql = "update tb_student set absence_yn = ? where student_no in (";
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < slist.length; i++) {
				sb.append("?");
				if (i < slist.length - 1) sb.append(", ");
			}
			sb.append(")");
			
			pstmt = con.prepareStatement(sql + sb.toString());
			pstmt.setString(1, "Y");
			for (int i = 0; i < slist.length; i++) {
				pstmt.setString(i+2, slist[i]);
			}
			
			n = pstmt.executeUpdate();
			// 사용자 예외 발생 조건
			if (n == 0) throw new RecordNotFoundException(str + "에 해당하는 레코드가 없습니다.\n");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return n;
	}
	
	public int updateCapacity(Connection con) {
		PreparedStatement pstmt = null;
		int n = 0;
		
		try {
			String sql = "update tb_department set capacity = "
					+ "case "
					+ "when capacity between 0 and 20 then capacity + 5 "
					+ "when capacity between 21 and 25 then capacity + 4 "
					+ "when capacity between 26 and 30 then capacity + 3 "
					+ "else capacity "
					+ "end";

			pstmt = con.prepareStatement(sql);
			
			n = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return n;
	}
	
	public List<StudentGradeDTO> searchGrade(Connection con, String str) throws RecordNotFoundException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<StudentGradeDTO> list = new ArrayList<StudentGradeDTO>();
		
		try {
			String sql = "select term_no, s.student_no, student_name, class_name, point "
					+ "from tb_student s join tb_grade g on s.student_no = g.student_no "
					+ "join tb_class c on g.class_no = c.CLASS_NO "
					+ "where s.student_no = ? "
					+ "order by term_no";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, str);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String termNo = rs.getString(1);
				String stuNo = rs.getString(2);
				String stuName = rs.getString(3);
				String className = rs.getString(4);
				double point = rs.getDouble(5);
				
				// grade 계산
				String grade = null;
				if (point > 4.0) {
					grade = "A학점";
				} else if (point > 3.5) {
					grade = "B학점";
				} else if (point > 3.0) {
					grade = "C학점";
				} else if (point > 2.0) {
					grade = "D학점";
				} else {
					grade = "F학점";
				}
				
				StudentGradeDTO dto = new StudentGradeDTO(termNo, stuNo, stuName, className, point, grade);
				list.add(dto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
}
