package ch01_variable_operator;

public class Trapezoid {
    public static void main(String[] args) {

        double bouttom;
        double top;
        double height;
        double area ;

        bouttom = 20.0;
        top = 10.0;
        height = 15.0;
        area = (bouttom + top) * height / 2.0;

        System.out.println("밑변 : " + bouttom);
        System.out.println("윗변 : " + top);
        System.out.println("높이 : " + height);
        System.out.println("면적 : " + area);
    }
}
