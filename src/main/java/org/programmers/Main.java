package org.programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] box, int n) {
        return Arrays.stream(box)
                     .map(j -> (int) ((double) j / n))
                     .reduce(1, (a, b) -> a * b);
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(new int[]{1, 1, 1}, 1);
    }
}