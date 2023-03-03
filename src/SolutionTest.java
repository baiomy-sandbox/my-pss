import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends AbsTest {
    @Test
    void case1() {
        solution.play();
    }

    @Test
    void case2() {
        System.out.println("operand = "+solution.infixToPostFix("1+9-((8*9)*3)+12"));
    }
//    @Test
//    void case3() {
//    }
}