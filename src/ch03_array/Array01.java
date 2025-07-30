package ch03_array;  //P81 new 연산자를 이용한 배열 bts를 정의한 다음 멤버들의 이름을 저장하고 출력해 보세요

public class Array01 {
    public static void main(String[] args) {   //타입, 갯수, 이름
        String[] bts = new String[7]; //배열정의 /문자열 bts, 멤버 7명

        bts[0] = "진";  //반드시 0 부터 시작
        bts[1] = "뷔";
        bts[2] = "정국";
        bts[3] = "RM";
        bts[4] = "지민";
        bts[5] = "수가";
        bts[6] = "제이홉";
        System.out.println("배열 요소 출력하기");
        /*for (int i = 0; i < bts.length; i++){
            System.out.println("bts[" + i +"] = " + bts[i]);   이렇게 하면 교재처럼 세로로 출력 */
        for (int i = 0; i < bts.length; i++) {
            System.out.println((i+1) + "번째 멤버 : " + bts[i]); //0이 1로 바뀌어서 '1번째 멤버 :'형식으로 출력

        }



       for (int i = 0; i < bts.length ; i++) {
            if(i != bts.length - 1){ //i가 6이랑 같지 않으면 이라는 의미 또는 (i < 6) /  (i != 6))
                System.out.print(bts[i] +", ");  //옆으로 이름 뒤에 콤마 찍으며 출력하고 마지막 멤버 뒤에는 콤마 찍지 않을 때
            }else{
                System.out.print(bts[i]);
            }

        }
        System.out.println();

    }
}
