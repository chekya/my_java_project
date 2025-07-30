package ch02_control_statement; //P41 중급자가 코딩하는 방식

public class Switch07_1 {
    public static void main(String[] args) {
        int su = 3 ;
        System.out.println("중급자가 코딩하는 방식");//case 순서는 숫자순서대로 적지 않아도 된다.단 중복된 숫자는 없어야한다.
        switch (su){
            case  1:
            case  3:
            case  5:
                System.out.println("홀수");
                break;
            case  2:
            case  4:
            case  6:
                System.out.println("짝수");
                break;
            default:
                System.out.println("주사위 눈금이 올바르지 않습니다.");
        }

    }
}
