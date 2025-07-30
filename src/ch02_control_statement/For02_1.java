package ch02_control_statement;//P54 For 구문을 switch 구문으로 바꿔서 출력 P54

public class For02_1 {
    public static void main(String[] args) {
        int odd = 0, even = 0;

        for (int i = 1; i < 11 ; i++) {
            switch (i % 2) { //(i%2 == 0)는 안된다. ==이 관계연산자이므로 안됨. (i%2)의 결과물은 0또는 1이다.
                case 0:
                    even += i;
                    break;
                case 1:
                    odd += i;
                    break;


            }
        }
        System.out.println("홀수의 총합 :" + odd);
        System.out.println("짝수의 총합 :" + even);
    }
}
