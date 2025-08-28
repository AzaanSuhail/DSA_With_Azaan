import java.util.*;
public class P6_Sorting_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(139);
        list.add(27);
        list.add(3);
        list.add(45);
        list.add(5);

        System.out.println("Before Sorting:");
        System.out.println(list);

        //ascending -->by default
        Collections.sort(list);
        System.out.println("After Sorting:");
        System.out.println(list);

        //descending 
        System.out.println("Descending order:");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
