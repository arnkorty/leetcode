public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int curSum = 0, totalSum = 0, start = 0;
        for(int i = 0; i < n; i++) {
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if(curSum < 0) {
                start = (i + 1) % n;
                curSum = 0;
            }
        }
        return totalSum >= 0 ? start : -1;
    }
    public static void main(String[] args) {

    }
}
