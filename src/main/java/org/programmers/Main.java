package org.programmers;

class Solution {
    public int solution(int order) {
        String[] answer = String.valueOf(order).split("");
        int count = 0;
        for (String s : answer) {
            if (s.equals("3")) {
                count++;
            }
            if (s.equals("6")) {
                count++;
            }
            if (s.equals("9")) {
                count++;
            }
        }
        return count;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(29423);
    }
}