package org.programmers;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        return Arrays.stream(arr)
                     .filter(factor -> factor % divisor == 0)
                     .toArray();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] solution = s.solution(new int[]{5, 9, 7, 10}, 5);
        System.out.println(Arrays.toString(solution));
    }
}
