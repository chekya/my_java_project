package ch05_package_inheritance.amimalpkg01; //P132

public class Animal01 {
    private String name ; //이름
    private int lifespan ; //평균수명
    private String habitat ; //서식지
    private int speed ; //속도

    public String getName() {  //Alt + Insert -->  getter 생성
        return name;
    }

    public Animal01() {
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
