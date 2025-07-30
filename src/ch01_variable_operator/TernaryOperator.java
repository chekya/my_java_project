package ch01_variable_operator;//P21

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 5 ;
        int result = a >= b ? a - b : b - a ;  //3항연산자(조건연산자)

        System.out.println("절대 값 : " + result); //절대 값 : 2

        int x = 10 ;
        result = x % 2 == 0 ? x + 3 : x * x ; //result = 짝수이면 ? 3더하기 : 제곱 ;
        System.out.println("결과 : " +result); //결과 : 13

        x = 8 ;
        int y = 4 ;
        result = x >= y ? x : y ;//result = x 가 y보다 크거나 같으면 ? 요기(truepart) : 저기(falsepart) ;
        System.out.println("큰 수 : " + result); //큰 수 : 8


        result = x <= y ? x : y ;//  또는 result = x <= y ? y : x
        System.out.println("작은 수 : " + result); //작은 수 : 4

        x = 5 ;
        y = 12 ;

        String str = y % x == 0 ? "yes" : "no" ;
        System.out.println("결과 : " + str);   //결과 : no

        int su = 7 ;
        //숫자 7은(는) 홀수입니다.
        String msg = su % 2 == 0 ? "짝수" : "홀수" ;

        String message = "숫자 " + su + "은(는)" + msg + " 입니다." ;
        System.out.println(message) ; //숫자 7은(는) 홀수입니다.


        int score = 85 ;
        //60점 이상이면 합격
        msg = score >= 60 ? "합격" : "불합격" ;

        //85점이므로 합격입니다.
        message = score + "점이므로 " + msg + "입니다." ;
        System.out.println(message);  //85점이므로 합격입니다.










    }
}
