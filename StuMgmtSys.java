import java.util.HashMap;

public class StuMgmtSys {
    public static void main(String[] args) {
        HashMap<Integer, StudentMain> list = new HashMap<>();
        
        // Add student data
        StudentMain s1 = new StudentMain();
        s1.setData(1, "aaaaa", "m", 9.8f);
        list.put(s1.getRollNo(), s1);
        
        // Search and display
        int roll_no = 1;
        if (list.containsKey(roll_no)) {
            System.out.println("--- Student Found ---");
            StudentMain temp = list.get(roll_no);
            temp.displayData();
        } else {
            System.out.println("Student with roll number " + roll_no + " not found.");
        }

        // Search and update with new data
        if (list.containsKey(roll_no)) {
            System.out.println("\n--- Updating Student Data ---");
            StudentMain temp = list.get(roll_no);
            
            // Updating with new name and pointer
            temp.setData(roll_no, "bbbbb", "m", 9.5f);
            
            System.out.println("Successfully Updated! New details:");
            temp.displayData();
        }
    }
}