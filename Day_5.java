import java.util.Arrays;
import java.util.Scanner;

public class Day_5 {

    /*
     public static int countOfOdd(int[][] arr,int n1,int n2){
        int sum = 0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr[i][j]%2!=0){
                    sum++;
                }
            }
        }
        return sum;
    }



    public static int boundary(int[][] arr,int n1,int n2){
        int[][] arr1 = new int[n1][n2];
int i,j;
        for(j=0;j<n2;j++){
            System.out.println(arr1[0][j]);
        }
        j= n2-1;
            for(i=0;i<n1;i++){
                System.out.println(arr[i][j]);
            }
        i= n1-1;
            for(j= n2-1;j>=0;j--){
                System.out.println(arr[i][j]);
            }
        j=0;
            for(i=n1-2;i>0;i--){
                System.out.println(arr[i][j]);
            }

    return 1;
    }

    public static boolean sortedArray(int[] arr,int oneDimensional){
        for(int i=0;i<oneDimensional;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

     */




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  System.out.print("Enter the First array size:");
        int n1 = sc.nextInt();
        System.out.print("Enter the Second array size:");
        int n2 = sc.nextInt();
        int[][] arr = new int[n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                System.out.print("Enter the "+i+"th and "+j+"th Element:");
                arr[i][j] = sc.nextInt();
             }
        }

       */

        /*
        System.out.println("Enter the size of the array:");
        int oneDimensional = sc.nextInt();
        int[] onedimensional = new int[oneDimensional];
        for(int i=0;i<oneDimensional;i++){
            onedimensional[i] = sc.nextInt();
        }

         */
        // System.out.println("Enter the 1st bound:");
        // int bound1 = sc.nextInt();
        // System.out.println("Enter the 2nd bound:");
        // int bound2 = sc.nextInt();
        //System.out.println("The count of odd is"+ " "+countOfOdd(arr,n1,n2));
        //System.out.println("The boundary array is"+boundary(arr,n1,n2));
        //System.out.println(sortedArray(onedimensional,oneDimensional));
    }
}
