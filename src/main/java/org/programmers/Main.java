package org.programmers;

class Solution {
    public String solution(int[] food) {
        String answer = "0";
        // 1. 가장 많이 먹은 음식을 찾는다.
        // 2. 그 음식을 제외한 나머지 음식을 먹는다.
        // 3. 1~2번을 반복한다.
        // 4. 모든 음식을 먹었을 때, 가장 많이 먹은 음식부터 가장 적게 먹은 음식까지 순서대로 정답에 추가한다.
        // 5. 정답을 반환한다.
        // 6. 음식을 먹을 수 없는 경우 -1을 반환한다.
        // 7. 음식을 먹을 수 있는 경우, 정답을 반환한다.

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution(new int[]{1, 3, 4, 6});
        System.out.println(solution);
    }
}
