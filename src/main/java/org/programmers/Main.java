package org.programmers;

import java.util.stream.IntStream;

class Solution {

    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length)
                        .map(i -> a[i] * b[i])
                        .sum();
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        double solution = s.solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2});
        System.out.println(solution);
    }
}
