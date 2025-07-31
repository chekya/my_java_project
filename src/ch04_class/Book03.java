package ch04_class;  //책 정보를 저장하는 클래스

public class Book03 {
    //1단계 : 속성선언(모두 private -> 외붑에서 직접 접근 금지)
    private String title;
    private String writer;
    private String publisher;
    private int publishYear;
    private double price;
    private boolean stock;

    //2단게 : 생성자(Book 객체를 만들 때 한 번에 값 설정)
    //this.title = title;
    // this.writer = writer;

// 4단계 : setter 매서도 (private 값들을 바꿀 수 있게 해줌.)
public void setTitle(String title) {
    this.title = title;
}
// 3단계 : getter 매서드 (private 값들을 읽을 수 있게 해줌.)
public String getTitle() {
    return title;
}

public String getWriter() {
    return writer;
}

public void setWriter(String writer) {
    this.writer = writer;
}

public String getPublisher() {
    return publisher;
}

public void setPublisher(String publisher) {
    this.publisher = publisher;
}

public int getPublishYear() {
    return publishYear;
}

public void setPublishYear(int publishYear) {
    this.publishYear = publishYear;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

public boolean getStock() {
    return stock;
}

public void setStock(boolean stock) {
    this.stock = stock;
}





}
