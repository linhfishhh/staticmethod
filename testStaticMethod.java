package staticmethod;

public class testStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student.change();
		student s1=new student(1, "hoang");
		student s2=new student(2, "hai");
		student s3=new student(3, "nam");
		s1.display();
		s2.display();
		s3.display();
		student.change1();
		s1.display();
	}

}
