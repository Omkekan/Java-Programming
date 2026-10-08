
class TwoStacks
{
    int arr[];
    int top1;
    int top2;

    TwoStacks(int size)
    {
        arr = new int[size];

        // Stack 1 starts from left
        top1 = -1;

        // Stack 2 starts from right
        top2 = size;
    }


    void push(int stackNo, int value)
    {
        // Check whether array is full
        if (top1 + 1 == top2)
        {
            System.out.println("Stack Overflow");
            return;
        }


        if (stackNo == 1)
        {
            top1 = top1 + 1;

            arr[top1] = value;
        }
        else if (stackNo == 2)
        {
            top2 = top2 - 1;

            arr[top1] = value;
        }
    }


    int pop(int stackNo)
    {
        if (stackNo == 1)
        {
            if (top1 == -1)
            {
                System.out.println("Stack 1 is Empty");
                return -1;
            }

            int value = arr[top1];

            top1 = top1 - 1;

            return value;
        }


        else if (stackNo == 2)
        {
            if (top2 == arr.length)
            {
                System.out.println("Stack 2 is Empty");
                return -1;
            }

            int value = arr[top2];

            top2 = top2 + 1;

            return value;
        }

        return -1;
    }


    void printStack1()
    {
        System.out.print("Stack 1: ");

        for (int i = top1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    void printStack2()
    {
        System.out.print("Stack 2: ");

        for (int i = top2; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}


public class Main
{
    public static void main(String args[])
    {
        TwoStacks s = new TwoStacks(10);

        s.push(1, 10);
        s.push(1, 20);
        s.push(1, 30);

        s.printStack1();


        s.push(2, 100);
        s.push(2, 200);
        s.push(2, 300);

        s.printStack2();


        System.out.println(
            "Popped from Stack 1: " + s.pop(1)
        );

        System.out.println(
            "Popped from Stack 2: " + s.pop(2)
        );


        s.printStack1();
        s.printStack2();
    }
}
