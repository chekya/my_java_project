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



    }
}
