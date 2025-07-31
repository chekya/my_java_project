package ch04_class;

public class SaramMain03 {
    public static void main(String[] args) {
        Saram03 yusin = new Saram03();//참조,객체,인스턴스변수

        Saram03 soon = new Saram03();

        yusin.setName("김유신");
        yusin.setHeight(172.5);
        yusin.setWeight(68.2);
        yusin.setHobby("야구");
        yusin.setBlood("A");


        soon.setName("유관순");
        soon.setHeight(168.2);
        soon.setWeight(52.3);
        soon.setHobby("농구");
        soon.setBlood("B");

        System.out.println("이름 : " +yusin.getName());//Name()까지 블럭잡고 원하는 앒파벳 입력
        System.out.println("몸무게: " +yusin.getHeight());
        System.out.println("키: " +yusin.getWeight());
        System.out.println("취미: " +yusin.getHobby());
        System.out.println("혈액형: " +yusin.getBlood());

        System.out.println("이름 : " +soon.getName());
        System.out.println("몸무게: " +soon.getHeight());
        System.out.println("키: " +soon.getWeight());
        System.out.println("취미: " +soon.getHobby());
        System.out.println("혈액형: " +soon.getBlood());

       /* System.out.println("이름 : " +soon.getName());
        System.out.println("키: " +soon.getHeight()); */


    }
}
