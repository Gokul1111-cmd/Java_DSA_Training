import java.util.Scanner;

public class Day {
    public static int printodd(int[] arr,int size){
        int sum = 0;
        for(int i = 1; i <size; i+=2){
            sum+=arr[i];

        }
        return sum;
    }




public static boolean sumofele(int[] arr,int target,int n){

    for(int i=0;i<n;i++) {
        for (int j = i + 1; j < n; j++) {
            if ((arr[i] + arr[j]) == target) {
                return true;
            }
        }
    }
    return false;
    }




public static boolean twopointerapproach(int[] arr,int target,int n){

    int sum = s+l;
    for(int i=0;i<n;i++){
        s=i;
        n-=1;
        if(s+l == target){
            return true;
        }
        else if(sum < target){
            s++;
        }
        else{
            l--;
        }
    }
    return false;
}






    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+i+" th element:");
            arr[i] = sc.nextInt();
        }
        System.out.println(printodd(arr,n));





public static int reverse(int[] arr){
    int[] tempArr = new int[arr.length];
   int k=0;
   for(int i=arr.length;i>=0;i--){
       tempArr[k] = arr[i];
       k++;
   }
   System.out.println(tempArr);

        }


     public static int pointerreverse(int[] arr,int n){
        int start = 0,end = n-1;
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
               }

        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();

        System.out.println(sumofele(arr, target, n));

        System.out.println(twopointerapproach(arr,target,n));

        reversearray(arr);

       System.out.println(pointerreverse(arr,n));






    }
}
