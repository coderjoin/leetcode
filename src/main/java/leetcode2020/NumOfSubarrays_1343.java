package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-19 10:11
 */
public class NumOfSubarrays_1343 {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = i + k - 1;
        int res = 0;
        while (j < arr.length) {
            if (getAvg(arr,i,j) >= threshold) {
                res++;
            }
            i++;
            j++;
        }
        return res;
    }

    private double getAvg(int[] arr,int i, int j) {

        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += arr[k];
        }
        return (double) sum/(j - i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        NumOfSubarrays_1343 n = new NumOfSubarrays_1343();
        System.out.println(n.numOfSubarrays(arr,k,threshold));
    }
}
