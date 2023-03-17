import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] allNums = new int[1001];
        int[] small = nums1.length <= nums2.length ? nums1 : nums2;
        int[] big = nums1.length > nums2.length ? nums1 : nums2;
        for (int i = 0; i < small.length; i++) {
            allNums[small[i]]++;
        }
        int[] intersect = new int[small.length];
        int maxLength = 0;
        for (int i = 0; i < big.length; i++) {
            if (allNums[big[i]] > 0) {
                intersect[maxLength++] = big[i];
                allNums[big[i]]--;
            }
        }
        return copyArray(intersect, maxLength);
    }
    int[] copyArray(int[] arr , int maxLength){
        int[] newArr=new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }
}