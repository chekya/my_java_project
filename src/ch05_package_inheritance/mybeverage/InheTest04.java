package ch05_package_inheritance.mybeverage;

public class InheTest04 {
    public static void main(String[] args) {
        //클래스이름 객체이름 = new 생성자이름(); 객체생성공식

        // 승급(upcasting) : 서브 클래스가 일시적으로 슈퍼 클래스의 타입으로 변환이 되는 과정(전제조건 : 상속관계여야한다.)
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250.0);

        //슈퍼 클래스 내에 있는 메소드는 상속 개념에 의하여 접근이 가능합니다. (beverage01.(토트찍으면) showInfo가 보이는 이유)
        beverage01.showInfo();

        //승급시 서브 클래스내의 변수와 메소드는 일시적으로 접근을 하지 못한도록 설계되어 있습니다.
        //단, 강등을 하게 되면 서브 클래스 내의 변수와 메소드를 접근할 수 있습니다.
        //int i = (int)3.14; //명시적형변환
        Americano04 ame = (Americano04)beverage01 ; //강등 (전제조건 : 상속관계여야한다.)
        ame.sipAmericano();  //이제 ame.(도트 찍으면)sipAmericano 가 보인다.

    }
}
