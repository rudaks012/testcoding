package org.programmers;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0, index2 = 0;
        // 인덱스를 추적하기 위해 index1, index2 변수를 선언하고 0으로 초기화합니다.

        for (String word : goal) {
            if (index1 < cards1.length && word.equals(cards1[index1])) {
                index1++;
            } else if (index2 < cards2.length && word.equals(cards2[index2])) {
                index2++;
            } else {
                return "No";
            }
        }
        // goal 배열을 순회하면서 cards1, cards2 배열의 단어와 일치하는지 확인합니다.

        return "Yes";
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        System.out.println(solution);
    }
}