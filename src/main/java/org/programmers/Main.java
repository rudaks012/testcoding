package org.programmers;

class Solution {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}




public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String  solution = s.solution(3);
        System.out.println(solution);
    }
}