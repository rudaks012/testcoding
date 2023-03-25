package org.programmers;

import java.util.Arrays;

class Solution {

    public int solution(int[] sides) {
        int answer = 0;
        int max = Arrays.stream(sides).sorted().max().orElse(0);
        int sum = Arrays.stream(sides).filter(i -> i != max).sum();
        if (max < sum) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴

        s.solution(new int[]{199, 72, 222});
    }
}