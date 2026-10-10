import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class Add_Two_List {
    // Function to merge two sorted LinkedLists
    static LinkedList<Integer> combine(
            LinkedList<Integer> l1,
            LinkedList<Integer> l2) {

        // Create the third LinkedList
        LinkedList<Integer> l3 = new LinkedList<>();

        l3.addAll(l1);
        l3.addAll(l2);
        Collections.sort(l3);
        
        return l3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        // Input first sorted list
        System.out.print("Enter size of List 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter sorted elements of List 1:");
        for (int i = 0; i < n1; i++) {
            l1.add(sc.nextInt());
        }

        // Input second sorted list
        System.out.print("Enter size of List 2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter sorted elements of List 2:");
        for (int i = 0; i < n2; i++) {
            l2.add(sc.nextInt());
        }

        System.out.println("List 1: " + l1);
        System.out.println("List 2: " + l2);
        LinkedList<Integer> l3 = combine(l1, l2);
        System.out.println("Sorted List 3: "+ l3);



        sc.close();
    }
}



