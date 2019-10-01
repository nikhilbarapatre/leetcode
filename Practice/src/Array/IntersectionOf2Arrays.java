package Array;

import java.util.*;

/*
* First we put all the num in nums1 into a set and then compare the set num with num in num2.
* If present in set,  we put them in a list and remove from the set to avoid duplicates in the result array.
* */

public class IntersectionOf2Arrays {
    public int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums1)
            set.add(num);
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        return result;
    }

    public static void main(String[] args) {
        IntersectionOf2Arrays in = new IntersectionOf2Arrays();
        int[] result = in.intersection(new int[]{2,4,5,1,2}, new int[]{3,1,3,54,3,2,5});
        for(int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}
