package ch02_control_statement;

public class If01 {
    public static void main(String[] args) {
        int su = 10 ; //짝수 아니면 홀수 이므로 경우의 수 2개----->양자택일구문---->if구문
        //어떤 구문쓸지 빨리 캐치해야한다.
        if(su%2 == 0){    //su(10)를(을) 2로 나눈 나머지가 0이면 짝수라는 의미.
            System.out.println("짝수 " + su + "야~~놀자"); //경우의 수 1개이므로 단순 if구문.
        }
        if(su%2 == 0){
            System.out.println("숫자 " + su + "은(는) 짝수입니다."); //숫자 10은(는) 짝수 입니다.
            System.out.println("하하하");

        }else{
            System.out.println("숫자 " + su + "은(는) 홀수입니다."); //숫자 10은(는) 짝수입니다.
            System.out.println("호호호"); //양자택일if구문

        }

        System.out.println("크크크"); /*경우의 수에 상관업이 (양자택일 아니고 하나일 때,
                                         크크크만 출력)출력하고 싶을 때는 중괄호 밖에 쓴다.
                                        */


    }
}
