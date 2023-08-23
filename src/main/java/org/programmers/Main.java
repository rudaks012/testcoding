package org.programmers;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int num = left; num <= right; num++) {
            int divisorCount = countDivisors(num);
            if (divisorCount % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }
        }

        return answer;
    }

    private int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count++;
                if (i != num / i) { // 제곱근 이하에서 나누어 떨어지면, 그 수와 그 수로 나눈 몫 2개의 약수를 카운트
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
        int solution = s.solution(13, 17);
        System.out.println(solution);
    }
}
