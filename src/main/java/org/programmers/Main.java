package org.programmers;

class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = 0;

        for (int i = 1; i <= count; i++) {
            totalCost += (long) price * i;
        }

        long deficit = totalCost - money;
        return deficit > 0 ? deficit : 0;
    }
}



public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        long solution = s.solution(3, 20, 4);
        System.out.println(solution);
    }
}
