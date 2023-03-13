import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();

        while (n != 1) {

            int current = n;
            int sqrSum = 0;

            while (current != 0) {
                int r = current % 10;
                sqrSum = sqrSum + r * r;
                current = current / 10;
            }
            if (set.contains(sqrSum)) {
                return false;
            }
            set.add(sqrSum);
            n = sqrSum;

        }
        return true;
    }
}
