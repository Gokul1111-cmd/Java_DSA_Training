import java.util.Arrays;
import java.util.Scanner;

public class Day_6 {

    public static int subArray(int[] arr,int n){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){ for(int j=i;j<n;j++){ int sum=0; for(int k=i;k<=j;k++){ sum+=arr[k];

                }
                maxSum = Math.max(maxSum,sum);
                System.out.println(sum);

            }
            System.out.print("");
        }
        System.out.print(maxSum);
        return -1;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3};
        int n= arr.length;
        subArray(arr,n);
    }
}
