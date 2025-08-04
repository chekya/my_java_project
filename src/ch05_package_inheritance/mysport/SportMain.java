package ch05_package_inheritance.mysport; //P125

public class SportMain {
    public static void main(String[] args) {

        FootBall footBall = new FootBall("축구", 11, 1, 5);

        BaseBall baseBall = new BaseBall("야구", 9, 9, 0.412);

        footBall.printInfo(); //대,소문자 확인
        baseBall.printInfo(); //대,소문자 확인
    }
}
