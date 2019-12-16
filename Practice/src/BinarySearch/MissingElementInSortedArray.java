package BinarySearch;

public class MissingElementInSortedArray {
    public int missingElement(int[] nums, int k){
        int low = 0, high = nums.length - 1, missing;
        while(low <= high){
            int mid = (low + high) / 2;
            missing = nums[mid] - nums[0] - mid;
            if(missing == k)
                break;
            else if(missing < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        if(low != 0)
            low--;
        missing = nums[low] - nums[0] - low;
        return nums[low] + k - missing;
    }

    public static void main(String[] args) {
        MissingElementInSortedArray missing = new MissingElementInSortedArray();
        int[] nums = {4,7,9,10};
        System.out.println(missing.missingElement(nums, 1));
    }
}
