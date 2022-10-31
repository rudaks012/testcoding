package org.programmers;

// 알고리즘 문제
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String words[] ={"aya", "ye", "woo", "ma"};

        for(String btemp : babbling){
            for(int i =0; i< 4; i++){
                if(btemp.indexOf(words[i])!=-1){
                    btemp=btemp.replace(words[i], ".");
                }
            }
            if(btemp.equals(".")){ answer++; }
            if(btemp.equals("..")){ answer++; }
            if(btemp.equals("...")){ answer++; }
            if(btemp.equals("....")){ answer++; }
        }
        return answer;
    }
}

//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        String[] babbling = {"ata", "yee", "u", "maa", "wyeoo"};
        s.solution(babbling);

    }
}