import java.util.Scanner;
public class Day_7 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = sc.nextInt();
         int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the "+i+" element:");
            arr[i] = sc.nextInt();
        }
       int count = 0;

        naturalincreasing(n);
         naturaldecreasing(n);
        //System.out.println(targetSearch(arr,5,0,count));

    }

    public static boolean naturalincreasing(int n){
        if(n==0){
            return false;
        }
        naturalincreasing(n-1);
        System.out.println(n);

        return true;
    }

    public static boolean naturaldecreasing(int n){
        if(n==0){
            return false;
        }

        System.out.println(n);
        naturaldecreasing(n-1);

        return true;
    }

public static int targetSearch(int[] arr,int target,int i,int count){
    if(i>=arr.length){
        return -1;
    }
    if(arr[i] == target){
        count++;
        return count;
    }
    return targetSearch(arr,target,i+1,count);
}


public static int factorial(int n){
    if(n==0 || n==1){
        return 1;
    }

    return n*factorial(n-1);
}

}

