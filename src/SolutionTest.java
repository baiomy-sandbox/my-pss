import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends AbsTest {
    @Test
    void case1() {
        assertEquals("2 8 2 3 * + 2 / + 1 -",solution.infixToPostFix("2+((8+2*3)/2)-1"));
    }

    @Test
    void case2() {
        String expression = solution.infixToPostFix("1+9-(((8*9))*3)+(12*898)");
        assertEquals(1+9-(((8*9))*3)+(12*898),solution.prefixEvaluation(expression));
    }
    @Test
    void case3() {
        String expression = solution.infixToPostFix("(98536+2)*33+(6/987)+40098");
        assertEquals((98536+2)*33+(6/987)+40098,solution.prefixEvaluation(expression));
    }
}