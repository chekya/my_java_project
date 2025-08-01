package ch04_class;

public class BookMain04 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Book04[] book = new Book04[2];

        book[0] = new Book04("이야기의 끝", "미나토 가나에", "소미미디어", 2022, 18000.0);

        book[1] = new Book04("너의 유토피아", "정보라", "래빗홀", 2025, 22000);

        for (int i = 0; i < book.length; i++) {
            book[i].display();
        }
        Book04[] mybook = {
                new Book04("미드나잇 라이브러리", "매트 헤이그", "인플루앤셜", 2002, 21000),
                new Book04("내 것이 아닌 잘못", "아사쿠라 아키나리", "블루홀식스", 2023, 19500.)

        };
        for (int i = 0; i < mybook.length; i++) {
            mybook[i].display();
        }
       Book04[] mybook01 = {
                new Book04("해석에 반대한다", "수전 손택", "이후", 2003, 15000.0),
                new Book04("어떻게 지내요", "시그리드 누네즈", "엘리", 2021, 23500.0),
                new Book04("더 푸드 랩", "J 켄지 로페즈-알트","영진닷컴", 2017, 28000.0)
        };
        for (int i = 0; i < mybook01.length; i++) {
            mybook01[i].display();

        }

    }
}

