package ch04_class;

public class Book04 {

    String title;
    String write;
    String publisher;
    int publishYear;
    double price;

    public Book04(){

    }
    public Book04(String title, String write, String publisher, int publishYear, double price){
        this.title = title;
        this.write = write;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.price = price;

    }



  /* public Book04(String title, String write, String publisher, int publishYear, double price) {
        this.title = title;
        this.write = write;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.price = price;


    }*/ //위에 이미 코딩했으므로 다시 할 필요 없다.

    public void display(){
        System.out.println("제목 : " + this.title);
        System.out.println("작가 : " + this.write);
        System.out.println("출판사 : " + this.publisher);
        System.out.println("발행연도 : " + this.publishYear);
        System.out.println("가격 : " + this.price + "원");
    }

}
