package ch05_package_inheritance.mybeverage;

public class Latte04 extends Beverage04{
    private String milkType;

    @Override
    public String toString() { //tos치면 박스뜬다.
        String message = ", 우유 타입 : " + this.milkType + "";
        return super.toString() + message;
    }

    public void enjoyLatte(){
        String message = "부드럽고 크리미한 " + super.getName() + "을(를) 마십니다.";
        System.out.println(message);
    }

    public Latte04(String name, double price,String milkType){
        super(name,price);
        this.milkType = milkType;

    }
}
