import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends AbsTest {
    @Test
    void case1() {
        assertEquals("2 8 2 3 * + 2 / + 1 -",solution.infixToPostFix("2+((8+2*3)/2)-1"));
    }

    @Test
    void case2() {
        assertEquals("1 9 + 8 9 * 3 * - 12 898 * +",solution.infixToPostFix("1+9-((8*9)*3)+(12*898)"));
//        assertEquals("1+9-((8*9)*3)+(12*898)");
    }
//    @Test
//    void case3() {
//    }
}