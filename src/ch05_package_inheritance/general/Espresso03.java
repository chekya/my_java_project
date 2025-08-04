package ch05_package_inheritance.general;

public class Espresso03 extends Beverage03{//먼저 extends 적고 아래 적는다.
    private int shotCount ; //샷 추가 개수/현재생성자 1개

    public Espresso03(String name, double price, int shotCount) {  //생성자
        super(name,price);
        this.shotCount = shotCount ;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("샷 추가 개수 : " + this.shotCount);
        System.out.println();
    }
}
