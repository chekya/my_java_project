package ch02_control_statement;

public class LargeTest {
    public static void main(String[] args) {
        int su1 = 100, su2 = 50 ; //앞쪽이 뒷쪽보다 크거나 작다. 경우의 수 2가지양자택일구문

        if(su1 >= su2){
            System.out.println("앞의 숫자가 크거나 같습니다.");
            System.out.println("큰 수 : " + su1 );
        }else{
            System.out.println("앞의 숫자가 작습니다.");
            System.out.println("큰 수 : " + su2 );
        }

    }
}
