package ch06_abstract_interface.beveragetest;

public class Latte extends Beverage{
    private String milkType ;

    public Latte(String name, double price, String milkType) {
        super(name,price);
        this.milkType = milkType ;
    }

    @Override
    public void drink() {
        System.out.println("부드럽고 크리미한 " + super.getName() + "를 마십니다.");
    }

    @Override
    public void make() {
        System.out.println(super.getName() + " 제조법");
        System.out.println("에스프레소 2샷을 추출합니다.");
        System.out.println("컵에 에스프레소를 넣고 따뜻하게 데운 우유와 바나나 시럽을 넣어줍니다.");
        System.out.println("에스프레스를 먼저 넣고 따뜻하게 데운 우유와 바나나 시럽을 넣으면 됩니다.");
    }

    @Override
    public void display() {

    }
}
