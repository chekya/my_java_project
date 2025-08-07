package ch06_abstract_interface.Cartest;

public class Avante extends Car {
    private String comment ;

    @Override
    public String toString() {

        String message = "코멘트 : " + comment;
        return super.toString() + message;  //super.toString()은 부모 클래스(Car)의 toString() 메서드를 호출하는 것이다.
                                            //여기에 위에서 만든 message를 이어 붙여서 최종 문자열을 반환하는 코드이다.

    }

    public Avante(String name, int price, Key key, String comment) {
        super(name, price, key);
        this.comment = comment;
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
