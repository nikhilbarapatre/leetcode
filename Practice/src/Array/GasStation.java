package Array;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost){
        int startingStation = 0, totalTank = 0, currentTank = 0;
        for(int i = 0 ; i < gas.length; i++){
            totalTank += gas[i] - cost[i];
            currentTank += gas[i] - cost[i];
            if(currentTank < 0){
                startingStation = i + 1;
                currentTank = 0;
            }
        }
        if(totalTank >= 0)
            return startingStation;
        else
            return -1;
    }

    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(gasStation.canCompleteCircuit(gas, cost));
    }
}
