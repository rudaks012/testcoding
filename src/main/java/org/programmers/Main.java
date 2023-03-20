package org.programmers;

import java.util.Arrays;

class Solution {

    public int solution(int[] dot) {
        return (dot[0] > 0)
            ? (dot[1] > 0 ? 1 : 4)
            : (dot[1] > 0 ? 2 : 3);
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        s.solution(new int[]{2, 4});
    }
}