import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements: ");
        int num = sc.nextInt();
        int Arr[];
        Arr = new int[num];

        for(int i=0; i<num; i++){
            Arr[i]=sc.nextInt();
        }

        int key = sc.nextInt();
        int index = -1;

        for(int i = 0; i<num;i++){
            if(Arr[i]==key){
                index = i;
                break;
            }
        }

        if(index != -1){
            System.out.println("Key at index: "+ index);
        }else{
            System.out.println("-1");
        }
        sc.close();
    }
}
