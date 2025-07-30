package ch02_control_statement;

public class AdultCheck {
    public static void main(String[] args) {
        String name = "홍길동" ; //이름
        int age = 12 ; //나이
        int _gender = 3 ; //주민 번호 뒷자리 성별(숫자)
        String gender ; //성별(한글)
        String adult ; //미성년자 여부 문자열



        if(age <= 19){
           adult = "성인";
        }else{   // 19미만이라는 의미
           adult = "미성년자";
        }
        if(_gender == 1 || _gender == 3){   /* || '또는' 이라는 의미로 논리 OR 연산자를 말한다. 이 조건은 -gender 가
        1 이거나, 또는 3일 경우에 true 가 된다. 즉, -gender 의 값이 1 이거나 3 이면, 조건은 참(true)이다.
            */

            gender = "남자";
        }else{    // 1과 3을 뺀 나머지 전부라는 의미
            gender = "여자";
        }
        String message ;
        message = "이름 : " + name + "님, 나이 : " +age+ "세, 성인 체크 : " + adult + ", 성별 : " + gender ;
        System.out.println(message);


    }
}
