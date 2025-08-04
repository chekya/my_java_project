package ch05_package_inheritance.mybeverage;

public class Beverage04 {
    private String name;
    private double price;

    public  Beverage04(){}

    protected void showInfo(){  //void 앞에 아무것도 안붙이면 기본 /이론 P81
        System.out.println("\n음료 이름 : " + this.name); // \n ->엔터키
        System.out.println("단가 : " + this.price);

    }
    public Beverage04(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
