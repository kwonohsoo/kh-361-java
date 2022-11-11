package constructor;

import classpart.Student;


public class PersonTest {

	public static void main(String[] args) {
		Person personKim;
		
		personKim = new Person();
		
		personKim.setName("김유신");
		personKim.setWeight(85.5F);
		personKim.setHeight(180.0F);
		
		System.out.println(personKim.getName());
		System.out.println(personKim.getWeight());
		System.out.println(personKim.getHeight());

		
		System.out.println();
		
		
		Person personLee = new Person("이순신", 175, 75);
		
		System.out.println(personLee.getName());
		System.out.println(personLee.getWeight());
		System.out.println(personLee.getHeight());

		//	default 접근 제어자 테스트 - public 추가
//		Student studentAhn = new Student();
//		
//		studentAhn.studentId = 1001;
//		studentAhn.studentName = "안승연";
//		studentAhn.grade = 1;
//		studentAhn.address = "서울특별시";
//		
//		System.out.println(studentAhn.studentId);
//		System.out.println(studentAhn.studentName);
//		System.out.println(studentAhn.grade);
//		System.out.println(studentAhn.address);
		
	}

}
