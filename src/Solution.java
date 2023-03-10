    class Solution {
        public int titleToNumber(String columnTitle) {
            int count=0;
            int power=0;
            int length=columnTitle.length();
            for (int i = 0; i <length; i++) {
                int charNum=((int)columnTitle.charAt(length-1-i)-64);
                count+=charNum*Math.pow(26,i);
                System.out.println(((int)columnTitle.charAt(i)-64)*Math.pow(26,i));

            }
            return count;
        }
    }