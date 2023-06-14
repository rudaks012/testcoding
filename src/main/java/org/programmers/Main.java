package org.programmers;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        for (char ch : s.toCharArray()) {
            for (int i = 0; i < index; ) {
                ch++;
                if (ch > 'z') {
                    ch = 'a';
                }
                if (skip.indexOf(ch) == -1) {
                    i++;
                }
            }
            answer.append(ch);
        }
        return answer.toString();
    }
}



public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution("aukks", "wbqd", 5);
        System.out.println(solution);
    }
}