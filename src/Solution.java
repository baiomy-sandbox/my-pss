class Solution {
    int[] stairsAnswersCache=null;

    public int climbStairs(int n) {
        if(n<=1) return 1;
        if (n==2) return 2;
        if (stairsAnswersCache==null){
            stairsAnswersCache=new int[n+1];
        }
        if (stairsAnswersCache[n]!=0){
            return stairsAnswersCache[n];
        }
        stairsAnswersCache[n]=climbStairs(n-1)+climbStairs(n-2);
        return stairsAnswersCache[n];
    }
}