package ch02_control_statement;//P44

public class DaysInMonth {
    public static void main(String[] args) {
        int mouth = 10;
        int last_day = 0;
        switch (mouth){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                last_day = 31;
                break;
            case 4: case 6: case 9: case 11:
                last_day = 30;
                break;
            case 2:
                last_day = 28;
                break;
            default:
                System.out.println("잘못된 월입니다.");
               // system.exit(status:0); //프로그램 강제종료

        }
        System.out.println(mouth + "월의 마지막 날은" + last_day+ "입니다.");
    }
}
