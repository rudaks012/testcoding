package org.programmers;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {

    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        IntStream stream = Arrays.stream(num_list);
        Map<Boolean, Long> counts = stream.boxed()
                                          .collect(
                                              Collectors.partitioningBy(
                                                  n -> n % 2 == 0,
                                                  Collectors.counting()
                                              )
                                          );
        long even = counts.getOrDefault(true, 0L);
        long odd = counts.getOrDefault(false, 0L);
        answer[0] = (int) even;
        answer[1] = (int) odd;

//            int even = (int) Arrays.stream(num_list).filter(n -> n % 2 == 0).count();
//            int odd = num_list.length - even;
//            return new int[]{even, odd};

        return answer;
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        s.solution(new int[]{1, 3, 5, 7});
    }
}