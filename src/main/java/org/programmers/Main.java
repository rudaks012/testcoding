package org.programmers;

class Solution {

    public long solution(long n) {
        double sqrt = Math.sqrt(n);

        if (isInteger(sqrt)) {
            return (long) Math.pow(sqrt + 1, 2);
        }
        return -1;
    }

    private boolean isInteger(double sqrt) {
        return sqrt == (int) sqrt;
    }
}



public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        long solution = s.solution(121);
        System.out.println(solution);
    }
}
