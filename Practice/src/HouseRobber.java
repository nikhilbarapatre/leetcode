public class HouseRobber {
    public int houseRobber(int[] nums){
        int rob = 0; //max money if the current house is robbed.
        int notrob = 0; // max money if the current house is not robbed.
        for(int i = 0; i < nums.length; i++){
            int currob = notrob + nums[i]; // if the current house is robbed, then the previous house should not be robbed.
            notrob = Math.max(notrob, rob);
            rob = currob;
        }
        return Math.max(rob, notrob);
    }

    public static void main(String[] args) {
        HouseRobber house = new HouseRobber();
        int[] houses = {2,7,9,3,1};
        int result = house.houseRobber(houses);
        System.out.println(result);
    }
}
