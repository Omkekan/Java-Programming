
public class EnggStudentMain {

	public static void main(String[] args) {
		EnggStudent st = new EnggStudent();
		st.assignValues(1001, "om", "AIML");
		st.printValues();
		
		System.out.println("--------------------------");
		
		st.setBranch("comp sci");
		st.printValues();
		System.out.println("--------------------------");
		String studentName = st.getName();
		System.out.println(studentName);
		System.out.println(st.getName());
		
		
	}

}
