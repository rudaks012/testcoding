package org.programmers;

import java.util.Arrays;

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            result.append(String.valueOf(my_string.charAt(i)).repeat(Math.max(0, n)));
        }

        return result.toString();
    }
}
public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("hello",3);
    }
}