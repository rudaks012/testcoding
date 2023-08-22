package org.programmers;

class Solution {

    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);
        if (x == (int) x) {
            answer = (long) Math.pow(x + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }
}



public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        long solution = s.solution(121);
        System.out.println(solution);
    }
}
