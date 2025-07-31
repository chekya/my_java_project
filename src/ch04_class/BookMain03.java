package ch04_class;  //실행하는 메인 클래스(객체생성 + 출력) 실행파일

public class BookMain03 {
    public static void main(String[] args) {
        // 1단계 : Book 객체 생성
        Book03 book = new Book03();


        book.setTitle ("이야기의 끝");
        book.setWriter ("미나토 가나에");
        book.setPublisher ("소미미디어");
        book.setPublishYear (2022);
        book.setPrice(18000.0);
        book.setStock (false);

        System.out.println("제목 : " + book.getTitle());
        System.out.println("저자 : " + book.getWriter());
        System.out.println("발행처 : " + book.getPublisher());
        System.out.println("발행연도 : " + book.getPublishYear());
        System.out.println("가격 : " + book.getPrice() + "원");
        System.out.println("재고현황 : " + book.getStock());




    }
}
