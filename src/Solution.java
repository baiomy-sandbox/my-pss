class Solution {
    public int[] countBits(int n) {
        int num=0;
        int[] sums=new int[n+1];
        for (int i = 0; i <=n; i++) {
            System.out.println("n = "+n+" count = "+count(n)+"pos = "+(i));
            sums[i]=count(num);
            num++;
        }
        return sums;
    }
    public int count(int n) {
        int sum = 0;
        while(n != 0){
            sum++;
            n &= (n-1);
        }
        return sum;
    }
}
