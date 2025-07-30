package ch02_control_statement;//P49

public class SayHello {
    public static void main(String[] args) {
        String message = "안녕하세요.";
        int su = 5 ; //안녕하세요 를 5번 반복할 것이므로
        for(int i = 1 ; i <= su ; i++){
            System.out.println(message);

        }

    }
}
