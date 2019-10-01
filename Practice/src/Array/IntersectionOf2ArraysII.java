package Array;

import java.util.*;

public class IntersectionOf2ArraysII {
    public int[] intersection(int[] nums1, int[] nums2){
        Map<Integer, Integer> map = new HashMap<>();
        int k = 0;
        for(int n : nums1)
            map.put(n, map.getOrDefault(n, 0) + 1);
        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
                nums1[k++] = nums2[i];
            map.put(nums2[i], map.getOrDefault(nums2[i], 0) - 1);
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

    public static void main(String[] args) {
        IntersectionOf2ArraysII inter = new IntersectionOf2ArraysII();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = inter.intersection(nums1, nums2);
        for(int n : result)
            System.out.println(n);
    }
}
