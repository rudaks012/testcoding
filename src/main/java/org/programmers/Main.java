package org.programmers;

class Solution {
    public int solution(int order) {
        String[] answer = String.valueOf(order).split("");
        String[] numbers = {"3", "6", "9"};
        int count = 0;
        for (String s : answer) {
            for (String number : numbers) {
                if (s.equals(number)) {
                    count++;
                }
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