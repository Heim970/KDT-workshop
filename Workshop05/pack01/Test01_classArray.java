package Workshop.Workshop05.pack01;

public class Test01_classArray {

	public static void main(String[] args) {
		/*
		 *  서로 다른 Student 객체를 생성 하여 모든 과목의 평균, 학점을 조회하는
		 *  프로그램을 작성 하시오.
		 *  
		 *  평균 점수가 100이하~90이상 점이면 A학점, 90미만~70이상 이면 B학점, 
		 *  70미만~50이상 이면 C학점, 50미만~30이상 이면 D학점,
		 *  나머지는 F학점으로 화면에 출력 한다. 
		 */
		 
		// student 객체를 클래스 배열로 생성
		Student[] students = new Student[3];
		students[0] = new Student("Kim", 100, 90, 95, 89);
		students[1] = new Student("Lee", 60, 70, 99, 98);
		students[2] = new Student("Park", 68, 86, 60, 40);
		
		// 각 객체의 평균과 학점 출력
		for (Student s : students) {
			System.out.printf("%-4s 평균: %2.2f 학점: %s\n", s.getName(), s.getAvg(), s.getGrade());			
		}
	}

}
