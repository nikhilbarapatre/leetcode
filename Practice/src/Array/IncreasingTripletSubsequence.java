package Array;

public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums){
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for(int n : nums){
            if(n <= first)
                first = n;
            else if(n < second)
                second = n;
            else if(n > second)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        IncreasingTripletSubsequence in = new IncreasingTripletSubsequence();
        int[] nums = {1,2,3,4,5};
        if(in.increasingTriplet(nums))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
