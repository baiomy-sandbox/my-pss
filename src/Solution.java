class Solution {
    public void moveZeroes(int[] nums) {
        int last=0;
        for (int i = 0; i < nums.length; i++) {
            if (i!=0){
                nums[last]=nums[i];
                last++;
            }
        }
        while (last<nums.length){
            nums[last]=0;
            last++;
        }
    }
}