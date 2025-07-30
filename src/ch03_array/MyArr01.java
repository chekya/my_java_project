package ch03_array;  //P80 원소가 3개짜리 정수형배열 만들기, 배열나오면 무조건 for문장 딸려 나온다.

public class MyArr01 {
    public static void main(String[] args) {
        // 정수 데이터 25개를 취급하기 위한 배열 jumsu 선언 / 타입(정수인가 실수인가 이름인가..), 요소의 갯수, 배열의 이름
        // int[] jumsu = new int[25]; //나타내고자 하는 갯수가 많을 때(2개이상의 데이터를 표현하고자 할 때) /예:25명의 시험점수

        int x = 3 ; //변수명
        int y = 5 ; //변수명

        // 정수 데이터 3개를 취급하기 위한 배열 arr 선언
        int[] arr = new  int[3]; //정수 3개짜리 배열, 배열명 /배열은 대괄호안 숫자가 0부터 시작 / 1번 방식
                                // String[] sub = new String[kor] / ex)과목명(문자열의 경우) ??

        arr[0] = x - y + 6 ; /*4 (arr[0]안의 점수.) 쓰기 /동급레벨(x,y,6이 arrr[0]으로 동등하게 간다-->
                                     배열 요소 1개는 일반 변수와 동등하게 취급할 수 있다.*/
        arr[2] = arr[0] + 3 ; //7 (arr[2]안의 점수.)
        arr[1] = arr[0] + arr[2]; //11 (arr[1]안의 점수.)

        System.out.println("요소들 출력"); //읽기(가져와서[읽어서] 출력해야 하므로)
        for (int i = 0; i < arr.length; i++) { //여기서 3은 배열의 크기 ,3(세개) 대신arr.length라고 적어도 됨.
            // 배열이름 적고 length
            System.out.println("arr[" + i + "] = " + arr[i]);

        }
        System.out.println("배열 초기화 기법");
        int[] arr2 = {50, 20, 30} ; //원소 3개(50,20,30) /2번 방식

        for (int i = 0; i <arr2.length ; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
    }
}
