package ch07_collection;

import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();
        set.add("아메리카노");
        set.add(123);
        set.add(false);
        set.add("아메리카노"); //원소 3개, 중복된 데이터는 한개로 봄(set는 중복이 안되므로)

        set.clear(); // 소쿠리 다 비운다는 의미

        set.add("아메리카노");
        set.add("에스프레소");
        set.add("믹스커피");
        set.add("카페라떼"); //원소 4개 출력
        //set.add("마키아또");

        String findData = "카푸치노";
        //양자택일문 사용 가능 (있는지 없는지 양자 택일 묻는 것이므로)
        System.out.println(findData + "존재 여부 : " + set.contains(findData));

        if (set.contains(findData)) {
            System.out.println(findData + " 있음");
        } else {
            System.out.println(findData + " 없음");
        }

        //'마키아또'가 존재하는지 확인하고, 없으면 추가해 보세요
        String addData = "마키아또";     //"addData (예: 마키아또)를 바구니(set)에 넣었는데,만약 이미 있어서 못 넣었다면,안쪽 코드를 실행하자!"
        if (set.add(addData) == false) {
            set.add(addData);
        }


        // remove() 메소드를 사용하여 '믹스커피'를 삭제하고 '삭제 성공'이라는 문구를 출력해 주세요.
        // 없으면 '존재하지 않음'이라는 문구를 출력해 주세요.

        findData = "믹스커피";

        if (set.remove(findData)) {
            System.out.println(findData + " 삭제 성공");

        } else {
            System.out.println(findData + " 는 목록에 존재하지 않는 군요");
        }

        System.out.println("확장 for 구문을 이용한 요소 출력");
        //for(타입 단수이름:복수이름){....}
        for (Object item : set) {
            System.out.println(item);
        }

        System.out.println("요소 크기 : " + set.size());
    }
}
