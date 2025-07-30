package ch02_control_statement; /*P65  구구단 단수를 정수 값으로 입력 받아서 해당 단수에 해당하는 구구단을
                                       출력하는 프로그램을 작성해 보세요. */

public class WhileTest1 {
    public static void main(String[] args) {
        int i = 1;  //변수정의는 while 위
        int dan = 3; // 3단을 출력하겠다는 의미
         // i++; 를 여기(while 밖)에 넣으면 이미 +1을 시작하여 2가 되므로 2단부터 출력됨
        while (i < 10) {
            // i++; 를 여기(String message 위)에 넣으면 이미 +1을 시작하여 2가 되므로 2단부터 출력됨
            String message = dan + " *" + i + " = " + (dan * i); //구구단 출력시 값이 수시로 바뀌므로 while 안에 입력
            System.out.println(message);                         //총합을 구할 때는 while 밖에 String message 입력
             //String message 위에 입력하면 1단 출력안됨 즉, while 위(밖)에 넣으면 이미 +1이되어 2단부터 출력됨
        }
    }
}
