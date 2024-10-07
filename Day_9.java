public class Day_9 {


    public static int maximumElement(int[] arr,int n){

        if ( n >= 0)

            return Math.max(arr[n], maximumElement(arr, n-1));
return 0;
    }




   /*
   public static int climbingStairs(int n){
        if(n==0 || n==1)
            return 1;
        return climbingStairs(n-1) + climbingStairs(n-2);
    }

    */


    public static void main(String[] args){
        int[] arr = {10,40,20,40};
        int n = arr.length - 1;
        System.out.println(maximumElement(arr,n));

        //System.out.println(climbingStairs(7));
    }

}
