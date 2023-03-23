package org.programmers;

import java.util.stream.IntStream;

class Solution {

    public int solution(int n) {

        return (int) IntStream.rangeClosed(1, n)
                              .filter(i -> n % i == 0)
                              .count();
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴

        s.solution(100);
    }
}