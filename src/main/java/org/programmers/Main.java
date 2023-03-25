package org.programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int sum = 0;
        int max = 0;
        for (int side : sides) {
            sum += side;
            max = Math.max(max, side);
        }

        return (sum - max) > max ? 1 : 2;
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