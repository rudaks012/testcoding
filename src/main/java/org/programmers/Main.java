package org.programmers;

import java.util.Arrays;

class Solution {

    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist)
            .filter( num -> num % n == 0)
            .toArray();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
    }
}