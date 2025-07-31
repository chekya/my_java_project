package ch04_class; //P113

public class ShapeArea { //오버로딩 메서드들을 담은 계산 클래스
    public double area(int a, int c, int b){
        //사다리꼴의 면적 구하기
        double trapResult = 0 ;
        trapResult = (a + c) * b / 2.0 ;
        return trapResult ;


    }
public int area(int a, int b){
        //사각형의 면적 구하기
    int arearectResult  = 0 ;
    arearectResult = (a * b) ;
    return arearectResult ;


}
public double  area (int b){
        //원의 면적 구하기
    final  double PI = 3.14 ; //일기 전용이어야 하므로 fanal 키워드를 사용했음.

    //System.out.println("원의 면적 : " + circleResult);

    double circleResult = 0 ;
    circleResult = PI * (b * b) ;
    return circleResult ;


}
}
