package org.programmers;

import java.util.Arrays;

class Solution {

    public int solution(int hp) {
        int answer = 0;
        // 장성개미 사용
        while (hp >= 5) {
            hp -= 5;
            answer++;
        }

        // 병정개미 사용
        while (hp >= 3) {
            hp -= 3;
            answer++;
        }

        // 일개미 사용
        while (hp >= 1) {
            hp -= 1;
            answer++;
        }

        return answer;
    }

}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(23);
    }
}