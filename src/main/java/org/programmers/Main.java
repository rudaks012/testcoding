package org.programmers;



class Solution {
    public int solution(int n) {
        double result = Math.sqrt(n) % 1 == 0 ? 1 : 2;
        return (int) result;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(976);
    }
}