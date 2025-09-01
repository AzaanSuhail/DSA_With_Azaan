import java.util.*;

public class P2_Arraylist_Operations {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        
        // add operation -O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(3,111);   //we can add like this list.add(index,element)

        System.out.println(list);

        //Get operation -O(1)
        int element=list.get(2);
        System.out.println(element);

        //Remove operation -O(n)
        list.remove(2);
        System.out.println(list);

        //Set operation -O(n)
        list.set(2, 99);
        System.out.println(list);

        //Contains operation -O(n)
        System.out.println(list.contains(2));
        System.out.println(list.contains(33));
    }
}
