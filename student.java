package staticmethod;

public class student {
	private int rollno;
	private String name;
	private static String college="abcd";
	student(int r, String n){
		rollno=r;
		name=n;
	}
	static void change() {
		college="codegym";
	}
	static void change1() {
		college="abcd1";
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}
