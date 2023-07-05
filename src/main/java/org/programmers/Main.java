package org.programmers;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;


class AppleBox {
    // 상자에 담긴 사과 중 가장 낮은 점수입니다.
    private int minScore = Integer.MAX_VALUE;
    // 상자에 담긴 사과의 개수입니다.
    private int count = 0;

    public void addApple(int score) {
        // 추가되는 사과의 점수가 현재 최소 점수보다 낮으면 최소 점수를 업데이트합니다.
        minScore = Math.min(minScore, score);
        count++;
    }

    // 상자의 가격을 계산하여 반환하는 메소드입니다.
    public int getPrice() {
        return minScore * count;
    }
}

class Solution {
    public int solution(int k, int m, int[] score) {
        // 사과 점수를 내림차순으로 정렬합니다.
        Arrays.sort(score);

        // PriorityQueue를 생성합니다. 이때 상자의 가격이 높은 순서대로 정렬됩니다.
        Queue<AppleBox> queue = new PriorityQueue<>((a, b) -> b.getPrice() - a.getPrice());

        for (int i = score.length - 1; i >= 0; i--) {
            // 현재 PriorityQueue의 크기가 m보다 작으면 새로운 상자를 생성하고, 그렇지 않으면 가장 작은 가격의 상자를 꺼냅니다.
            AppleBox box = queue.size() < m ? new AppleBox() : queue.poll();
            // 해당 상자에 사과를 추가합니다.
            box.addApple(score[i]);

            // 상자의 가격이 0보다 크다면 다시 PriorityQueue에 추가합니다.
            if (box.getPrice() > 0) {
                queue.offer(box);
            }
        }

        // PriorityQueue에 남아 있는 모든 상자의 가격을 합산하여 반환합니다.
        return queue.stream()
                .mapToInt(AppleBox::getPrice)
                .sum();
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int solution = s.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});
        System.out.println(solution);
    }
}
