package org.programmers;

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {

        return IntStream.range(0, absolutes.length)
                .map(i -> signs[i] ? absolutes[i] : -absolutes[i])
                .sum();
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int solution = s.solution(absolutes, signs);
        System.out.println(solution);
    }
}