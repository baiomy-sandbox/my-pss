public class AbsTest {
    Solution solution;
    AbsTest(){
        solution=new Solution();
    }
    Solution getObj(){
        return new Solution();
    }
    void clean(){
        solution=new Solution();
    }
}
