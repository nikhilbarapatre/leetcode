package Sorting;


/*
* Selection sort works in the following way:
*   - First set ith index as min
*   - Check for the minimum index in the array i.e from i + 1 to n, if found set that as min index
*   - swap the min index with i
* */

public class SelectionSort {
    public int[] selection(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++)
                if(array[j] < array[min])
                    min = j;
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] result = s.selection(new int[]{11,25,2,1,34,55});
        for(int n : result)
            System.out.println(n);
    }
}
