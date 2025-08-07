package ch06_abstract_interface.Cartest;  //P161

public class Sonata extends Car{
    private String maker ;

    @Override
    public String toString() {
        String message = "제조사 : " + this.maker ;
        return super.toString() + message;
    }

    public Sonata(String name, int price, Key key, String maker) {
        super(name, price, key);
        this.maker = maker;
    }

    @Override
    public void display() {
        String message = super.getName() + "의 현재 속도 : " + super.speed + "km입니다.";
        System.out.println(message);

    }

    @Override
    public void speedUp(int speed) {
        super.speed += speed;  //super.speed가 현재값  /가속
        super.speed = super.checkSpeed();  //체크하는 동작은 동작이므로 메소드

    }

    @Override
    public void speedDown(int speed) {
        super.speed -= speed < 0 ? -speed : speed ; // "입력 값이 양수든 음수든 항상 절댓값만큼 속도를 줄인다"는 의도
        //삼항 연산자(?:)와 함께 speed 값을 감소시키는 코드.
        //super.speed는 부모 클래스에서 선언된 속도 필드라고 가정할 수 있고,
        //speed는 **매개변수(parameter)**이다.
        //즉, 매개변수 speed가 음수든 양수든 상관없이 항상 그 절댓값만큼 부모 클래스의 속도를 감소시키는 코드이다.


    }
}
