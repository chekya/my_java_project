package ch05_package_inheritance.general;
//슈퍼클래스_상위클래스(상속을 해준다.)부모클래스
public class Beverage03 {//현재 생성자 1개,매개변수는 0개(눈에 보이든 안보이든)
    private  String name ;  //이름 ,현재 null
    private  double price ; //단가, 현재 0.0 ?

    public  Beverage03(){} //Espresso03만들 때 무조건 만들고 시작

    //접근지정자 반환타입(적지않는다) 생성자이름_클래스이름과 같다(매개변수){...}->생성자 만드는 방식/현재 생성자 1개
    public Beverage03(String name, double price){   //부모생성자(무조건 먼저 만들고 시작/부모의 변수와 초기화가 먼저 필요함).자식 클래스는 부모 클래스의 속성(변수)를 상속받기 때문에 자식 객체를 만들기 전에 부모 객체부터 먼저 제대로 초기화하고 시작해야한다.
        this.name = name; //위가 null이므로 this.name = name ; 넣는다.
        this.price = price;
    }

    protected void showInfo() {
        System.out.println("음료 이름 : " + name);
        System.out.println("단가 : " + price);
    }
}
