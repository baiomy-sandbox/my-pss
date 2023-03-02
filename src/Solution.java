public class Solution {
    void play() {
        printNum(6840);
    }

    void printNum(int num) {
        if (num == 0) {
            return;
        }
        System.out.println("num = " + num % 10);
        printNum(num / 10);
    }
    int getSum(int num){
    if(num==0)return 0;
        System.out.println(num);
    return (num%10)+getSum(num/10);
    }
    int getFactorial(int num){
        if(num<=0)return 1;
        return num*getFactorial(num-1);
    }
}
