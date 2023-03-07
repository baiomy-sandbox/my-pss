import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends AbsTest {
    @Test
    void case1() {
        assertEquals(1, solution.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    void case2() {
        assertEquals(4, solution.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }


    @Test
    void case3() {
        assertEquals(4, solution.singleNumber(new int[]{1, 2, 4, 1, 2}));
    }



}