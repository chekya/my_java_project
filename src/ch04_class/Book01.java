package ch04_class;

public class Book01 {

    String title;
    String writer;
    String publisher;
    int publishYear;
    double price;
    boolean stock;

    String showStockInfo() {    //메소드 정의(메소드는 소괄호()가 있다.)


        String msg;
        if (stock) {
            msg = "있음";
        } else {
            msg = "없음";
        }

        String message = "재고현황 : " + msg;
        return message;  //위의 재고현황이 있는지 없는지를 만들어서 돌려줘(출력해줘)
    }

     String displayBookInfo() {
        return null;  /* null은 아무것도 참조하지 않는다. 즉, 값이 없는 상태(empty)
         책 정보를 보여주기 위한 자리로 아직 코드를 안 써서 아무것도 안 돌려줬기(return)때문에
         return에 null 이라고 써 놓은 것임. */

    }


}
