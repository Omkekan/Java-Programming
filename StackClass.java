
public class StackClass {
      int stack[],MaxSize,tos;
    void createStack(int size)
    {
        MaxSize=size;
        tos=-1;
        stack=new int[MaxSize];
    }
    void push(int e)
    {
        stack[++tos]=e;
        //tos++;stack[tos]=e;
    }

    boolean is_full()
    {
        return (tos==MaxSize-1);//boundry condition
    }
    int pop()
//removes and return
    {
        return stack[tos--];
    }

    boolean is_empty()
    {
        return tos==-1;
    }
    int peek()//returns the element on the stack that is at the top.
    {
        return stack[tos];//only return not removed
    }
    void print_stack()
    {
        for(int i=tos;i>=0;i--)
            System.out.println(stack[i]);
    }
    

}
