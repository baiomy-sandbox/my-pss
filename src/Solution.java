class Solution {
    public int firstUniqChar(String s) {
        int[] charSum=new int[26];
        for (int i = 0; i < s.length(); i++) {
            charSum[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charSum[s.charAt(i)]==1)return i;
        }
        return -1;
    }
}