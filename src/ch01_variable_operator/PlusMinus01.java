package ch01_variable_operator;

public class PlusMinus01 {
    public static void main(String[] args) {
        int a = 10, b = 20, c ;

        c = ++a + b++ ;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        c = a++ + --b ;
        //3  4  2  1

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        a = 15 ;
        b = 12 ;
        c = --a + --b ;
        //4  1  3  2
        System.out.println("a : " + a); //14
        System.out.println("a : " + b); //11
        System.out.println("a : " + c); //25

        a = 10 ;
        b = 20 ;

        ++a ;  // a = 10 + 1 = 11
        b-- ;  // b = 20 - 1 = 19
        c = ++a + b-- ;  //31
        // 3  1  2  4
        System.out.println("a : " + a);  //12
        System.out.println("b : " + b);  //18
        System.out.println("c : " + c);  //31







    }
}
