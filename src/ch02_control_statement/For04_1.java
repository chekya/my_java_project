package ch02_control_statement; //P55

public class For04_1 {
    public static void main(String[] args) {
        int sum0 = 0, sum1 = 0, sum2 = 0; //선언, 초기화

        for (int i = 1; i < 11; i++) {
            if(i%3 == 0){
                sum0 += i;

            }else if(i%3 == 1) {
                sum1 += i;
            }else{
                sum2 += i;

            }
        }
        System.out.println("sum0 : " + sum0);
        System.out.println("sum1 : " + sum1);
        System.out.println("sum2 : " + sum2);
    }
}
