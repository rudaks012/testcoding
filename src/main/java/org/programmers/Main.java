package org.programmers;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");

        Arrays.sort(list, Collections.reverseOrder());

        return Long.parseLong(String.join("", list));
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        long solution = s.solution(118372);
        System.out.println(solution);
    }
}
