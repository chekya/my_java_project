package ch05_package_inheritance.beveragetest;

public class Espresso extends Beverage{
    private int shotCount ;

    public Espresso(String name, double price, int shotCount) {
        super(name,price);
        this.shotCount = shotCount ;
    }

    @Override
    public void drink() {
        System.out.println("맛이 진하고 강렬한 " +super.getName()+" 를 마십니다.");
    }

    @Override
    public void make() {
        System.out.println(super.getName() + " 제조법");
        System.out.println("원두를 미세하게 갈아서, 탬퍼로 평평하게 눌러줍니다.");
        System.out.println("포터필터를 머신에 장착하고, 25-30초 동안 1개의 에스프레소 샷을 추출합니다.");
        System.out.println();
    }

    @Override
    public void display() {

    }
}
