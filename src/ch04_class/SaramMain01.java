package ch04_class; //P104 클래스를 사용하여 다음 프로그램을 구현해 보세요.

public class SaramMain01 {
    public static void main(String[] args) { //메인메소드
       // int x ; /x는 지역변수(지역변수는 초기값이 없으므로 반드시 초기값을 넣어줘야(할당해줘야) 한다.)
       // System.out.println(x);
        // 단계 2 : 객체 생성
        //클래스이름 객체이름 = new 생성자이름() ;
        Saram01 yusin = new Saram01(); //int x = 10;  / 변수 정의

        Saram01 soon ;                 //int x;
        soon = new Saram01() ;         //x = 10; 위의 형식보다는 이런 형식으로 많이 씀

        // 단계 3 : 객체의 멤버 변수에 쓰기 작업
        //점(.)을 멤버 참조 연산자라고 부릅니다.
        yusin.nationality = "대한민국" ;
        yusin.name = "김유신" ;
        yusin.height = 172.5 ;
        yusin.weight = 75.0 ;
        yusin.hobby = "당구" ;
        yusin.blood = "AB" ;

        // 단계 4 : 객체의 멤버 변수의 값을 출력
        System.out.println("국적 : " + yusin.nationality);
        System.out.println("이름 : " + yusin.name);
        System.out.println("키 : " + yusin.height);
        System.out.println("몸무게 : " + yusin.weight);
        System.out.println("취미 : " + yusin.hobby);
        System.out.println("혈액형 : " + yusin.blood);

        soon.nationality = "대한민국" ;
        soon.name = "유관순" ;
        soon.height = 168.5 ;
        soon.weight = 50.0 ;
        soon.hobby = "축구" ;
        soon.blood = "O" ;

        // 단계 4 : 객체의 멤버 변수의 값을 출력
        System.out.println("국적 : " + soon.nationality);
        System.out.println("이름 : " + soon.name);
        System.out.println("키 : " + soon.height);
        System.out.println("몸무게 : " + soon.weight);
        System.out.println("취미 : " + soon.hobby);
        System.out.println("혈액형 : " + soon.blood);

        String message = yusin.showGenderInfo(1); //(juminno: 2)입력하면 김유신님은 여자이군요.라고 출력됨
        System.out.println(message);   //출력 : 김유신님은 남자이군요.
                                       //(juminno: 2)입력하면 김유신님은 여자이군요.라고 출력됨

        message = soon.showGenderInfo(2);
        System.out.println(message);   // 출력 : 유관순님은 여자이군요.

        message = yusin.showBmiInfo();
        System.out.println(message);  // 출력 : 김유신님은 비만입니다.

        message = soon.showBmiInfo();
        System.out.println(message);  // 출력 : 유관순님은 저체중입니다.

        yusin.display();
        soon.display();

    }
}
