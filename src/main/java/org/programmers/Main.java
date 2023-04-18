package org.programmers;

import java.util.Arrays;

class Solution {

    public int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[^0-9]", "")
                                      .split(""))
                     .mapToInt(Integer::parseInt)
                     .sum();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("aAb1B2cC34oOp");
    }
}