package HashTable;

public class SingleNumber {
    public int singleNumber(int[] nums){
        int result = 0;
        for(int n : nums)
            result ^= n;
        return result;
    }

    public static void main(String[] args) {
        SingleNumber single = new SingleNumber();
        int[] nums = {4,1,2,1,2,5,4,6,7,6,7};
        int result = single.singleNumber(nums);
        System.out.println(result);
    }
}
