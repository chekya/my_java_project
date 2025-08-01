package ch04_class;  //P114

import java.util.Scanner;

public class Saram04 {   // 기본생성자 1개 있다. (보이지는 않으나)
    private String name; //기본값 null
    private double height;  //기본값 0.0
    private double weight;
    private String hobby;  //private String hobby = "볼링" 이라고 하면 모든 결과물에 볼링이라고 출력됨
    private String blood;

    Scanner scan = null; // 이런 변수가 있다라고 선언

    // public 반환타입 이름(매개변수){...} 이 생성자는 반환타입(void)자체를 적지 말라고 한다.
    public Saram04(String name, double height, double weight, String hobby, String blood) {
        this.name = name;   //할당(위 아래 순서 바꿔도 된다. name 다음에 boold 와도 되지만 권장안함. )
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;

    }

    public Saram04() {  // 이것도 생성자 (눈에 안보이는 생성자는 사라지므로 여기까지 생성자 1개)
        this.name = "김철수";
        scan = new Scanner(System.in);  //해당 장치를 생성자에서 초기화 시킴

    }

    public Saram04(String name, double height, double weight, String blood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = "볼링";
        this.blood = blood;


    }

    public void display() {
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("몸무게 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.blood);

//        if (scan != null) {
//            System.out.println("정수 입력 : ");
//            int su = this.scan.nextInt();
//            System.out.println("입력된 정수 : " + su);
//        }
    }
}