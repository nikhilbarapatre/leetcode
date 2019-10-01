package Sorting;

/*
* Bubble sort checks for every next element for minimum, if yes, then swaps it right there.
* */

public class BubbleSort {
    public int[] bubble(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        BubbleSort bub = new BubbleSort();
        int[] result = bub.bubble(new int[]{54,34,2,1,5,10});
        for(int n : result)
            System.out.println(n);
    }
}
