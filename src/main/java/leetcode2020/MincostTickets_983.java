package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-10 16:30
 */
public class MincostTickets_983 {

    int[] days,costs;
    Integer[] memo;
    int[] durations = new int[]{1,7,30};

    public int mincostTickets(int[] days, int[] costs) {
        this.days = days;
        this.costs = costs;
        memo = new Integer[days.length];

        return dp(0);
    }

    public int dp(int i) {
        if (i >= days.length) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }

        memo[i] = Integer.MAX_VALUE;

        int j = i;
        for (int k = 0; k < 3; k++) {
            while (j < days.length && days[j] < days[i] + durations[k]) {
                j++;
            }
            memo[i] = Math.min(memo[i], dp(j) + costs[k]);
        }

        return memo[i];
    }

    public static void main(String[] args) {
        int[] days = {1,4,6,7,8,20};
        int[] costs = {2,7,15};

        MincostTickets_983 m = new MincostTickets_983();
        System.out.println(m.mincostTickets(days,costs));
    }
}
