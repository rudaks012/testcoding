package org.programmers;

import java.util.Arrays;

class Solution {

    public int[] solution(int[] numbers, int num1, int num2) {
        //return Arrays.stream(numbers).skip(num1).limit(num2 - num1 + 1).toArray();
        System.out.println(
            Arrays.toString(Arrays.stream(numbers)
                                  .skip(num1)
                                  .limit(num2 - num1 + 1)
                                  .toArray()));
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        s.solution(new int[]{1, 2, 3, 4, 5}, 1, 3);
    }
}