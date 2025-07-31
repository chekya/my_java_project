package ch04_class;

import java.security.PublicKey;

public class Saram03 {
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    //public 반환타입 메소드이름(매개변수)
    public void setName(String name) {
        this.name = name;// 인스턴스변수(좌측) = 지역변수(우측)
    }
    //public 반환타입 메스드이름(매개변수)//getter 반환타입이므로 return 넣어줘야 한다.
    public String getName() {
        return name; //name는 인스턴스 변수
    }


    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight () {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }




}
