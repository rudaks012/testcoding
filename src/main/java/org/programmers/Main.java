package org.programmers;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        // 모든 가능한 세 수의 조합을 찾습니다.
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    // 세 수의 합이 0이면, 삼총사를 만들 수 있는 경우의 수를 증가시킵니다.
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println(solution);
    }
}
