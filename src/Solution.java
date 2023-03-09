import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxCount=nums.length/2;
        int compare=nums[0];
        int major=0;
        for (int i = 0; i < nums.length; i++) {
            if (compare==nums[i]){
                major++;
            }else {
                compare=nums[i];
                major=1;
                continue;
            }
            if (major>maxCount){
                return compare;
            }
        }
        return major;
    }
}