package ch04_class;

public class SaranMain02 {
    public static void main(String[] args) {
        System.out.println(Saram02.nationality);

        Saram02 yusin = new Saram02(); // yusin이 객체
        yusin.name = "김유신";
        yusin.height = 172.5 ;
        yusin.weight = 65.8 ;
        yusin.hobby = "축구" ;
        yusin.blood = "A";

        Saram02 soon = new Saram02();
        soon.name = "유관순";
        soon.height = 165.5 ;
        soon.weight = 52.5;
        soon.hobby = "야구" ;
        soon.blood = "B";

        yusin.nationality = "한국"; //바꾼사람은 yusin

        System.out.println(soon.nationality); // 출력 : 한국

        System.out.println(Saram02.nationality);  // 출력 : 한국

        yusin.display(); //메소드(소괄호 있으므로), 메소드가 실행되게끔 부르는 것을 "호출(call)' 이라 한다.
        soon.display();  //메소드 호출하기
    }
}
