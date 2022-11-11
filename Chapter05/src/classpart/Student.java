package classpart;

public class Student {

		public int studentId;	//	학번
		
		public String studentName;	//	학생 이름
		
		public int grade; //	학년
		
		public String address; //	사는 곳
		
		public void showStudentInfo() {
			System.out.println(studentName + ", " + address);
		}
		
}
