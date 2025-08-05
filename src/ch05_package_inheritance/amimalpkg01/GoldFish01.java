package ch05_package_inheritance.amimalpkg01;

public class GoldFish01 extends Animal01{
    private int gill ; //아가미 개수

    @Override
    public void showInfo() {
        super.showInfo(); //평균수명....라인 출력문구
        String message = super.getName() + "의 아가미 개수는 " + this.gill + "개입니다." ; //getter를 Animal01에 생성하고 돌아온다
        System.out.println(message);
    }

    public GoldFish01(String name, int lifespan, String habitat, int speed, int gill) {
        super(name,lifespan, habitat, speed);
        this.gill = gill ;
    }

    public void swim(){ //헤엄치는 동작
        String message = super.getName() + "이(가) " + super.getSpeed() + "의 속도로 헤엄칩니다.";
        System.out.println(message);

    }
}
