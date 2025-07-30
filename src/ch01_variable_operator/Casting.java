package ch01_variable_operator;

public class Casting {
    public static void main(String[] args) {
        double d = 100 ; //암시적 형변환(자바시스템이 자동으로 형을 변경해줌)
        System.out.println("d : " + d); // 결과 d : 100.0

        int i = (int)12.5 ; //명시적 형변환(개발자가 직접 캐스팅 하는 것)
        System.out.println("i : " + i); // 결과 i : 12

        System.out.println(14/5); // 결과 2
        //              명시적       암시적
        // (double)14/5 ----> 14.0/5 ----> 14.0/5.0 ----> 2.8
        System.out.println((double)14/5);  //(double)14는 14를 double로 변환해서 14.0이 된다. //
        //이 경우 14.0/5--->하나라도 double 이기 때문에에 실수 나눗셈 수행(14.0/5.0). 결과 2.8

        //             산술연산             명시적
        //(double)(14/5)------->(double)(2)-------->2.0
        System.out.println((double)(14/5)); //괄호 안의 14/5는 먼저 정수 나눗셈이 수행되어 2 가 됨.
        // 그 후에 2를 double로 바꾸므로 2.0이 됨.
        //명시적 형변환(대놓고 바꾸라고 했으므로 명시적) 결과 2.0

        int kor = 50, eng = 60, math = 80 ;
        int total = kor + eng + math ;
        double average = (double)total / 3.0 ; //total과 3이 둘 다 정수이므로 63 인데
        // average가 double 이므로 암시적으로 실수가 됨으로 63.0

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average); //평균 : 63.333333333333336

        char ch1 = 'c' ;
        char ch2 = 'a' ;

        boolean bool1 = ch1 > ch2 ; //암시적 형변환이 되므로 99 >97 즉, true
        System.out.println("bool1 : " + bool1);  // bool1 : true

        int result ;
        result = ch1 - ch2 + 5;
        System.out.println("result : " + result); //result :7

        char ch3 = 'D' ;
        //조건식 대문자이면? 참 : 거짓 ;
        String str = ch3>= 'A' && ch3<='Z' ? "yes" : "no" ;
        //대문자 A보다 크거나 같고 대문자 Z보다 작거나 같으면.
        System.out.println("대문자 판단 : " + str);  //대문자 판단 : yes




    }
}
