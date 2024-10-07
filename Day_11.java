import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Day_11 {

/*
    public static int countOfDuplicate(int[] arr,int n){

        HashMap<Integer,Integer> anotherNewhash = new HashMap<>();
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            anotherNewhash.put(arr[i],count);
        }
        for(Map.Entry<Integer,Integer> i:anotherNewhash.entrySet())
            System.out.println(i.getKey() +" --> " + i.getValue());
        return 0;
    }

 */

    public static void main(String[] args){

        /* HashMap<Integer,Integer> hashmap = new HashMap<>();
        System.out.println("Enter the size of the hasmap:");
        Scanner sc = new Scanner(System.in)
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            hashmap.put(i,i*i);
        }
        for(Map.Entry<Integer,Integer> i: hashmap.entrySet()){
            System.out.println(i.getKey()+" --> " + i.getValue());
        }


           HashMap<Integer,Integer> newhash = new HashMap<>();
           System.out.println("Enter the hashmap size:");
           Scanner newsc = new Scanner(System.in);
           int n1 = newsc.nextInt();
           int[] arr = new int[n1];
           int sum = 0;

           for(int j=0;j<=n1;j++){
               int ele = arr[j];
               while(j!=0){
                   int d = j%10;
                   sum+=d;
                   ele/=10;
               }
               newhash.put(arr[j],sum);
           }

         */
        //int[] arr2 = {10,20,30,40,50,60,70,70,80,90,90,43,33,34,5,4,3,3,3,6,8,8,7,6,5,5,4,3434,54,54,35,35,345,54,54,42,54,542,54,54,3435,345,32435,3435,345,54,35,345,345,345,345,345,345,345,35,5,35,345,345,345,345,345,35,45,54,3,32,32,342,34,34,34,34,34,34,34,345,45,54,56,342,3245,234,335,355,2356,256,233445,23345,2356,236,2566,25566,256,5256,24556,2565,256,55653536,363,363663,36,6362,36,636,362,63,6,362,6363,6326363,63,6,6,6,6};
        //int len =  arr2.length;
        //System.out.println(countOfDuplicate(arr2,len));


    }


}

