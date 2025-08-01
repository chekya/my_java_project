package ch04_class;

import java.util.Scanner;

public class Saram05 {
    private String name;
    private double height;
    private double weight;
    //hobby는 생성자를 통하여 입력하지 않으면 기본값으로 "축구"가 할당됩니다.
    private String hobby = "축구";
    private String blood;

    public Saram05() { //습관적으로 적어놓는 습관을 들인다( 왜? 공부하자)
    }

    public Saram05(String name, double height, double weight, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.blood = blood;

    }

    public Saram05(String name, double height, double weight, String hobby, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;

    }

    public void display() {
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("몸무게 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.blood);
    }
}
