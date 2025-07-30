package ch02_control_statement;

public class Multilf01 {
    public static void main(String[] args) {
        int temperature = 24;
        String weather ; // String weather = "; 라고해도 됨.(weather 대신 status로 통일해도 됨)
;
        if(temperature >= 35){
            weather = "폭염 경보" ;

        }else if(temperature >= 30 && temperature <= 34 ){
            weather = "무더운 날씨" ;

        }else if(temperature >= 20 && temperature <= 29){
            weather = "쾌적한 날씨" ;

        }else if(temperature >= 10 && temperature <= 19){
            weather = "쌀쌀한 날씨" ;


        }else{
            weather = "추운 날씨" ;
        }

        String message = temperature + "도는 " + weather + "입니다." ;
        System.out.println(message);
    }
}
