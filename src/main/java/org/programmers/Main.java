package org.programmers;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int sqrt = (int) Math.sqrt(n);
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}



public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(12);
        System.out.println(solution);
    }
}