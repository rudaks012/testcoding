package org.programmers;

class Solution {
    public int solution(int[] common) {
        int answer = 0;

        if((common[1] - common[0]) == (common[2] - common[1])) {
            answer = common[common.length-1] + (common[1] - common[0]);
        } else {
            answer = common[common.length-1] * (common[1] / common[0]);
        }
        return answer;
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