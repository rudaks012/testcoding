package org.programmers;

import java.util.Arrays;

class Solution {

    public int solution(int[] numbers) {
        int[] sort = Arrays.stream(numbers).sorted().toArray();
        return sort[sort.length-1] * sort[sort.length-2];
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