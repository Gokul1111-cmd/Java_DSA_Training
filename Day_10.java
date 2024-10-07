public class Day_10 {

    /* //First Approach
    public static int commonElement(int[] arr1,int[] arr2){
           for(int i=0;i<arr1.length;i++){
               for(int j=0;j<arr2.length;j++){
                   if(arr1[i] == arr2[j]){
                       return arr1[i];
                   }
               }
           }
           return 0;
    }

    public static int binaryToInt(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                sum += Math.pow(2, i);

            }

        }return sum;
    }

    public static boolean secondApproach(int[] arr1,int[] arr2){
        int n1 = arr1.length,n2 = arr2.length,i=0,j=0;
        while(i<n1 && j<n2){
            if(arr1[i] == arr2[j]){
                return true;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
return false;
    }



    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){
        int i = 0;
        int j = 0;
        int k = 0;

        // traverse the arr1 and insert its element in arr3
        while(i < n1){
            arr3[k++] = arr1[i++];
        }

        // now traverse arr2 and insert in arr3
        while(j < n2){
            arr3[k++] = arr2[j++];
        }

        // sort the whole array arr3
        Arrays.sort(arr3);
    }


     */
    public static void main(String[] args) {
        // int n = 5;
        // patternPrinting(n);
        //int[] arr = {1, 1, 1, 1};
        //System.out.println(binaryToInt(arr));
       // int[] arr1 = {10,20,30,40,50,60};
        //int[] arr2 = {11,22,33,44};
        //System.out.println(commonElement(arr1,arr2));
       // System.out.println(secondApproach(arr1,arr2));

      /*  int arr1[] = {1, 3, 5, 7};
        int n1 = arr1.length;

        int arr2[] = {2, 4, 6, 8};
        int n2 = arr2.length;

        int arr3[] = new int[n1 + n2];
        mergeArrays(arr1, arr2, n1, n2, arr3);

        System.out.println("Array after merging");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");

       */
    



    }
}




