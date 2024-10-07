import java.util.Scanner;

public class Day_8 {

   /* public static void reverseDigit(int n){
        if(n==0)
            return;
        System.out.print(n%10+" ");
        reverseDigit(n/10);
    }


    public static boolean isEqual(int[] arr1,int[] arr2,int i){
        if(arr1.length!=arr2.length){
            System.out.println("not equal");
            return false;
        }
        else if (arr1[i] == arr2[i]){
            
            return true;

        }
        isEqual(arr1,arr2,i+1);
        return false;
    }



    public static void ifSorted(int[] arr,int n,int i){
        if(i >= n-1){
            System.out.println("sorted");
        }
        if(arr[i] > arr[i+1]){
            System.out.println(" not Sorted");
        }
        ifSorted(arr,n,i+1);

    }



    public static void slidingWindow(int[] arr,int n,int key){
           int i=0,j=key-1,sum=0;
           int maximum = Integer.MIN_VALUE;
           while(i<=n && j<=n){
               for(int k=i;k<=j;k++){
                   sum+=arr[k];
                   maximum = Math.max(maximum,sum);
                   i++;
                   j++;
               }
           }
        System.out.println(maximum);
    }

    */

    public static boolean palindrome(char[] arr){
        int s=0;
        int e = arr.length - 1;
        while(s<e){
            if(arr[s]!=arr[e])
                return false;
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args){

       // reverseDigit(321);
        //int[] arr = {10,20,30,80,49};
      //  int[] arr2 = {10,30,20,80};
       // int i=0;
         // System.out.println(isEqual(arr1,arr2,i));
       // int[] arr= {10,20,30,50,10};
       // int n=6,;
         // ifSorted(arr,n,i);
        //slidingWindow(arr,arr.length,3);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string length:");
        int n= sc.nextInt();
        char[] arr = new char[n];
        System.out.print("Enter the string:");
        for(int i=0;i<n;i++){
            arr[i] = sc.next().charAt(0);
        }
       System.out.println(palindrome(arr));
    }
}
