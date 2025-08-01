package ch04_class;

public class SaramMain05 {
    public static void main(String[] args) {
        // 타입[] 배열명 =  new 타입[요소개수] ;
        int[] arr = new int[3];
        Saram05[] saram = new Saram05[2]; // 배열 정의(이 줄의 Saram05는 타입)

        saram[0] = new Saram05("이순신", 180.0, 75.0, "농구", "AB"); // 0번째 객체 생성(이 줄의 Saram05는 생성자)이줄과 아랫줄은 오버로딩관계이다.

        saram[1] = new Saram05("김유신", 180.2, 70.0, "O");

        for (int i = 0; i < saram.length; i++) {
            saram[i].display();

        }
        Saram05[] mylist = { // Saram05[] mylist = {...}는 Saram05 라는 사람정보를 저장하는 배열이름이 mylist라는 뜻. 즉, 사람 여러 병을 한줄로 쭉 정리한 서랍장을 만든 것.
                new Saram05("박영희", 150.5, 55.0, "수영", "B"), // 세미콜론 아니고 콤마 적어야 한다.
                new Saram05("최진철", 180.2, 66.0, "A") // 이 두사람을 한 배열안에 넣은 것임.[사람1], [사람2] 이런식으로 쉼표(콤마 ,)로 나누어주어야 한다.
        };

        for (int i = 0; i < mylist.length; i++) { //사람을 한 명씩 꺼내서 화면에 보여주는 반복문. int i = 0 ->i 를 0 부터 시작한다는 뜻(배열은 0부터 시작하니까) mylist.length->사람수만큼 반복한다는 의미, 지금은 두명이니까 두번 돈다(i < 2).
            mylist[i].display(); // mylist[i] -> 사람을 한명씩 꺼낸다는 의미(i번째 사람을 꺼냄). display() -> 그 사람의 정보를 보여준다.(이름,키,몸무게 등)
        }
    }
}