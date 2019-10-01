package Array;

public class TwoSumII {
    public int[] twoSumII(int[] numbers, int target){
        int index1 = 0, index2 = numbers.length - 1;
        while(numbers[index1] + numbers[index2] != target){
            if(numbers[index1] + numbers[index2] < target)
                index1++;
            else
                index2--;
        }
        return new int[]{index1 + 1, index2 + 1};
    }

    public static void main(String[] args) {
        TwoSumII two = new TwoSumII();
        int[] result = two.twoSumII(new int[]{2,7,11,15}, 13);
        for(int n : result)
            System.out.println(n);
    }
}
