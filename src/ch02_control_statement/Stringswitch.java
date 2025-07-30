package ch02_control_statement;//P47

public class Stringswitch {
    public static void main(String[] args) {
        String month ="January";
        int mouthNumber = 0 ;

        switch (month){
            case "January":
                mouthNumber = 1 ;
                break;
            case "February":
                mouthNumber = 2 ;
                break;

            case "March":
                mouthNumber = 3 ;
                break;

            case "April":
                mouthNumber = 4 ;
                break;
            case "May":
                mouthNumber = 5 ;
                break;
            case "June":
                mouthNumber =  6;
                break;
            case "July":
                mouthNumber = 7;
                break;
            case "August":
                mouthNumber = 8 ;
                break;
            case "September":
                mouthNumber = 9 ;
                break;
            case "October":
                mouthNumber = 10 ;
                break;
            case "November":
                mouthNumber = 11 ;
                break;
            case "December":
                mouthNumber = 12;
                break;
            default:
                System.out.println("올바르지 않은 월 형식입니다");



        }
String message = month + "는(은) "  + mouthNumber + "월 입니다.";
        System.out.println(message); //  출력 : January는(은) 1월 입니다.

    }
}
