import java.util.Scanner;

public class Student_main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Student myStudent = new Student();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollno = scanner.nextInt();

        System.out.print("Enter marks for Subject 1: ");
        int marks1 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 2: ");
        int marks2 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 3: ");
        int marks3 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 4: ");
        int marks4 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 5: ");
        int marks5 = scanner.nextInt();

        myStudent.InputFunc(name, rollno, gender, marks1, marks2, marks3, marks4, marks5);
     
        myStudent.display_Human();

        
        scanner.close();
    }
}