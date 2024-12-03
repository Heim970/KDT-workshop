package workshop01;

import java.util.List;

import exam02.RecordNotFoundException;

public interface StudentService {
	
	public abstract void setStudentDAO(StudentDAO dao);
	public abstract List<StudentDTO> selectList();
	public abstract List<StudentDTO> selectName(String str);
	public abstract List<StudentDTO> selectEntYear(int start, int end);
	public abstract List<StudentDTO> selectNo(String str);
	
	public abstract int updateAbsYn(String str) throws RecordNotFoundException;
	public abstract int updateCapacity();
	
	public abstract List<StudentGradeDTO> searchGrade(String str) throws RecordNotFoundException;
}
