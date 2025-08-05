package ch05_package_inheritance.general;
//서브클래스_하위클래스(상속을 받는다.)자식클래스
//             서브클래스 extends 슈퍼클래스
public class Americano03 extends Beverage03 {
    private double waterAmount ; //투입하는 물의 양


    public Americano03(String name, double price, double waterAmount) {
       // super();  //부모님의 생성자 호출(super() 가 있건없건 부모님의 생성자는 자동호출 된다.아래 super(name,price);생성(입력)하면 자동호출 된 super()는 사라진다.
        super(name, price); //부모님의 생성자
        this.waterAmount = waterAmount;
    }

    public void printInfo(){
        super.showInfo(); //부모님이 갖고 있는 메소들를 호출하는 구문
        System.out.println("투입된 물의 량 : " + this.waterAmount);
        System.out.println();
    }
}
