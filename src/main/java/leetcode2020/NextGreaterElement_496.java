package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-13 19:02
 */
public class NextGreaterElement_496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int tmp = nums1[i];
            int index = getIndex(tmp,nums2);
            boolean isMax = false;
            for (int j = index; j < nums2.length; j++) {
                if (nums2[j] > tmp) {
                    result[i] = nums2[j];
                    isMax = true;
                    break;
                }
            }
            if (!isMax){
                result[i] = -1;
            }
        }

        return result;
    }

    private int getIndex(int target,int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        NextGreaterElement_496 n = new NextGreaterElement_496();
        int[] result = n.nextGreaterElement(nums1,nums2);
        for (int a:result
             ) {
            System.out.println(a);
        }

    }
}
