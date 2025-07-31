package ch04_class; //P113

public class ShapeAreaMain {   //메인 클래스(실행용)
    public static void main(String[] args) {
        // ShapeArea 객체 생성

        ShapeArea obj = new ShapeArea() ;
        int a = 5, b = 10, c = 15 ;


        //메소드 오버로딩
        double circleResult = obj.area( b ) ; // 원
        System.out.println("원의 면적 : " + circleResult);

        int rectResult = obj.area( a, b ) ; // 사각형
        System.out.println("사각형의 면적 : " + rectResult);

        double trapResult = obj.area( a, c, b ) ; // 사다리꼴
        System.out.println("사다리꼴의 면적 : " + trapResult);

    }
}
