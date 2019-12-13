package Array;

public class TrappingRainWater {
    public int trap(int[] heights){
        int result = 0, left = 0, right = heights.length - 1, waterLevel = 0, lowerGrounds = 0;
        while(left < right){
            if(heights[left] < heights[right])
                lowerGrounds = heights[left++];
            else
                lowerGrounds = heights[right--];
            waterLevel = Math.max(waterLevel, lowerGrounds);
            result += waterLevel - lowerGrounds; //waterLevel - lowerGrounds is the amount of water to be stored.
        }
        return result;
    }

    public static void main(String[] args) {
        TrappingRainWater trap = new TrappingRainWater();
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap.trap(heights));
    }
}
