package ch02_control_statement;

public class Exam4_18 {
    public static void main(String[] args) {
        int su01 = 3 ;/*su1 부터 su7까지의 정수의 총합을 구해보세요.
        1. 변수가 필요함 -->*/
        int su02 = 7 ;
        int total = 0 ;  //1. 변수가 필요함
        for (int i = su01; i <= su02 ; i++){
            total += i;

        }
        System.out.println("합계 : " + total);  //합계 : 25
    }



}
