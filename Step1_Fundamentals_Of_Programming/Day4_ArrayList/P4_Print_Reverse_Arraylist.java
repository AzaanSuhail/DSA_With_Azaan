import java.util.*;
public class P4_Print_Reverse_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(int i=list.size()-1;i>=0 ;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
/*
 time complexity-O(N)
 space complexity-O(1)
 */