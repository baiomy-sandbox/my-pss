import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> words = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    words.add("FizzBuzz");
                    continue;
                }
                words.add("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                words.add("Buzz");
                continue;
            }
            words.add("" + i);
        }
        return words;
    }
}