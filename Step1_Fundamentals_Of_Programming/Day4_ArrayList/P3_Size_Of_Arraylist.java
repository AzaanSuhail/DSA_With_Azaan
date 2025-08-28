import java.util.*;
public class P3_Size_Of_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.size());

        //print the arraylist

        //for accessing element at index arr[i]=list.get(i)

        for(int i=0 ;i<list.size();++i){
            System.out.println(list.get(i));
        }
    }
}
