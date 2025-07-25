package ch02_control_statement;

public class If04 {
    public static void main(String[] args) {
        int score = 75 ;  //학점유형 5가지이므로 다중택일구문 사용 P37
        if(score >= 90){
            System.out.println("A 학점");

        }else if(score >= 80 && score < 90){  //(score >= 80) 이라고만 적어도 됨. (위에서 (score >= 90)라고
            //지정을 했으므로 (score >= 90)면 A학점이라고 필터링을 했으므로)


            System.out.println("B 학점");

        }else if(score >= 70 && score < 80){
            System.out.println("C 학점");

        }else if(score >= 60 && score < 70){
            System.out.println("D 학점");



        }else{
            System.out.println("F 학점");

        }
    }
}
