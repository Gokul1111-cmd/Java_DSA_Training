
import java.util.*;
class HelloWorld {

    public static int addnaturalnum(){
        int sum = 0;
        for(int i=0;i<=10;i++){
            sum+=i;

        }
        return sum;

    }

    public static boolean searchelement(int[] arr,int target){
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i] == target) {
                return true;
            }
        }

        return false;
    }

    public static int printodd(int n){
        for(int i=1;i<=n;i+=2) {
            System.out.println(i);
        }return -1;


    }


    public static int maxelement(int[] arr){
        int a=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > a){
                a=arr[i];
            }
        }
        return a;
    }



    public static int addelementsarray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=i;
        }
        return sum;
    }



    public static int sumofodd(int[] arr2){
        int sum=0;
        int count=0;
        for(int i=1;i<arr2.length;i+=2){
            if(arr2[i] % 2 == 0){
                sum += arr2[i];

            }

        }
        return sum;

    }

    public static int countofodd(int[] arr2){
        int sum=0;
        int count=0;
        for(int i=1;i<arr2.length;i+=2){
            if(arr2[i] % 2 == 0){
                count += i;
            }

        }
        return sum;

    }
    public static void main(String[] args){
        int b = addnaturalnum();
        System.out.println(b);
        int[] arr={10,20,40,20};
        System.out.println(searchelement(arr,203));
        System.out.println("The odd numbers are:" + printodd(10));
        int[] arr1 = { 10,20,0,45,475};
        System.out.println("The max element is:" + maxelement(arr1));
        int[] arr2 = {65,6,665,65,65,6,5};
        System.out.println("The sum is:" + addelementsarray(arr2));
        System.out.println("The count of Odd elements is:" + sumofodd(arr2));
        System.out.println("The sum of Odd elements is:" + countofodd(arr2));
    }
}



