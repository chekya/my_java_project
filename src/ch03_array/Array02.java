package ch03_array;  //P82 배열 초기화 방법을 사용하여 bts 멤버들을 배열 요소에 셋팅하고 결과를 출력하는 프로그램을 작성해 보세요.

public class Array02 {
    public static void main(String[] args) {
        System.out.println("초기화 기법을 이용한 배열 정의"); //갯수와 값이 명확한 경우 초기화기법 사용
        String[] bts = {"진", "뷔", "정국", "RM", "지민", "슈가", "제이홉"} ;

        System.out.println("배열 요소 출력하기");
        for (int i = 0; i < bts.length; i++) {
            System.out.println("bts[" + i + "] = " + bts[i]);

        }

    }
}
