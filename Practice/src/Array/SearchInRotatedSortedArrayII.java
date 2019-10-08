package Array;

public class SearchInRotatedSortedArrayII {
    public boolean searchInRotatedSortedArray2(int[] nums, int target){
        int start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target)
                return true;
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                start++;
                end--;
            }
            else if(nums[start] <= nums[mid]){
                if(nums[start] <= target && nums[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else if(nums[end] >= nums[mid]){
                if(nums[end] >= target && nums[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArrayII search = new SearchInRotatedSortedArrayII();
        int[] nums = {2,5,6,0,0,1,2};
        System.out.println(search.searchInRotatedSortedArray2(nums, 3));
    }
}
