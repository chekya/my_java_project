package ch05_package_inheritance.mybeverage;

public class Americano04 extends Beverage04{
    private double waterAmount;

    @Override
    public String toString() {
        String message = ", 물량 : " + this.waterAmount + "ml";
        return super.toString() + message ; //물량도 출력하고 Beverage안의 이름과 단가도 호출해서 출력하라는 의미
        //여기의 super는 object에서 온 super
    }

    public void sipAmericano(){
        // sip : 음료를 홀짝이다. 조금씩 마시다.(동작)
        String message = "아메리카노를 홀짝 홀짝 마십니다.";
        System.out.println(message);
    }

    public Americano04(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }
}
