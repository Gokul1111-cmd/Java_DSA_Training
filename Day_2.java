import java.util.*;

class main{

   /* public static void timecomplexity(int n){
        int sum=1000;

        for(int i=0;i<n;){
            System.out.println("hello");
            sum=sum/10;
        }

    }
*/

  public static int linearsearch(int n,int target,int[] arr){
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                System.out.println(arr[i]);
            }
        }
        return 0;
  }

    public static void classs(String[] args){
        //  timecomplexity(2);
          int[] arr = {10,20,30,40};
          linearsearch(4,20,arr);

    }

}