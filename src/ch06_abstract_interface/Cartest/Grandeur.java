package ch06_abstract_interface.Cartest;

public class Grandeur extends Car{
    private double fuel ;  //연비
    private String remark ;  //연비에 대한 메모

    @Override
    public String toString() {
        String message = "연비 : " + this.fuel + "\n";
        message += "연비에 대한 메모 : " + this.remark;
        return super.toString() + message;
    }

    public Grandeur(String name, int price, Key key, double fuel) { //생성자 용도는 인스턴스 초기화
        super(name, price, key);
        this.fuel = fuel;

        if(this.fuel >= 20.0){
            this.remark = "excellent";
        }else if(this.fuel >= 15.0){
            this.remark = "good";
        }else{
            this.remark = "poor";
        }
    }

    @Override
    public void display() {
        double mileSpeed = super.speed / 1.6;
        String message = super.getName() + "의 현재 속도 : " + mileSpeed + "mile입니다.";
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
