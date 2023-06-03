package org.programmers;

import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String lowerCase = my_string.toLowerCase();
        char[] chars = lowerCase.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);

        return answer;
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String cc = s.solution("Bcad");
        System.out.println("solution = " + cc);
    }
}