package leetcode2020;

/**
 * 描述： 寻找正序数组的中位数
 * @author coderjoin
 * @date 2020-05-25 19:01
 */
public class FindMedianSortedArrays_4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        int totallength = length1 + length2;
        if (totallength % 2 == 1) {
            int midIndex = totallength / 2;
            result = getKthElement(nums1, nums2, midIndex + 1);
        } else {
            int midIndex1 = totallength / 2 - 1;
            int midIndex2 = totallength / 2;
            result = (getKthElement(nums1, nums2, midIndex1 + 1)
                    + getKthElement(nums1, nums2, midIndex2 + 1)) / 2.0;
        }


        return result;
    }

    public static int getKthElement(int[] nums1, int[] nums2, int k) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int index1 = 0;
        int index2 = 0;
        int kthElement = 0;

        while (true) {
            if (index1 == length1) {
                return nums2[index2 + k - 1];
            }
            if (index2 == length2) {
                return nums1[index1 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }

            int half = k / 2;
            int newIndex1 = Math.min(index1 + half, length1) - 1;
            int newIndex2 = Math.min(index2 + half, length2) - 1;
            int pivot1 = nums1[newIndex1];
            int pivot2 = nums2[newIndex2];
            if (pivot1 <= pivot2) {
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            } else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }
        }
    }

    public static void main(String[] args) {

    }
}
