package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentAhn = new Student();
		
		studentAhn.studentId = 1001;
		studentAhn.studentName = "안승연";
		studentAhn.grade = 1;
		studentAhn.address = "서울특별시";
		
		System.out.println(studentAhn.studentId);
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.grade);
		System.out.println(studentAhn.address);
		
		studentAhn.showStudentInfo();

		System.out.println(studentAhn);
		
		System.out.println();
		
		Student studentHong = new Student();
		
		studentHong.studentId = 1002;
		studentHong.studentName = "홍길동";
		studentHong.grade = 2;
		studentHong.address = "경기도 광주시";
		
		System.out.println(studentHong.studentId);
		System.out.println(studentHong.studentName);
		System.out.println(studentHong.grade);
		System.out.println(studentHong.address);
				
		studentHong.showStudentInfo();
		
		System.out.println(studentHong);
		
	}

}
