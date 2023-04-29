package org.programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int max = numbers[numbers.length - 1];
        int[] arr = new int[max + 1];
        for (int i = 0; i < numbers.length; i++) {
            arr[numbers[i]]++;
        }
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) {
                answer += i;
            }
        }
        return answer;

    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(new int[]{1, 2, -3, 4, -5});
    }
}