class Solution {
    public int majorityElement(int[] arr) {
        int major = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) major = arr[i];
            count += (major == arr[i]) ? 1 : -1;
        }
        return major;
    }
};