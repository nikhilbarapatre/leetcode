package Array;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDupFromSortedArray2(int[] nums){
        int i = 0;
        for(int n : nums){
            if(i < 2 || n > nums[i - 2])
                nums[i++] = n;
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayII rem = new RemoveDuplicatesFromSortedArrayII();
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(rem.removeDupFromSortedArray2(nums));
    }
}
