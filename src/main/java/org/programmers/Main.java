package org.programmers;

import java.util.Arrays;
import java.util.Collections;

class Solution {

    public int[] solution(long n) {
        return new StringBuilder(String.valueOf(n))
            .reverse()
            .chars()
            .map(Character::getNumericValue)
            .toArray();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] solution = s.solution(12345);
        System.out.println(Arrays.toString(solution));
    }
}
