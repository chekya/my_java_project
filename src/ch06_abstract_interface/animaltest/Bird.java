package ch06_abstract_interface.animaltest;

public interface Bird {
    int speed = 300; // fanal이 붙으면 무조건 초기화 하고(되고) 값은 앞으로 절대로 바꿀 수 없다(300으로 고정).
    //public static fanal이 암시적으로 숨어(붙어)있다.(int speed 앞에)

    void fly();
    //(public abstract)가 암시적으로 void fly(); 앞에 붙어있다.(윗 줄에는 보이지 않아도 이 문구(public abstract)가 숨어 있다.)
    // public abstract void fly();

    default void flutter(){  // 기본 동작 정의
        System.out.println("날개를 펄럭입니다.");
    }

}
