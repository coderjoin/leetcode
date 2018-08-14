package sortAndSearch;

public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,index=m+n-1;

               while(i>=0&&j>=0){
                        if(nums1[i]>nums2[j]){
                               //A大就把A的数组放在更后面
                                 nums1[index--]=nums1[i--];

                             }
                        else{
                                 nums1[index--]=nums2[j--];

                             }
                     }
                 while(i>=0){
                         //A大就把A的数组放在更后面
                         nums1[index--]=nums1[i--];
                     }
                 while(j>=0){
                        nums1[index--]=nums2[j--];
                     }
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
