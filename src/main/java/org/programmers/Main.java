package org.programmers;

class Solution {
    public int solution(String numStr, String targetStr) {
        int targetLength = targetStr.length();
        long targetValue = Long.parseLong(targetStr);
        int occurences = 0;

        // 길이가 targetLength인 창을 numStr에 슬라이드
        for (int i = 0; i <= numStr.length() - targetLength; i++) {
            // numStr의 하위 문자열을 가져와서 long으로 변환
            long subValue = Long.parseLong(numStr.substring(i, i + targetLength));

            // subValue가 targetValue보다 작거나 같으면 카운트를 증가시킵니다.
            // subValue가 targetValue보다 크면 아무것도하지 않습니다.

            if (subValue <= targetValue) {
                occurences++;
            }
        }
        return occurences;
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution("3141592", "271");
        System.out.println(solution);
    }
}