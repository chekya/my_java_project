package ch02_control_statement;

public class Multilf02 {
    public static void main(String[] args) {
        int age = 16 ;
        double ticket = 1000.0 ;
        double discount ; //할인율 (할인율 100% 는 무료 즉, 숫자 1)
        String comment ;

        if(age < 8){
            discount = 1.0 ;
            comment = "유아(무료 입장)" ;

        }else if(age < 14 ){
            discount = 0.5 ;
            comment = "어린이(50% 할인)" ;

        }else if(age < 20 ){
            discount = 0.3 ;
            comment = "청소년(30% 할인)" ;

        }else if(age >= 65 ){
            discount = 0.4 ;
            comment = "노인(40% 할인)" ;

        }else{
            discount = 0.0 ;
            comment = "성인(정가)" ;
        }
        String message = age + "살 : " + comment ;
        System.out.println(message);
        message = "가격은 " + ticket * (1 - discount)+ "원입니다." ;
        //"가격은 " +(int) (ticket * (1 - discount))+ "원입니다." 라고 하면 출력할 때 실수 춸력 안됨.(즉 600원으로 출력됨)
        System.out.println(message);

    }
}
