public class MinimumCostForTickets {
    public int minCostTickets(int[] days, int[] costs){
        boolean[] dayIncluded = new boolean[366];
        for(int day : days)
            dayIncluded[day] = true;
        int[] minCost = new int[366];
        minCost[0] = 0;
        for(int day = 1; day < 366; day++){
            if(!dayIncluded[day]){
                minCost[day] = minCost[day - 1];
                continue;
            }
            int min = Integer.MAX_VALUE;
            min = minCost[day - 1] + costs[0];
            min = Math.min(min, minCost[Math.max(0, day - 7)] + costs[1]);
            min = Math.min(min, minCost[Math.max(0, day - 30)] + costs[2]);
            minCost[day] = min;
        }
        return minCost[365];
    }

    public static void main(String[] args) {
        MinimumCostForTickets min = new MinimumCostForTickets();
        int[] days = {1,4,6,7,8,20};
        int[] costs = {2,7,15};
        System.out.println(min.minCostTickets(days, costs));
    }
}
