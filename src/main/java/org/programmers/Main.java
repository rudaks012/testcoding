package org.programmers;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return new StringBuilder(new String(chars)).reverse().toString();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution("Zbcdefg");
        System.out.println(solution);
    }
}
