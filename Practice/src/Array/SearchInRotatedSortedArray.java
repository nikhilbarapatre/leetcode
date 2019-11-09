package Array;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        while(low < high){
            int mid = (low + high) / 2;
            if(nums[mid] > high)
                low = mid + 1;
            else
                high = mid;
        }
        int rotate = low;
        low = 0;
        high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            int newMid = (mid + rotate) % nums.length;
            if(nums[newMid] == target)
                return newMid;
            if(nums[newMid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search.search(nums, 0));
    }
}
