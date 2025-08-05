package ch05_package_inheritance.amimalpkg01;

public class Eagle01 extends Animal01 {
    private int wing; //날개 개수  /각 서브클래스의 변수 만들기

    public Eagle01(String name, int lifespan, String habitat, int speed, int wing) {
        super(name, lifespan, habitat, speed);
        this.wing = wing;
    }

    public void showInfo() {
        super.showInfo();
        String message = super.getName() + "날개 개수는 " + this.wing + "개 입니다.";
        System.out.println(message);


    }

    public void fly() { // 날아 다니기 /각 서브클래스의 메소드 만들기
        String message = super.getName() + "이(가) " + super.getSpeed() + "의 속도로 날아 다닙니다.";
        System.out.println(message);
    }
}
