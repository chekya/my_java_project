package ch02_control_statement; //P67 while 구문을 사용하여 시험 점수들에 대한 평균을 구하는 프로그램을 작성해 보세요.

import java.util.Scanner; //갯수가 명확하게 정해지지 않을 때는 무한 while loop(endless while loop)구문을 사용.

public class WhileTest2 {
    public static void main(String[] args) {
        //스캐너 장치 준비 Scanner 장치는 java.util 안에 들어 있고 수입(import)한다.
        Scanner scan = new Scanner(System.in); //scan은 스캐너 장치

        int total = 0; //총점(총점과 평균은 while 위에 적는다.)
        int count = 0 ; //시행 횟수 (while 밖에 넣어줘야한다.)
        double average = 0.0 ; //평균(while 은 총점을 구한 후 계산하므로 밖에 넣어도 무방하지만 변수 정의는 위쪽에 두는 것이 좋다.}

        while (true) {
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt(); //점수가 생긴다.
            // System.out.println("숫자 : " + grade);
            // total += grade ; -->여기에서 하면 음수값까지 들어오므로 안된다.
            if(grade <= 0){ //음수 또는 0이어서 종료합니다 라는 의미.(양수이면)

                System.out.println("음수 또는 0 이어서 종료합니다"); //음수 또는 0이어서 종료합니다 라는 문장은 break 위에 적는다.
                break; //멈춤(안하면 무한반복)
            }

            total += grade ; //양수가 아닌 경우 게산을 하면 안되므로 여기에 입력. 'if(grade <= 0)'후에 해야함
            count += 1 ; //count++; 라고 해도 됨/양수만 들어와야 하므로 25번라인 위나 아래에 코딩. 'if(grade <= 0)'후에 해야함
        }
        System.out.println("총점 : " + total);
        average = (double)total / count ; //정수 나누기 정수를 소숫점까지 평균내고 싶으므로 '(double)'을 추가입력(명시적 형변환)
        System.out.println("평균 : " + average);

    }
}
