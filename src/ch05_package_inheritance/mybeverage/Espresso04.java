package ch05_package_inheritance.mybeverage;

public class Espresso04 extends Beverage04 {
    private  int shotCount;

    @Override
    public String toString() {
        String message = ", 샷 추가 : " + this.shotCount + "개" ;
        return super.toString() + message ;
    }

    public void drinkEspresso(){
        super.getName();
        String message = "맛이 진하고 강렬한 " + super.getName() + "을(를) 마십니다." ;
        System.out.println(message);
    }

    public Espresso04(String name,double price,int shotCount) {//이아랫줄에 안보여도 super()가 있고 super(name,price);작성 후 사라진다.
        super(name,price);
        this.shotCount = shotCount;
    }
}
