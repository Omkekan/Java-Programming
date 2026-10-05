import java.util.Scanner;

public class VariableArray {
   public static void main(String[] args)
   {
       int a[][]=new int[3][];
        //I clearly define that it has three rows. The number of columns we haven't specified.
       a[0]=new int [5];

       a[1]=new int[2];

       a[2]=new int[4];

        //First accept needed elements and then print them in a proper manner.
        System.out.print("\na.length:"+a.length);
        System.out.print("\na[0].length:"+a[0].length);

        Scanner sc = new Scanner(System.in);
        System.out.println("\n enter elements: ");
        // 1. Accept needed elements
        for(int i = 0; i < a.length; i++) {
            // FIX: Use a[i].length to get the capacity of the current row
            for(int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        // 2. Print them in a proper manner
        System.out.println("\nArray output:");
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
   }
}
