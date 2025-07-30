package ch02_control_statement;//P50

public class ForTest01 {
    public static void main(String[] args) {
        int dan = 3; //단수(3단)을 직접 지정

        for (int i = 1; i < 10; i++) { /*1부터 9까지 반복
                                         int i = 1-->i는 (3단의)1부터 시작해요. 처음에 i는 1 이에요.
                                         i < 10(1<=9) -->i가10보다 작을 동안만 반복해요.(9단까지 반복)
                                         i++ -->매번 반복 할 때마다 i를 1씩 증가 시켜요.(1(3*1)->2(3*2)->3(3*3)....9)*/
             String message = dan + "*" + i + "=" +(dan*i); //(dan*1)---> 입력받은 단수(dan)에 곱해지는 숫자



            System.out.println(message); /* 출력 : 3*1=3
                                                  3*2=6
                                                  3*3=9
                                                  3*4=12
                                                  3*5=15
                                                  3*6=18
                                                  3*7=21
                                                  3*8=24
                                                  3*9=27  */

        }

    }
}
