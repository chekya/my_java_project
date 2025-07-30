package ch04_class; //P104

public class Saram01 { //클래스(템플릿) /여기(클래스)에는 main 만들지 않는다.(main+엔터 치지않는다.)
    // 단계 1 : 클래스 정의(선언)

    //공유하고자 하는 변수는 static 키워드를 사용합니다.
    static String nationality; // nationality 의 기본값은 null(String이므로)


    //멤버 변수들은 기본 값이 존재합니다.

    String name;  //변수(name)색깔이 보라색이면 멤버변수
    double height;
    double weight;
    String hobby;
    String blood;

    //반환타입 메소드이름(매개 변수 리스트){...}
    String showGenderInfo(int juminno) {  /*showGenderInfo에게 정수를(int)하나 줄테니
                                                데이터 사용해서 결과물을 알려 달라는 의미*/
        String gender = "";  // 변수(gender)색깔이 검은색이면 지역변수

        if (juminno == 1 || juminno == 3) {
            gender = "남자";
        } else {
            gender = "여자";
        }
        String message = name + "님은 " + gender + "이군요.";

        return message;  /*반환타입이 String 이면 return 에도 같은 타입이 와야 한다.
                             (return 0 ;  /int 즉, 숫자가 오면 안된다.)*/

    }

    //반환타입 메소드이름(매개 변수 리스트){...}
    String showBmiInfo() {
        double newHeight = height / 100.0;  //센티미터를 미터로 변환
        double rate = weight / (newHeight * newHeight);  //bmi 공식에 의하여 계산
        String bmi = "";  //결과를 저장할 문자열
        if (rate >= 25.00) {
            bmi = "비만";
        } else if (rate >= 23.00) {
            bmi = "과체중";
        } else if (rate >= 18.50) {
            bmi = "정상";
        } else {
            bmi = "저체중";
        }

        String message = name + "님은 " + bmi + "입니다.";
        return message;

    }
     //반환타입 메소드이름(매개 변수 리스트){...}
    void display(){   //반환하지 않아도 되므로 return 안써도 된다.

        System.out.println(name + "님의 신상 정보");
        System.out.println("국적 : " + nationality); //변수 글자체(nationality)가 살짝 기울어져 있으면 static 변수
        System.out.println("이름 : " + name + "님");
        System.out.println("키 : " + height + "cm");
    }
}
