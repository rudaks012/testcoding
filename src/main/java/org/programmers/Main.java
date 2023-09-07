package org.programmers;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);

        for(int i = 0; i < d.length; i++) {
        	sum += d[i];
        	if(sum > budget) {
        		answer = i;
        		break;
        	}
        }

        return answer;
    }
}


public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(new int[] {1,3,2,5,4}, 9);
        System.out.println(solution);
    }
}
