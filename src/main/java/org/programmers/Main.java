package org.programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        //stream 변경
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }
}


//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        s.solution(new int[]{149,180,192,170}, 167);
    }
}