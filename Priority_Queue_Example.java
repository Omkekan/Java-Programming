
import java.util.PriorityQueue;
class Student
{
    String name;
    int marks;

    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public Student() {
        
    }

    public void InputFunc(String name2, int rollno, String gender, int marks1, int marks2, int marks3, int marks4,
            int marks5) {
      
        throw new UnsupportedOperationException("Unimplemented method 'InputFunc'");
    }

    public void display_Human() {
        
        throw new UnsupportedOperationException("Unimplemented method 'display_Human'");
    }
}

public class Priority_Queue_Example
{
    public static void main(String[] args) {
        PriorityQueue<Student> pq =
                new PriorityQueue<>(
                        (s1, s2) -> s2.marks - s1.marks
                );
        pq.offer(new Student("Amit", 70));
        pq.offer(new Student("Rahul", 90));
        pq.offer(new Student("Neha", 80));
        while(!pq.isEmpty())
        {
            Student s = pq.poll();

            System.out.println(
                    s.name + " " + s.marks
            );
        }

    }
}
