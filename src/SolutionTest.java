import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends AbsTest {
    @Test
    void case1() {
        solution.play();
    }

    @Test
    void case2() {
        int num=9874;
        int ans=solution.getSum(num);
        System.out.println("num = "+num +" and sum = "+ans);
        assertEquals(28,solution.getSum(num));
    }
    @Test
    void case3() {
        System.out.println(solution.getFactorial(4));
    }
}