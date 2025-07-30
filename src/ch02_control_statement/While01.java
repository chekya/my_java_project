package ch02_control_statement;  //64 다음 문제에 대하여 초기식, 조건식, 증감식을 만들고 풀어 보세요.

public class While01 {
    public static void main(String[] args) {
        int i = 1; //초기식     /while 구문을 사용하여 1부터 10까지의 합을 구하시오.
        int total = 0;  //total 55
        while (i < 11) {       //조건식
            total += i;
            i++;  /*증감식은 while 안쪽에 적는다.tatal은 while 아래에 적는다. total 값이 수시로 바뀌는 것을 볼 때는 while 안에
            밖에서 한번데 보고 싶을 때는 while 밖에 적는다.*/

        }
        System.out.println("촣합01 : " + total);

        i = 1;  //변수 2번 정의 안되므로     /1+4+7+…+100 = 1717
        total = 0;   //변수 2번 정의 안되므로
        while (i < 101) {
            total += i;
            i += 3; //i값에 3을 누적시킨다.
        }
        System.out.println("총합02 : " + total);


        i = 97;   //문제 97+92+87+…+7+2 = 990  /반복 시작값 (97부터 시작) /시작값 : 97
        total = 0; // 이것은 초기화 했다는 의미이므로 위와 같이 적어도 무방,총합을 저장할 변수(초기값 0)/(합계를 저장할 변수초기값)
        while (i > 1) { // i 가 1보다 클 때까지 반복(7+2까지만 구하면 되므로)
            total += i; //total = total + i ; 현재 i값을 total에 더함
            i -= 5; // i값을 5만클 감소시킴
        }
        System.out.println("총합03 : " + total);


        total = 0;    // 1*1 + 6*6 + 11*11 + … + 96*96 = 63670
        i = 1;
        while (i < 97) { // 96*96까지만 구하면 되므로.
            total += 1 * 1;
            i += 5;
        }
        System.out.println("총합04 : " + total);

        total = 0;    // 1*2 + 2*3 + 3*4 + 4*5 + 5*6 = 70
        i = 1;
        while (i < 6) {
            total += i *(1 + 1);
            i ++ ;
        }
        System.out.println("총합05 : " + total);


    }
}
