class Solution {
    public int maxProfit(int[] prices) {
        int lsf = prices[0];
        int op = 0;
        int pist = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}