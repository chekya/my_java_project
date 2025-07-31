package ch04_class; //P112 메소드 구조, 출력순서에는 형향을 미치지 않는다.

public class OverAdd {
    // 반환타입 이름(매개변수){...}
    int Add(int x, int y, int z) { //int는 반환타입이므로 return해야한다.
        int result = 0;
        result = x + y + +z;
        return result; // 위의 int는 반환타입이므로 return 해야한다.

    }

    public void Add(int a, int b) {
        System.out.println("정수 덧셈 : " + (a + b));
    }

    public void Add(double x, double y) {
        System.out.println("실수 덧셈 : " + (x + y));
    }
        public void Add(int x, double y) {
            System.out.println("혼합형 : " + (x + y));
    }
}
