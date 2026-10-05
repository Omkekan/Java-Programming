import java.util.Scanner;

public class ScanFunc {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner fe=new Scanner(System.in);//2
        System.out.println("Enter a number 1:");
        double a=sc.nextDouble();//Java does support dynamic declaration of variables. Variables can be declared anywhere as per the need but they are only alive till the scope of the variable in one control scope.
        System.out.println("Enter a number 2:");
        double b=fe.nextDouble();//Java does support dynamic declaration of variables. Variables can be declared anywhere as per the need but they are only alive till the scope of the variable in one control scope.
        System.out.println("Calculation: "+(a + b));
        sc.close();
        fe.close();//Flushes the buffer, frees the RAM. 


}
}
