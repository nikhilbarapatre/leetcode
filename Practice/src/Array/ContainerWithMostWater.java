package Array;


public class ContainerWithMostWater {
    public int maxArea(int[] height){
        int max = 0;
        for(int i = 0; i < height.length; i++){
            for(int j = i + 1; j < height.length; j++) {
                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater con = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = con.maxArea(height);
        System.out.println(result);
    }
}
