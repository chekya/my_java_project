package ch04_class;

public class BookMain01 {
    public static void main(String[] args) {
        Book01 book;
        book = new Book01();

        book.title = "이야기의 끝";
        book.writer = "미나토 가나에";
        book.publisher = "소미미디어";
        book.publishYear = 2022;
        book.price = 18000.0;
        book.stock = false;

        System.out.println("제목 : " + book.title);
        System.out.println("저자 : " + book.writer);
        System.out.println("발행처 : " + book.publisher);
        System.out.println("발행연도 : " + book.publishYear);
        System.out.println("가격 : " + book.price + "원");


        String message = book.showStockInfo();
        System.out.println(message);

    }
}
