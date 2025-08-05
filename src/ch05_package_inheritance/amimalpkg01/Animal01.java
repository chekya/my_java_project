package ch05_package_inheritance.amimalpkg01; //P132

public class Animal01 {
    private String name ; //이름            //1번 슈퍼클래스에 변수 만들기
    private int lifespan ; //평균수명
    private String habitat ; //서식지
    private int speed ; //속도

    public String getName() { // getter 생성
        return name;
    }

    public Animal01() {//5번 매개변수없는 생성자 만들기, Alt + Insert --> constructor --> 제일 상단 ch05_package_...클릭 -->OK 클릭
        // (매개변수 0개짜리 생성자 생성된다.)
    }

    public Animal01(String name, int lifespan, String habitat, int speed) {
        this.name = name;
        this.lifespan = lifespan;
        this.habitat = habitat;
        this.speed = speed;
    }

    public void showInfo() {
        String message = "평균 수명이 " + this.lifespan + "인 " + this.name + "의 ";
        message += "서식지는 " + this.habitat + "입니다." ;
        System.out.println(message);
    }

    public int getSpeed() {
        return speed;
    }
}
