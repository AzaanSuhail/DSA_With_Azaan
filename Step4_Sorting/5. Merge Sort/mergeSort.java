public class mergeSort {
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];

        int left=si;
        int right=mid+1;
        int index=0;

        while(left<=mid && right<=ei){
            if(arr[left]<=arr[right]){
                temp[index]=arr[left];
                left++;
                index++;
            }
            else{
                temp[index]=arr[right];
                index++;
                right++;
            }
        }

        //left remaining 
        while(left<=mid){
            temp[index++]=arr[left++];
        }

        //right remaining
        while(right<=ei){
            temp[index++]=arr[right++];
        }

        //copy back to the original array
        for(int i=0;i<temp.length;++i){ //HOMEWORK Dry run
            arr[si+i]=temp[i];
        }

    }
    public static void merge_Sort(int arr[],int si,int ei){

        //base case
        if(si==ei){
            return;
        }

        //finding mid for the partition
        int mid=(si+ei)/2;

        //left partition
        merge_Sort(arr, si, mid);

        //right partition
        merge_Sort(arr, mid+1, ei);

        //merging
        merge(arr,si,mid,ei);

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int si=0;
        int ei=arr.length-1;
        
        merge_Sort(arr,si,ei);

        //Print the matrix array
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
