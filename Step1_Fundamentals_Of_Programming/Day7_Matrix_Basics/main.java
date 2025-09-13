
public class main {
    public static void Print(int matrix[][]){
        int rows=matrix.length;
        int cols=matrix[0].length; //martix[1].length or matrix[2].length

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Ques: Find target element in a matrix
    public static Boolean Linear_Search_Matrix(int matrix[][],int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // martix[1].length or matrix[2].length

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j]==target){
                    return true;
                }
            }
            
        }

        return false;
    }

    public static void main(String[] args) {
      int matrix[][]={{1,2,3},
                      {4,5,6},
                      {7,8,9}};  //~ 3 x 3

                    //   Print(matrix);

                    System.out.println(Linear_Search_Matrix(matrix, 100));


                    //Ques :https://www.naukri.com/code360/problems/search-in-a-2d-matrix_1082556?interviewProblemRedirection=true&search=Search%20in%20
                    

                    //Solution 
                    /*
                     * import java.util.* ;
                     * import java.io.*;
                     * import java.util.ArrayList;
                     * 
                     * public class Solution
                     * {
                     * public static boolean findInMatrix(int x, ArrayList<ArrayList<Integer>> arr)
                     * {
                     * int rows=arr.size();
                     * 
                     * for(int i=0;i<rows;++i){
                     * int col_per_row=arr.get(i).size();
                     * 
                     * for(int j=0;j<col_per_row;++j){
                     * if(arr.get(i).get(j)==x){
                     * return true;
                     * }
                     * }
                     * }
                     * 
                     * return false;
                     * }
                     * }
                     */
    }
}
