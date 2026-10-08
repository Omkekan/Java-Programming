class TwoQueues
{
    int arr[];

    int front1;
    int rear1;

    int front2;
    int rear2;


    TwoQueues(int size)
    {
        arr = new int[size];

        // Queue 1
        front1 = 0;
        rear1 = -1;

        // Queue 2 starts from middle
        front2 = size/2;
        rear2 = (size/2)-1;
    }


    void enqueue(int queueNo, int value)
    {
        if (queueNo == 1)
        {
            // Check Queue 1 overflow
            if (rear1 == (arr.length /2)-1)
            {
                System.out.println("Queue 1 Overflow");
                return;
            }

            rear1 = rear1 + 1;

            arr[rear1] = value;
        }


        else if (queueNo == 2)
        {
            // Check Queue 2 overflow
            if (rear2 == arr.length - 1)
            {
                System.out.println("Queue 2 Overflow");
                return;
            }

            rear2 = rear2 + 1;

            arr[rear2] = value;
        }
    }


    int dequeue(int queueNo)
    {
        if (queueNo == 1)
        {
            if (front1>rear1)
            {
                System.out.println("Queue 1 is Empty");
                return -1;
            }

            int value = arr[front1];

            front1 = front1 + 1;

            return value;
        }


        else if (queueNo == 2)
        {
            if (front2 > rear2)
            {
                System.out.println("Queue 2 is Empty");
                return -1;
            }

            int value = arr[front2];

            front2 = front2 + 1;

            return value;
        }

        return -1;
    }


    void printQueue1()
    {
        System.out.print("Queue 1: ");

        for (int i = front1; i <= rear1; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    void printQueue2()
    {
        System.out.print("Queue 2: ");

        for (int i = front2; i <= rear2; i++)
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
        TwoQueues q = new TwoQueues(10);


        // Queue 1

        q.enqueue(1, 10);
        q.enqueue(1, 20);
        q.enqueue(1, 30);

        q.printQueue1();


        // Queue 2

        q.enqueue(2, 100);
        q.enqueue(2, 200);
        q.enqueue(2, 300);

        q.printQueue2();


        System.out.println(
            "Deleted from Queue 1: " + q.dequeue(1)
        );

        System.out.println(
            "Deleted from Queue 2: " + q.dequeue(2)
        );


        q.printQueue1();
        q.printQueue2();
    }
}
