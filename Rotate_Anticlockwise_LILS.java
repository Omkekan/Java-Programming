import java.util.LinkedList;

public class Rotate_Anticlockwise_LILS {
    
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        list.addLast(list.removeFirst());
        System.out.println(list);

    }
}
