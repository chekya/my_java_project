package ch07_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MyList {
    public static void main(String[] args) {
        List<String>coffeeList = new ArrayList<String>(); //<String> 는 String 이외에는 안받겠다는 의미.
                                                          // (잘못된 데이터의 유입을 사전에 막기 위해 (제네릭))
        coffeeList.add("아메리카노");
        coffeeList.add("카페라떼");
        coffeeList.add("에스프레소");
        coffeeList.add("마키아또");
        coffeeList.add("카페라떼");

        int idx = -1 ;  //기본값(지역변수이다보니 습관적으로 넣음, 0 은 넣으면 안됨 0번째 원소는 존재하므로)
        String findData = "카페라떼";
        idx = coffeeList.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        idx = coffeeList.lastIndexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);  //인덱스값(번호)가 같으면 중복된 품목이 없다는 의미(카페라떼는 1개)
                                                                  //-1이 나오면 해당품목이 없다는 의미
        findData = "카푸치노";
        idx = coffeeList.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        //'카푸치노' 항목이 존재하지 않으면, 2번째 위치에 추가해 보세요.
        findData = "카푸치노";

        if (coffeeList.indexOf(findData) == -1){ //카푸치노가 존재하지 않으면 아래를 실행하라
            coffeeList.add(2, findData);
        }
        System.out.println("확장 for 구문을 이용한 출력");
        for(String coffee:coffeeList){
            System.out.print(coffee + "\t");  //\t는 탭(tab) 이라고 불리는 공백 문자

        }
        System.out.println();  //화면에 아무 글자도 없이 줄만 바꾸는 코드

        findData = "콜드 브루";
        coffeeList.set(5, findData);

        findData = "카푸치노";
        coffeeList.remove(findData);

        coffeeList.add(findData);
        for (String xx : coffeeList){
            System.out.println(xx);
        }

        String item = coffeeList.get(3);
        System.out.println("특정 위치 요소 : " + item);

        System.out.println("일반 for 구문으로 요소 출력하기");
        for (int i = 0; i < coffeeList.size(); i++) {
            String data = coffeeList.get(i);
            System.out.println(data);
        }




        System.out.println("요소 크기 : " + coffeeList.size());
    }
}
