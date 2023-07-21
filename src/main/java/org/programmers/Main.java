package org.programmers;

import java.util.stream.IntStream;

class Solution {
    public double solution(int[] arr) {
        double v = IntStream.of(arr).sum() / (double) arr.length;
        // System.out.println("v = " + v);
        return v;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        double solution = s.solution(new int[]{1, 2, 3, 4});
        System.out.println(solution);
    }
}
