package ch02_control_statement; //P69 WhileTest2의 문제를 다음 요구 사항대로 다시 수정해 보세요.

import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scan은 스캐너 장치 default 아니므로 import 해줘야함
                                               //사용자로부터 키보드값을 입력받기 위해 Scanner라는 도구 사용.
        int total = 0; //총점, 지금까지 입력된 점수들의 합계
        int count = 0; //입력된 데이터 갯수, 몇번 점수를 입력받았는지 세는 것.

        while (true) {  //while 무한 리프, 무조건 계속 반복하라는 뜻. break ; 만나면 반복 멈춤.
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt(); //스캐너 입력 해줘야 함, 입력한 숫자는 grade라는 변수에 저장됨.

            if (grade < -10) {   //어떤 숫사가 -10보다 작으면이라는 뜻, 숫자가 -10 미만인 경우에 대한 처리.
                System.out.println("프로그램을 종료합니다");
                break; //멈춤(안하면 무한반복)

            } else if (grade < 0) {   // -10 이상의 음수에 대한 처리(-10이상의  음수를 절대값(플러스)로 바꿈.
                grade = -grade; //절대갔을 바꾼다는 의미(음수를 양수로 바꾸는 코드, 음수에 마이너를 붙이면 양수가 되므로)
            }else{ //0 또는 양수라는 의미 /위에 열거한거 말고 나머지 즉, grade가 -10이상이면 이라는 의미

            } //else{   } 안은 아무것도 안 해도 돼 라는 뜻.

            total += grade;  //입력된 점수를 total에 더하고 (점수 누적)
            count++;  //입력 횟수를 1 증가시키라는 의미. (카운트 증가)
        }
        System.out.println("총점 : " + total);
        double average = (double) total / count;  /*정수 나누기 정수를 소숫점까지 평균내고 싶으므로
                                                   '(double)'을 추가입력(명시적 형변환)*/
        System.out.println("평균 : " + average); //total 과 count를 사용해서 평균을 계산.

    }
}
