package org.programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d); // 배열 오름차순 정렬

        for (int j : d) {
            if (budget - j < 0) // 예산 초과 시 종료
                break;
            budget -= j;
            answer++;
        }

        return answer;
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(new int[] {1,3,2,5,4}, 9);
        System.out.println(solution);
    }
}
