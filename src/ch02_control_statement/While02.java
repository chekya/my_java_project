package ch02_control_statement; //P66 while/if 구문을 사용하여 1부터 10까지의 정수 중에서 홀수의 합과 짝수의 합을 각각 구하시오

public class While02 {
    public static void main(String[] args) {
        int i = 1 ;  //숫자 1부터 시작, 변수 i는 1부터 10까지 차례대로 올라갈 숫자이다.
        int odd = 0 , even = 0 ; //odd는 홀수의 합, even은 짝수의 합을 저장할 공간. 처음에는 0으로 시작.

        while(i < 11){ //i가 11보다 작을 동안만 반복한다는 의미.
            if(i%2 == 0) { //i를 2로 나눈 나머지가 0이면, 즉 짝수이면 이라는 의미(2%2=0 -->짝수, 3%2=1 -->홀수)
                even += i ; //짝수일 때는 그 숫자를 wvwn에 더하라는 뜻.
            }else{
                odd += i ; //짝수가 아니면(=홀수면) odd에 더라하른 의미.
            }
            i++ ; //숫자를 1씩 증가시켜서 다음 숫자로 넘어가라는 의미.
        }
        System.out.println("홀수의 총합 : " + odd);  //String message는 경과를 볼거면 while 안에 넣는다.
        System.out.println("짝수의 총합 : " + even); //이 경우 마지막 결과 즉, 총합만 보면 되므로 while 밖에 넣었음.
    }
}
