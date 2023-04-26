package org.programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers); // 배열을 오름차순 정렬합니다.
        int n = numbers.length; // 배열의 길이를 저장합니다.

        // 최댓값은 가장 큰 두 양수의 곱이거나 가장 작은 두 음수의 곱일 수 있습니다.
        int maxProductPositive = numbers[n-1] * numbers[n-2];
        int maxProductNegative = numbers[0] * numbers[1];

        answer = Math.max(maxProductPositive, maxProductNegative); // 두 경우 중 최댓값을 선택합니다.

        return answer;
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(new int[]{1, 2, -3, 4, -5});
    }
}