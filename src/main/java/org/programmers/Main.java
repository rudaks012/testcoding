package org.programmers;


class Solution {

    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        for (int i = code - 1; i < cipher.length(); i += code) {
            answer.append(cipher.charAt(i));
        }
        return answer.toString();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("dfjardstddetckdaccccdegk", 4);
    }
}