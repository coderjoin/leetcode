package self;

/**
 * @author qiaoying
 * @date 2019-05-07 14:07
 */
public class CanCompleteCircuit {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0;
        int sum = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if (sum < 0) {
                start = i + 1;
                sum = 0;
            }
        }

        return total < 0 ? -1 : start;
    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        CanCompleteCircuit canCompleteCircuit = new CanCompleteCircuit();
        System.out.println(canCompleteCircuit.canCompleteCircuit(gas,cost));
    }
}
