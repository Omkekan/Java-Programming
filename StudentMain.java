public class StudentMain {
    private int roll_no;
    private String name, gender;
    private float pointer;

    // Default constructor (must match class name StudentMain)
    public StudentMain() {}

    // Parameterized constructor (must match class name StudentMain)
    public StudentMain(int roll_no, String name, String gender, float pointer) {
        this.roll_no = roll_no;
        this.name = name;
        this.gender = gender;
        this.pointer = pointer;
    }

    // Set data method
    public void setData(int roll_no, String name, String gender, float pointer) {
        this.roll_no = roll_no;
        this.name = name;
        this.gender = gender;
        this.pointer = pointer;
    }

    // Getter for roll number
    public int getRollNo() {
        return roll_no;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Display data method
    public void displayData() {
        System.out.println("Roll No : " + roll_no);
        System.out.println("Name    : " + name);
        System.out.println("Gender  : " + gender);
        System.out.println("Pointer : " + pointer);
    }
}