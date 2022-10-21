package org.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// 알고리즘 문제
class Solution {

    public int solution(int[] array) {
        // 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
        // 최빈값이란, 가장 많이 나타나는 값입니다.
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
//        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    list.add(array[i]);
//                    answer++;
                }
            }
        }
        int listSize = list.size();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (!Objects.equals(list.get(i), list.get(j))) {
                    list.set(i, -1);
                    break;
                }
            }
        }
        if (array.length == 1) {
            return 1;
        }
        if (list.size() == 0) {
            return 0;
        }
        System.out.println("listSize = " + list.get(0));
        return list.get(0);
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        int[] array = {1, 2, 3, 3, 3, 4};
        int[] array2 = {1, 2, 3, 4, 5, 6};
        int[] array3 = {1, 1, 1, 1, 1, 1};
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10};
        int[] array6 = {1};
//        int[] array = {1, 1, 2, 2};

        s.solution(array2);

    }
}