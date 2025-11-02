
public class file {

    //Approach 1 : Sorting nlogn
    //Approach 2 : 
    public static void segregate(int arr[]){
        int n=arr.length;
        int count_0=0;

        for(int x:arr){
            if(x==0){
                count_0++;
        }

        int count_1=n-count_0;

        for(int i=0;i<count_0;++i){
            arr[i]=0;
        }

        for(int i=count_0;i<n;++i){
            arr[i]=1;
        }
}
}

    public static void main(String[] args) {
        int arr[]={0,0,1,1,0};
        segregate(arr);
    }

    for(int i=0;i<n;++i){
        System.out.print(arr[i]+" ");
    }
}

    }
}
}