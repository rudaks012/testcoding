package org.programmers;

import java.util.stream.IntStream;

class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);


        return IntStream.range(0, numStr.length())
                .filter(i -> numStr.charAt(i) - '0' == k)
                .map(i -> i + 1)
                .findFirst()
                .orElse(-1);

    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(29183, 1);
        System.out.println("solution = " + solution);
    }
}