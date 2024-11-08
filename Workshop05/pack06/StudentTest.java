package Workshop.Workshop05.pack06;

public class StudentTest {

	public static void main(String[] args) {
		// 3개의 Student 객체를 생성 하여 배열에 저장 한 후 나이, 신장, 몸무게의 평균을 출력 한다
		
		Student[] studentArray = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		int sumAge = 0;
		int sumHeight = 0;
		int sumWeight = 0;
		
		// 배열에 있는 객체 정보를 모두 출력한다 (for 문)
		System.out.printf("%s\t%s\t%s\t%s\n", "이름", "나이", "신장", "몸무게");
		for (Student s : studentArray) {
			System.out.printf("%s\t%d\t%d\t%d\n", s.getName(), s.getAge(), s.getHeight(), s.getWeight());

			sumAge += s.getAge();
			sumHeight += s.getHeight();
			sumWeight += s.getWeight();
		}
		
		System.out.println();
		// 나이의 평균을 출력한다.
		System.out.printf("나이의 평균: %.2f\n", sumAge * 1.0 / 3);

		// 나이의 평균을 출력한다.
		System.out.printf("신장의 평균: %.2f\n", sumHeight * 1.0 / 3);
		
		// 나이의 평균을 출력한다.
		System.out.printf("몸무게의 평균: %.2f\n", sumWeight * 1.0 / 3);
		

	}

}
