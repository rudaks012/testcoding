package org.programmers;

import java.util.Arrays;

class Solution {
    public String solution(String phone_number) {
        char[] chars = phone_number.toCharArray();
        Arrays.fill(chars, 0, chars.length - 4, '*');
        return String.valueOf(chars);
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution("01033334444");
        System.out.println(solution);
    }
}
