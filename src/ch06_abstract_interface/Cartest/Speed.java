package ch06_abstract_interface.Cartest;
//Speed 안에는 일반 메소드 만들 수 없다.
public interface Speed {
    public static final int ALLOWED_MAX_SPEED = 50;
    public abstract void speedUp(int speed); //가속기
    public abstract void speedDown(int speed); //감속기
}
