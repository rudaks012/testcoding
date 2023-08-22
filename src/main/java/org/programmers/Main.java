package org.programmers;

import java.util.Collections;

class Solution {
    public String solution(int n) {
        // Collections.nCopies()는 Java의 Collections 유틸리티 클래스에 있는 메소드로, 주어진 객체를 n번 복사한 불변 리스트를 반환
        return String.join("", Collections.nCopies(n, "수박")).substring(0, n);
    }
}



public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        String solution = s.solution(3);
        System.out.println(solution);
    }
}
