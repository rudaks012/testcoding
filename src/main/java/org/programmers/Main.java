package org.programmers;

// 알고리즘 문제
//class Solution {
//    public int solution(int n, int k) {
//        int answer = 0;
//        int shep = 12000;
//        int drink = 2000;
//        int service = 0;
//
//        int shepCnt = n * shep;
//        int drinkCnt = k * drink;
//
//        if (n % 10 == 0) {
//            service = n / 10;
//            service = service * drink;
//            answer = shepCnt + drinkCnt - service;
//        } else {
//            service = n / 10;
//            service = service * drink;
//            answer = shepCnt + drinkCnt - service;
//        }
//        System.out.println("service = " + answer);
//        return answer;
//    }
//}
class Solution {

    public int solution(int n, int k) {
        int lambTotalPrice = totalPrice(Menu.LAMB, n);
        int drinkTotalPrice = totalPrice(Menu.DRINK, k);
        int discountPrice = discount(n);

        return lambTotalPrice + drinkTotalPrice - discountPrice;
    }

    private int discount(int lambQuantity) {
        int point = lambQuantity / 10;
        return Menu.DRINK.getPrice() * point;
    }

    private int totalPrice(Menu menu, int quantity) {
        return menu.getPrice() * quantity;
    }

}

enum Menu {
    LAMB("양꼬치", 12000),
    DRINK("음료수", 2000);

    private final String name;
    private final int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}


//Main 클래스에서 Solution클래스 선언해주기
public class Main {

    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴
        int n = 64;
        int k = 6;
        s.solution(n, k);

    }
}