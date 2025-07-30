package ch02_control_statement; //P54

public class For02 {
    public static void main(String[] args) {
        int odd = 0, even = 0 ;
        for (int i = 1; i < 11; i++) { //바깥(위)이 for구문
            if (i % 2 == 0) {  //안(아래)이 if구문
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println("홀수의 총합 :" + odd);
        System.out.println("짝수의 총합 :" + even);
    }
}
