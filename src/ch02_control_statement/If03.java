package ch02_control_statement;

public class If03 {
    public static void main(String[] args) {
        int su = 3 ;
        if(su%3 == 0){     //조건문의 3의 배수인가 아니가 입력
            System.out.println(su + "는(은) 3의 배수 입니다.");
            System.out.println(su * su);  // 제곱

        }else {
            System.out.println(su + "는(은) 3의 배수가 아닙니다.");
            System.out.println(su + 5);  // +5

        }
    }
}
