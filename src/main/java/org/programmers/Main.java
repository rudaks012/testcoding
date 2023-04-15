package org.programmers;

import java.util.Set;
import java.util.stream.Collectors;

class Solution {

    public String solution(String my_string) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'); // 대소문자를 모두 포함한 모음 집합 생성

        return my_string.chars() // 문자열에서 문자 스트림 생성
                        .filter(c -> !vowels.contains((char) c)) // 모음을 제외한 문자만 필터링
                        .mapToObj(c -> String.valueOf((char) c)) // 각 문자를 문자열로 변환
                        .collect(Collectors.joining()); // 문자열을 결합하여 결과를 생성
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("bus");
    }
}