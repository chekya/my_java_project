package ch02_control_statement;//P48

public class For01 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println("총합 01 : " + total);//총합 01 : 55 (실습 P48의 풀어보기 이해할 것)


        total = 0;//total변수가 현재 55이므로 0으로 초기화

        for (int i = 1; i < 101; i += 3) {
            total += i;
        }

        System.out.println("총합 02 : " + total);//총합 02 : 1717

        total = 0;
        for (int i = 97; i > 1 ; i -= 5) {
            total += i ;
        }
        System.out.println("총합 03 : " + total);//총합 03 : 990

        total = 0;
        for ( int i = 1 ; i < 97 ; i += 5 ){//1부터 시작 5씩 커진다
            total += i*i ;
        }
        System.out.println("총합 04 : " + total);//총합 04 : 63670

        total = 0;
        for ( int i = 1; i < 6 ; i++ ){/*마지막 숫자 즉 5*6의 앞의 5보다 작아야함으로 6을 적는다.(즉, 반복되는 i값이
        1,2,3,4,5 이므로 6보다 작다고 코딩해야함*/
            total += i * (i+1) ;
        }
        System.out.println("총합 05 : " + total);//총합 04 : 70
    }
}
