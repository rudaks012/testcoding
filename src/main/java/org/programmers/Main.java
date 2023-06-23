package org.programmers;

class Solution {
    public String solution(int num, int num2, int num3) {
        int sum = num + num2 + num3;

        return sum % 2 == 0 ? "Even" : "Odd";
    }
}




public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String  solution = s.solution(3,5,8);
        System.out.println(solution);
    }
}