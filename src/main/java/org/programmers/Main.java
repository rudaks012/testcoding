package org.programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {

    public int[][] solution(int[] num_list, int n) {
        int row = (int) Math.ceil((double) num_list.length / n);

        //배열을 2차원으로 만들어주는 코드
        return IntStream.range(0, row)
            .mapToObj(i ->Arrays.copyOfRange(num_list, i * n, Math.min((i + 1) * n, num_list.length)))
            .toArray(int[][]::new);
    }
}


//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴

        s.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2);
    }
}