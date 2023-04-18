package org.programmers;

import java.util.Arrays;

class Solution {

    public int solution(int n) {
        String number = String.valueOf(n);

        return Arrays.stream(number.split(""))
                     .mapToInt(Integer::parseInt)
                     .sum();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(1234);
    }
}