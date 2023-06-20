package org.programmers;

import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 1. 문자열을 순회하면서, 해당 문자가 이전에 나온 적이 있는지 확인한다.
        // 2. 이전에 나온 적이 있다면, 현재 인덱스에서 이전 인덱스를 뺀 값을 배열에 넣는다.
        // 3. 이전에 나온 적이 없다면, -1을 배열에 넣는다.
        // 4. 문자를 순회하면서, 해당 문자의 인덱스를 기록한다.
        // 5. 배열을 리턴한다.
        // 6. 시간 복잡도: O(N)
        // 7. 공간 복잡도: O(N)

        int[] answer = new int[s.length()];
        Map<Character, Integer> charToIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (charToIndexMap.containsKey(ch)) {
                answer[i] = i - charToIndexMap.get(ch);
            } else {
                answer[i] = -1;
            }
            charToIndexMap.put(ch, i);
        }

        return answer;
    }
}



public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] solution = s.solution("banana");
        System.out.println(Arrays.toString(solution));
    }
}