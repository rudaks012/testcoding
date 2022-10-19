package org.programmers;

import java.util.*;

// 알고리즘 문제
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        answer = answer/(double)numbers.length;
        return answer;
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        s.solution(numbers);

    }
}