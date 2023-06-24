package org.programmers;

class Solution {
    public String solution(int[] food) {
        // 두 선수가 동시에 음식을 먹도록 표현하기 위해 left와 right 두 개의 StringBuilder를 사용합니다.
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        // 첫 번째 음식(물)을 제외한 모든 음식에 대해 반복합니다.
        for (int i = 1; i < food.length; i++) {
            // 각 음식을 반으로 나누어 왼쪽 선수와 오른쪽 선수가 같은 양을 먹을 수 있도록 합니다.
            int half = food[i] / 2;
            // 음식의 양에서 반으로 나눈 양을 빼서 남은 음식의 양을 업데이트합니다.
            food[i] -= half * 2;

            // 왼쪽 선수와 오른쪽 선수가 같은 양의 음식을 먹을 수 있도록 음식을 추가합니다.
            for (int j = 0; j < half; j++) {
                // 왼쪽 선수가 먹는 음식을 추가합니다.
                left.append(i);
                // 오른쪽 선수가 먹는 음식을 추가합니다. 문자열의 시작 부분에 음식을 추가하여 음식을 먹는 순서를 반대로 만듭니다.
                right.insert(0, i);
            }
        }

        // 왼쪽 선수와 오른쪽 선수가 모두 음식을 먹은 후에 물(음식 0)을 먹도록 합니다.
        StringBuilder answer = left.append(0).append(right);

        // 최종 음식 배치를 반환합니다.
        return answer.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution(new int[]{1, 3, 4, 6});
        System.out.println(solution);
    }
}
