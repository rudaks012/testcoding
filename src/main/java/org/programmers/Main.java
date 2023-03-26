package org.programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {

    public int[][] solution(int[] num_list, int n) {
        int rows = (int) Math.ceil((double) num_list.length / n);

        //배열을 2차원 배열로 만들어주는 함수
        //IntStream.range(0, rows) : 0부터 rows까지의 숫자를 만들어줌
        //mapToObj(i -> Arrays.copyOfRange(num_list, i * n, Math.min((i + 1) * n, num_list.length))) : num_list를 i * n부터 (i + 1) * n까지의 배열로 만들어줌
        //Math.min((i + 1) * n, num_list.length) : (i + 1) * n이 num_list.length보다 크면 num_list.length를 반환
        //toArray(int[][]::new) : 2차원 배열로 만들어줌
        return IntStream.range(0, rows)
                        .mapToObj(i -> Arrays.copyOfRange(num_list, i * n, Math.min((i + 1) * n, num_list.length)))
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