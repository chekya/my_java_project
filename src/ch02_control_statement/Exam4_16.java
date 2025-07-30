package ch02_control_statement; //P53

public class Exam4_16 {
    public static void main(String[] args) {
        int star = 24;  //출력할 별 갯수
        for (int i = 1; i <= star; i++) {
            System.out.print("*");

          /*  if (i % 5 == 0) {
                System.out.println();
            }
        }
        for (int i = 1; i < 24; i++) {
            System.out.println("*");
            if(i % 5 == 0){ */
            if(i%5 == 0) {
                System.out.println("*");
            }

        }
    }
}
