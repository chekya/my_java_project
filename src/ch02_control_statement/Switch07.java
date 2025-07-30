package ch02_control_statement;//P41

public class Switch07 {
    public static void main(String[] args) {

        int su = 3 ;
        System.out.println("초급자가 코딩하는 방식");
        switch (su) {//괄호안의 su 가 표현식이다.
            case 1:
                System.out.println("홀수");
                break;
            case 2:
                System.out.println("짝수");
                break;
            case 3:
                System.out.println("홀수");
                break;
            case 4:
                System.out.println("짝수");
                break;
            case 5:
                System.out.println("홀수");
                break;
            case 6:
                System.out.println("짝수");
                break;

        }

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

        System.out.println("라인 수를 줄이는 방식");//case수가 많아 일일이 다 적기 힘들 때
        switch (su){
            case  1: case  3: case 5: //case 1, 3, 5: 이라고 해도 되지만 버전에 따라서 안될 수 있으므로 추천하지 않는다.
                System.out.println("홀수");
                break;
            case 2: case 4: case 6:
                System.out.println("짝수");
                break;
            default:
                System.out.println("주사위 눈금이 올바르지 않습니다.");
        }
    }
}
