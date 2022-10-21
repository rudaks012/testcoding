package org.programmers;

// 알고리즘 문제
class Solution {

    public int solution(int[] array) {
        // 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
        // 최빈값이란, 가장 많이 나타나는 값입니다.
        // 예를 들어, [1, 3, 4, 3, 3, 2, 1]이 주어졌을 때, 3이 세 번 나타나므로 최빈값은 3입니다.\
        // 1. 배열의 길이가 1이면 그냥 리턴
        // 2. 배열의 길이가 2이상이면
        // 3. 배열의 길이만큼 반복문을 돌면서
        // 4. 배열의 값이 같으면 카운트를 올린다.
        // 5. 카운트가 가장 큰 값을 리턴한다.
        // 6. 카운트가 같으면 -1을 리턴한다.
        int answer = 0;
        int max = 0;
        int count = 0;
        int[] countArray = new int[array.length];
        if (array.length == 1) {
            return array[0];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            countArray[i] = count;
            count = 0;
        }
        for (int i = 0; i < countArray.length; i++) {
            if (max < countArray[i]) {
                max = countArray[i];
                answer = array[i];
            }
        }
        for (int i = 0; i < countArray.length; i++) {
            if (max == countArray[i] && answer != array[i]) {
                answer = -1;
            }
        }
        return answer;

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