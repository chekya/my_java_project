package ch04_class;

public class Saram02 {
    //스태틱 변수 = 클래스 변수 = 정적 변수
    static String nationality = "대한민국";

    //멤버 변수들(인스턴스 변수)
    String name ;
    double height ;
    double weight ;
    String hobby ;
    String blood ;

    //double PI = 3.14 ;  //인스턴스(멤버) 변수
    final  double PI = 3.14 ;  // final은(변수가 아니고) 상수(값이 바뀌지 않는 수)
    //PI는 멤버변수, 클래스 안에 있으므로

    public void display() {  //멤버 메소드

        int total = 0;  //지역변수
        for (int i = 0; i < 11; i++) {
            total += i;

        }
        System.out.println("총합 : " + total);



        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("취미 : " + hobby);
        System.out.println("혈액형 : " + blood);
        System.out.println("국적 : " + nationality);
    }
}
