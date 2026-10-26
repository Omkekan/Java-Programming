
public class StudentMain {
	public static void main(String[] args) {
		Student std = new Student();
		std.rollNo = 12;
		std.name = "Om";
		std.percentage = 99.99f;
		
		Student std1 = new Student();
		std1.rollNo = 1;
		std1.name = "pawan";
		std1.percentage = 21.98f;
		
		System.out.println("rollno: "+std.rollNo);
		System.out.println("name: "+std.name);
		System.out.println("percentage: "+std.percentage);
		System.out.println();
		System.out.println("rollno: "+std1.rollNo);
		System.out.println("name: "+std1.name);
		System.out.println("percentage: "+std1.percentage);
		
	}
}
