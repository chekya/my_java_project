package ch04_class;   //P114

public class SaramMain04 {
    public static void main(String[] args) {
        Saram04 soo = new Saram04(); // 김철수 /매개변수 0개
        soo.display();

        Saram04 hee = new Saram04("박영희", 162.5, 52.5, "퀼트", "AB"); // 박영희(오버로딩) /매개변수 5개
        hee.display();
        //김유신에 대하여 생성자를 오버로딩해 보세요.
        //단, 입력하지 않는 취미의 기본 값은 "볼링"이라고 가정합니다.
        Saram04 yusin = new Saram04("김유신", 175.0, 70.5, "O"); //매개변수 4개
        yusin.display();

        Saram04 choi = new Saram04("최유식", 175.0, 70.5, "B"); //매개변수 4개
        choi.display();

    }
}
