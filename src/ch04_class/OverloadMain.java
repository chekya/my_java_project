package ch04_class;// P112 메인클래스

public class OverloadMain {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 7;
        double x = 1.1, y = 2.2;
        //생성자이름
        OverAdd obj = new OverAdd();

        obj.Add(a, b);
        obj.Add(x, y);

        int result = obj.Add(a, b, c); //반환타입(덧셈해서 반환해줘) a,b,c는 위 main의 지역변수이다.
        // 상단은 obj에 Add라는 메소드를 만들어줘, 정수 3개 줄게 라는 의미 Add는 메소드 이름

        System.out.println("반환 결과 : " + result);

        a = 100 ;
        b = 200 ;
        obj.Add(a, b);

        x = 5.5 ;
        y = 3.3 ;
        obj.Add(x, y);

        obj.Add(a, x);// 암시적 형변환
    }
}
