import java.util.*;
public class P8_Container_With_Most_Water_Approach1 {
    public static int most_water(ArrayList<Integer>height){
        //brute force approach
        int max_water=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int curr_Water=ht*width;
                max_water=Math.max(curr_Water,max_water);
            }
        }
        return max_water;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();

        // 1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(most_water(height));
    }
}
/*
time complexity-O(n^2)

Theory :)-->
https://www.geeksforgeeks.org/container-with-most-water/

Question :)-->
https://practice.geeksforgeeks.org/problems/container-with-most-water0535/1

https://leetcode.com/problems/container-with-most-water/
 */