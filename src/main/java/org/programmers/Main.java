package org.programmers;

import java.util.Optional;
import java.util.stream.Stream;

class Solution {

    public int solution(String str1, String str2) {

        return Optional.of(Stream.of(str1.contains(str2))
                                 .mapToInt(i -> i ? 1 : 2)
                                 .findFirst())
                                 .orElseThrow()
                                 .getAsInt();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution("ab6CDE443fgh22iJKlmn1o", "6CD");
    }
}