package Workshop.Workshop05.pack07;

public class StudentTest {

	public static void main(String[] args) {
		// 3개의 Student 객체를 생성 하여 배열에 저장 한 후 나이, 신장, 몸무게의 평균을 출력 한다
		
		Student[] studentArray = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 170, 80);
		studentArray[1] = new Student("한사람", 13, 180, 70);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		double sumAge = 0.0;
		double sumHeight = 0.0;
		double sumWeight = 0.0;
		

		// 배열에 있는 객체 정보를 모두 출력한다 (for 문)
		System.out.println("이름   나이  신장  몸무게");
		for (Student s : studentArray) {
			System.out.println(s.studentInfo());

			sumAge += s.getAge();
			sumHeight += s.getHeight();
			sumWeight += s.getWeight();
		}
		
		System.out.println();
		// 나이의 평균을 출력한다.
		System.out.printf("나이의 평균: %.3f\n", sumAge / 3);

		// 나이의 평균을 출력한다.
		System.out.printf("신장의 평균: %.3f\n", sumHeight / 3);
		
		// 나이의 평균을 출력한다.
		System.out.printf("몸무게의 평균: %.3f\n", sumWeight / 3);

		System.out.println();
		
		// 학생들 중 나이가 가장 적은 학생과 많은 학생 출력
		int minIdx = 0;
		int maxIdx = 0;
		int min = studentArray[0].getAge();
		int max = studentArray[0].getAge();
		int i;
		for (i = 1; i < 3; i++) {
			if (min > studentArray[i].getAge()) {
				min = studentArray[i].getAge();
				minIdx = i;
			}
			if (max < studentArray[i].getAge()) {
				max = studentArray[i].getAge();
				maxIdx = i;
			}
		}
		
		System.out.printf("나이가 가장 많은 학생: %s\n", studentArray[maxIdx].getName());
		System.out.printf("나이가 가장 적은 학생: %s\n", studentArray[minIdx].getName());

		// 학생들 중 신장이 가장 작은 학생과 큰 학생 출력
		minIdx = 0;
		maxIdx = 0;
		min = studentArray[0].getHeight();
		max = studentArray[0].getHeight();
		
		for (i = 1; i < 3; i++) {
			if (min > studentArray[i].getHeight()) {
				min = studentArray[i].getHeight();
				minIdx = i;
			}
			if (max < studentArray[i].getHeight()) {
				max = studentArray[i].getHeight();
				maxIdx = i;
			}
		}
		
		System.out.printf("신장이 가장 큰 학생: %s\n", studentArray[maxIdx].getName());
		System.out.printf("신장이 가장 작은 학생: %s\n", studentArray[minIdx].getName());
		
		
		// 학생들 중 나이가 가장 적은 학생과 많은 학생 출력
		minIdx = 0;
		maxIdx = 0;
		min = studentArray[0].getWeight();
		max = studentArray[0].getWeight();
		
		for (i = 1; i < 3; i++) {
			if (min > studentArray[i].getWeight()) {
				min = studentArray[i].getWeight();
				minIdx = i;
			}
			if (max < studentArray[i].getWeight()) {
				max = studentArray[i].getWeight();
				maxIdx = i;
			}
		}
		
		System.out.printf("몸무게가 가장 많이 나가는 학생: %s\n", studentArray[maxIdx].getName());
		System.out.printf("몸무게가 가장 적게 나가는 학생: %s\n", studentArray[minIdx].getName());
		
	}

}
