package ch05_package_inheritance.beveragetest;

public class Americano extends Beverage{

    private double waterAmount ;
    public Americano(String name, double price, double waterAmount) {
        super(name,price);
        this.waterAmount = waterAmount ;
    }

    @Override
    public void drink() {
        System.out.println(super.getName() + "를(을) 홀짝 홀짝 마십니다.");
       // System.out.println(message);
    }

    @Override
    public void make() {

        System.out.println(super.getName() +" 제조법");
        System.out.println("에스프레소 1샷을 추출합니다.");
        System.out.println("컵에 에스프레소를 넣고 뜨거운 물을 부어줍니다.");
        System.out.println("에스프레소를 먼저 넣고 물 250ml를(을) 부으면 됩니다.");

    }

    @Override
    public void display() {

    }
}
