class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1;
        int max = 0;
        while(l < r){
            int minHeight = (height[l] < height[r] ? height[l] : height[r]);
            int area = minHeight * (r - l);
            if(area > max) max = area;
            while(height[l] <= minHeight && l < r ) l++;
            while(height[r] <= minHeight && l < r ) r--;
        }
        return max;
    }
}