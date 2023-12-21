package Chap_01;

import Chap_01.Rectangle;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        // Chap_01.Rectangle 클래스에서 변수로 불러오기
        Rectangle rectangle = new Rectangle(5, 8);

        // 정수 변수 area 안에 Chap_01.Rectangle 클래스 안의 함수를 불러오기
        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        // 정수 변수 perimeter 안에 Chap_01.Rectangle 클래스 안의 함수를 불러오기
        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레: " + perimeter);

        // 불 변수 square 안에 Chap_01.Rectangle 클래스 안의 함수를 불러오기
        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}