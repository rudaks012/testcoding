package org.programmers;

import java.util.Arrays;

// 알고리즘 문제
class Solution {

    public int solution(int[] array) {
        int[] arr = Arrays.stream(array).sorted().toArray();
        return arr[arr.length / 2];
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        int[] array = {1, 2, 10, 7, 11};

        s.solution(array);

    }
}