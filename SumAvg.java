import java.util.Scanner;
public class SumAvg {
    public static void main (String[] args){
        int Arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int a= sc.nextInt();
        Arr = new int[a];
        long sum = 0;

        System.out.println("Enter "+a+" Numbers: ");
        for(int i = 0; i<a; i++){
            Arr[i]= sc.nextInt();
            sum+=Arr[i];
        }
        sc.close();

        double avg = (a == 0) ? 0 : (double) sum/a;
        System.out.println("Sum = "+ sum);
        System.err.println("Avg = "+ avg);

    }
}
