package org.programmers;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] rotated = new int[length];

        if (direction.equals("right")) {
            rotated[0] = numbers[length - 1];
            System.arraycopy(numbers, 0, rotated, 1, length - 1);
        } else if (direction.equals("left")) {
            rotated[length - 1] = numbers[0];
            System.arraycopy(numbers, 1, rotated, 0, length - 1);
        }
        return rotated;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(new int[]{1, 2, 3}, "right");
    }
}