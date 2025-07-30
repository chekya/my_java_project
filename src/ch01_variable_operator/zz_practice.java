package ch01_variable_operator;

public class zz_practice {
    public static void main(String[] args) {

        int su = 8 ;
        String msg = su % 2 == 0 ?  "짝수" : "홀수" ;
        String message = "숫자" + su + "은 " +msg + "입니다." ;
        System.out.println(message);


        int score = 85 ;
        //90점 이상이면 합격
        msg = score >= 90 ? "합격" : "불합격" ;

        //85점이므로 불합격입니다.
        message = score + "점이므로 " + msg + "입니다." ;
        System.out.println(message);  //85점이므로 불합격입니다.

        int a = 3, b = 5;  //P21
        int result = 0 ;
        result =  a >= b ? a - b : b - a ;  //3항연산자(조건연산자)
        System.out.println( "절대 값 :" + result);/*절대값이란 숫자의 크기만 나타낸 값을 말한다.
        즉 음수 든 양수 든 항상 양수로 바꾼값을 말한다. -7의 절대값은 7/ 7의 절대값도 7
        절대값을 구하려면 무조건 큰수 -작은수 가 되어야한다.
        여기에서는 b가 a보다 더 크므로 b-a 가 되어야 함(항상 큰 수에서 작은 수를 빼기 위한 조건식이 필요함.) */



    }
}
