import java.util.Scanner;

public class Stackpr {
    int[] arr;
    int top = -1;
    int size;

    Stackpr(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    boolean isEmpty(){
        if (top == -1) {
            return true;
        }else{return false;}
    }

    boolean isFull(){
        if (top == size - 1) {
            return true;
        }else{return false;}
    }

    void push(int val){
        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }else{
            top++;
            arr[top]= val;
        }
    }

    void pop(){
        if (isEmpty() == true) {
            System.out.println("Stack underflow");
            return;
        }else{
            int popval = arr[top];
            top--;
            System.out.println("deleted element: "+ popval);
            return;
        }
    }

    void peek(){
       if (isEmpty()== true) {
            System.out.println("empty stack");
       }else{
        System.out.println(arr[top]);
       }
    }

    void display(){
        if (isEmpty()==true) {
            System.out.println("Stack is empty");
        }else{
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        Stackpr obj = new Stackpr(size);
        int choice;
        int num;
        

        do {
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. Display");
            System.out.println("0. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element");
                    num = sc.nextInt();
                    obj.push(num);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.display();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
