package org.programmers;


class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                String data = String.valueOf(c).toLowerCase();
                answer.append(data);
            } else {
                String data = String.valueOf(c).toUpperCase();
                answer.append(data);
            }
        }

        return answer.toString();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("cccCCC");
    }
}