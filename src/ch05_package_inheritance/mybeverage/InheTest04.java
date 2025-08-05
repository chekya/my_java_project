package ch05_package_inheritance.mybeverage; //P131

public class InheTest04 {
    public static void main(String[] args) {
        //클래스이름 객체이름 = new 생성자이름(); 객체생성공식

        // 승급(upcasting) : 서브 클래스(하위)가 일시적으로 슈퍼 클래스(상위)의 타입으로 변환이 되는 과정(전제조건 : 상속관계여야한다.)--> 클래스이름 Americano04 를 Beverage04 로 바꿀 수 있다.
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250.0);

        //슈퍼 클래스 내에 있는 메소드는 상속 개념에 의하여 접근이 가능합니다. (beverage01.(토트찍으면) showInfo가 보이는 이유)
        beverage01.showInfo();
        System.out.println(beverage01.toString());

        //승급시 서브 클래스내의 변수와 메소드는 일시적으로 접근을 하지 못한도록 설계되어 있습니다.
        //단, 강등을 하게 되면 서브 클래스 내의 변수와 메소드를 접근할 수 있습니다.
        //int i = (int)3.14; //명시적형변환
        Americano04 ame = (Americano04)beverage01 ; //강등 (전제조건 : 상속관계여야한다.)1
        ame.sipAmericano();  //이제 ame.(도트 찍으면)sipAmericano 가 보인다.2

        Beverage04 beverage02 = new Espresso04("에스프레소" ,5000.0, 2);
        //아직 상속이 안되면 Espresso04에 빨간줄 뜬다.->Espresso04에 가서 상속(extends Beverage04적는다)먼저해야한다.->그렇게 하면 Espresso04에 빨간줄 사라진다.
        beverage02.showInfo();

        Espresso04 espresso = (Espresso04)beverage02;
        espresso.drinkEspresso();

        Beverage04 beverage03 = new Latte04("라떼", 6000.0, "아몬드 우유");
        beverage03.showInfo();

        Latte04 latte = (Latte04)beverage03 ; //강등
        latte.enjoyLatte();

        //승급 개념과 배열을 같이 사용하기
        //클래스 :내가 만드는 새로운타입 기존의 데이터를 몇개 묶어서 만드는(String,int,double..
        //배열 초기화 기법 : 타입[] 배열이름 = {요소1, 요소2,...}
        Beverage04[] beverage = {
                beverage01, //아메리카노(0번째 원소 아메리카노04)/세 개가 승급되어있다.(아메리카노,에스프레소,라떼)
                //원소 몇개지? beverage.length 라고 대답할 것.
                new Espresso04("마이뿌레소" ,2000.0, 1), //1번째 원소
                new Latte04("바나나 라떼", 3000.0, "바나나 우유") //2번째 원소
        };
        for (int i = 0; i < beverage.length; i++) {
            System.out.println("---------------------");
            beverage[i].showInfo(); //[] 안에 i 넣으면 위의 세가지가 출력 됨(i=0,1,2의 세개)
            //beverage[i] instanceof  Americano04 왼쪽이 오른쪽으로 만들어진 물건이 맞는가를 묻고 있다.
            //객체 beverage[i]는 Americano04 클래스로 생성된 물건이 맞나요?
            System.out.println(beverage[i].toString());

            // beverage[i] instaceof Americano04
            //객체 beverage[i]는 Americano04 클래스로 생성된 물건이 맞나요?
            if(beverage[i] instanceof Americano04){
                Americano04 xxx = (Americano04)beverage[i];
                xxx.sipAmericano();

            }else if(beverage[i] instanceof Espresso04){
                Espresso04 yyy = (Espresso04)beverage[i];
                yyy.drinkEspresso();

            }else if(beverage[i] instanceof Latte04){
                Latte04 zzz = (Latte04)beverage[i];
                zzz.enjoyLatte();

            }else {

            }
            //beverage[i].
            // beverage[i]에 빨간 줄이 뜬다면 아직 강등을 안해서이다.
        }
    }
}
