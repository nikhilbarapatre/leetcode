package Array;

import java.util.*;



public class SortArrayByParity {
    /*Using extra space*/
//    public int[] sortArrayByParity(int[] A){
//        int[] result = new int[A.length];
//        int index = 0;
//        for(int i = 0; i < A.length; i++){
//            if(A[i] % 2 == 0)
//                result[index++] = A[i];
//        }
//        for(int i = 0; i < A.length; i++){
//            if(A[i] % 2 == 1)
//                result[index++] = A[i];
//        }
//        return result;
//    }

    /*Using in-place
    * We check if the first element is odd, if yes then we take it to the end of the array.
    * */
    public int[] sortArrayByParity(int[] A){
        int i = 0, j = A.length - 1;
        while(i < j){
            if(A[i] % 2 > A[j] % 2){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
            if(A[i] % 2 == 0)
                i++;
            if(A[j] % 2 == 1)
                j--;
        }
        return A;
    }

    public static void main(String[] args) {
        SortArrayByParity sort = new SortArrayByParity();
        int[] input = new int[]{3, 1, 2, 4};
        int[] result = sort.sortArrayByParity(input);
        for(int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}
