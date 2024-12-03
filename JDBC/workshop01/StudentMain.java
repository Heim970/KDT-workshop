package workshop01;

import java.util.List;
import java.util.Scanner;

import exam02.RecordNotFoundException;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("*************************************************");
			System.out.println("              [ 학생 정보 관리 메뉴 ]");
			System.out.println("*************************************************");
			System.out.println("1. 전체 학생 목록");
			System.out.println("2. 학생 이름 검색");
			System.out.println("3. 학생 입학년도 범위 검색 (예> 2000부터 2003년까지)");
			System.out.println("4. 학생 학번으로 다중 검색(쉼표 구분자)");
			System.out.println("5. 학생 휴학 일괄수정");
			System.out.println("6. 학과 정원 일괄수정");
			System.out.println("7. 학생 학점 검색");
			System.out.println("0. 종료");
			System.out.println("*************************************************");
			System.out.print("메뉴 입력 => ");
			
			String input_num = scan.next();
			
			if ("1".equals(input_num)) {
				// 1. 전체 학생 목록 출력
				StudentService service = new StudentServiceImpl();
				service.setStudentDAO(new StudentDAO());
				List<StudentDTO> list = service.selectList();
				
				System.out.println("============================================================================");
				System.out.printf("%-8s %-4s %-15s %-15s\t%-9s %-4s\n", "학번", "이름", "주민번호", "주소", "입학년도", "휴학여부");
				System.out.println("----------------------------------------------------------------------------");
				int count = 0;
				for (StudentDTO dto : list) {
					count++;
					System.out.printf("%-8s %-4s %-15s %-17s\t%-12s %2s\n", dto.getStuNo(), dto.getStuName(), dto.getStuSsn(), dto.getStuAddress(), dto.getEntDate(), dto.getAbsYn());
				}
				System.out.printf("총 학생수: %d 명\n", count);
			} 
			else if ("2".equals(input_num)) {
				// 2. 학생 이름 검색
				System.out.print("검색할 학생명을 입력하시오 => ");
				String input_name = scan.next();
				
				StudentService service = new StudentServiceImpl();
				service.setStudentDAO(new StudentDAO());
				List<StudentDTO> list = service.selectName(input_name);
				
				System.out.println("============================================================================");
				System.out.printf("%-8s %-4s %-15s %-15s\t%-9s %-4s\n", "학번", "이름", "주민번호", "주소", "입학년도", "휴학여부");
				System.out.println("----------------------------------------------------------------------------");
				int count = 0;
				for (StudentDTO dto : list) {
					count++;
					System.out.printf("%-8s %-4s %-15s %-17s\t%-12s %2s\n", dto.getStuNo(), dto.getStuName(), dto.getStuSsn(), dto.getStuAddress(), dto.getEntDate(), dto.getAbsYn());
				}
				System.out.printf("총 학생수: %d 명\n", count);
			}
			else if ("3".equals(input_num)) {
				// 학생 입학년도 검색
				System.out.print("시작 입학년도 입력하시오 => ");
				int start_int = scan.nextInt();
				System.out.print("끝 입학년도 입력하시오 => ");
				int end_int = scan.nextInt();
				
				StudentService service = new StudentServiceImpl();
				service.setStudentDAO(new StudentDAO());
				List<StudentDTO> list = service.selectEntYear(start_int, end_int);
				
				System.out.println("============================================================================");
				System.out.printf("%-8s %-4s %-15s %-15s\t%-9s %-4s\n", "학번", "이름", "주민번호", "주소", "입학년도", "휴학여부");
				System.out.println("----------------------------------------------------------------------------");
				int count = 0;
				for (StudentDTO dto : list) {
					count++;
					System.out.printf("%-8s %-4s %-15s %-17s\t%-12s %2s\n", dto.getStuNo(), dto.getStuName(), dto.getStuSsn(), dto.getStuAddress(), dto.getEntDate(), dto.getAbsYn());
				}
				System.out.printf("총 학생수: %d 명\n", count);
			}
			else if ("4".equals(input_num)) {
				// 학생 학번 다중 조회
				System.out.print("검색할 학생의 학번을 입력하시오 => ");
				String str = scan.next();
				
				StudentService service = new StudentServiceImpl();
				service.setStudentDAO(new StudentDAO());
				List<StudentDTO> list = service.selectNo(str);
				
				System.out.println("============================================================================");
				System.out.printf("%-8s %-4s %-15s %-15s\t%-9s %-4s\n", "학번", "이름", "주민번호", "주소", "입학년도", "휴학여부");
				System.out.println("----------------------------------------------------------------------------");
				int count = 0;
				for (StudentDTO dto : list) {
					count++;
					System.out.printf("%-8s %-4s %-15s %-17s\t%-12s %2s\n", dto.getStuNo(), dto.getStuName(), dto.getStuSsn(), dto.getStuAddress(), dto.getEntDate(), dto.getAbsYn());
				}
				System.out.printf("총 학생수: %d 명\n", count);
			}
			else if ("5".equals(input_num)) {
				// 학생 휴학 일괄 수정
				System.out.print("수정할 학생의 학번을 입력하시오 => ");
				String str = scan.next();
				
				StudentService service = new StudentServiceImpl();
				service.setStudentDAO(new StudentDAO());
				int n = 0;
				
				try {
					n = service.updateAbsYn(str);
				} catch (RecordNotFoundException e) {
					e.printStackTrace();
				}
				System.out.printf("총 변경된 학생수: %d 명\n", n);
			}
			else if ("6".equals(input_num)) {
				// 학과 정원 일괄 수정
				StudentService service = new StudentServiceImpl();
				service.setStudentDAO(new StudentDAO());
				int n = 0;
				
				n = service.updateCapacity();
				System.out.printf("총 변경된 학생수: %d 명\n", n);
			}
			else if ("7".equals(input_num)) {
				// 학생 학점 검색
				System.out.print("학생의 학번을 입력하시오 => ");
				String str = scan.next();
				
				StudentService service = new StudentServiceImpl();
				service.setStudentDAO(new StudentDAO());
				List<StudentGradeDTO> list;
				
				try {
					list = service.searchGrade(str);
					
					System.out.println("===============================================================");
					System.out.printf("%-7s %-7s %-6s %-15s\t%-6s %-4s\n", "학기", "학번", "이름", "과목명", "점수", "학점");
					System.out.println("---------------------------------------------------------------");
					
					for (StudentGradeDTO dto : list) {
						System.out.printf("%-8s %-8s %-5s %-15s\t%.2f\t%-4s\n", dto.getTermNo(), dto.getStuNo(), dto.getStuName(), dto.getClassName(), dto.getPoint(), dto.getGrade());
					}
					
				} catch (RecordNotFoundException e) {
					e.printStackTrace();
				}
			}
			else {
				// 0. 프로그램 종료
				System.out.println("프로그램이 종료되었습니다.");
				scan.close();
				System.exit(0);
			}
			
		}
	}

}
