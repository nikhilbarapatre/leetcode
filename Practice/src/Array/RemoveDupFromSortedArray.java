package Array;

public class RemoveDupFromSortedArray {
    public int removeDup(int[] nums){
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i])
                i++;
            nums[i] = nums[j];
        }
        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDupFromSortedArray rem = new RemoveDupFromSortedArray();
        int[] nums = {1,1,2};
        int result = rem.removeDup(nums);
        System.out.println(result);
    }
}
