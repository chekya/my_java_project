package ch06_abstract_interface.animaltest;

public interface Horse {
    final int speed = 70 ; // speed 70은 final로 고정된 상수(변하지 않는 수)가 된다.

    public abstract void run();
}
