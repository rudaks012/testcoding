package org.programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {

    public int solution(int[] numbers) {
        int max = IntStream.of(numbers).max().orElse(0);
        int max2 = IntStream.of(numbers).filter(i -> i != max).max().orElse(0);
        return max * max2;
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        s.solution(new int[]{1, 2, 3, 4, 5});
    }
}