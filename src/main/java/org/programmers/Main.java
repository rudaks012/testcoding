package org.programmers;

import java.util.Arrays;

// 알고리즘 문제
class Solution {
    public int solution(int[] common) {
//등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
       //등차수열 혹은 등비수열이 아닌 경우는 없습니다.
        //공비가 0인 경우는 없습니다.
        //공차가 0인 경우는 없습니다.

        int check1 = common[0];
        int check2 = common[1];
        int[] check = Arrays.copyOf(common, common.length);
        int[] checkSort = Arrays.stream(check).sorted().toArray();
        int lastNumber = checkSort[checkSort.length - 1];
        if (check2 - check1 == 1) {
            System.out.println("lastNumber = " + lastNumber);
            return lastNumber + 1;
        } else {
            int result = check2 - check1;
            return lastNumber * result;
        }
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        int[] common = {2, 4, 6, 8, 10};
        s.solution(common);
    }
}