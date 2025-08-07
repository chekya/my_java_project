package ch06_abstract_interface.animaltest;  //P157

//아랫줄은 Unicon은 Animal 클래스를 상속받고, Bird와 Horse라는 두 인터페이스를 구현한다라는 의미
public class Unicon extends Animal implements Bird, Horse {
    private String name; //이름
    private String gender; //성별
    private String feed; //사료

    private int initspeed; //초기 속도

    @Override
    public void flutter() {
        String message = this.name + "이(가) 화려하게 날개를 퍼덕입니다.";
        //Bird.super.flutter();
        System.out.println(message);
    }

    public Unicon(String name, String gender, String feed) {
        this.name = name;
        this.gender = gender;
        this.feed = feed;

        if (this.gender == "M") {
            this.initspeed = Bird.speed;
        } else {
            this.initspeed = Horse.speed;
        }
    }

    @Override
    public void fly() { //구현체(구체화)메소드
        String message = this.name + "이(가) 시속 " + Bird.speed + "의 속도로 날아 갑니다.";
        System.out.println(message);
    }

    @Override
    public void run() {
        String message = this.name + "이(가) 시속 " + Horse.speed + "의 속도로 달려 갑니다.";
        System.out.println(message);
    }

    @Override
    public void eat() {
        String message = this.name + "이(가) " + this.feed + "를 먹습니다.";
        System.out.println(message);
    }

    public void display() {
        String message = this.name + "의 초기 속도는 " + this.initspeed + "입니다.";
        System.out.println(message);
        this.run();
        this.eat();
        this.fly();//this가 호출하므로 fly는 인스턴스 메소드
    }
}
