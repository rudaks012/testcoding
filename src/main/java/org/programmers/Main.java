package org.programmers;

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int sqrt = (int) Math.sqrt(n);
        return IntStream.rangeClosed(1, sqrt) // 1부터 sqrt까지
                .filter(i -> n % i == 0) // 스트림에서 n의 약수만을 선택
                .flatMap(i -> IntStream.of(i, n / i)) //각 약수 i에 대해 i와 n/i를 스트림에 추가
                .distinct() // 중복 제거
                .sum();
    }
}




public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(12);
        System.out.println(solution);
    }
}