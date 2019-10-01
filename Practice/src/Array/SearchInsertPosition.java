package Array;

public class SearchInsertPosition {
    public int searchInsertPosition(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        SearchInsertPosition search = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        System.out.println(search.searchInsertPosition(nums, 2));
    }
}
