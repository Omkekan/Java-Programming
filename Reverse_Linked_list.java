import java.util.LinkedList;
import java.util.Stack;
public class Reverse_Linked_list {
    public static void main(String[] args) {
    
    Stack<Integer> s=new Stack<>();

    LinkedList<Integer> list=new LinkedList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);
    list.add(60);
    
    int e;
    int j;
    System.out.println(list);
    for(int i=0; i<list.size(); i++){
        e=list.removeLast();
        s.push(e);
    }
    
    for(int i= 0; i< list.size(); i++){
        j=s.pop();
        list.addFirst(j);
    }
    System.out.print(list);
    
}
}
