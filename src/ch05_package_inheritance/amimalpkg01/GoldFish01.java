package ch05_package_inheritance.amimalpkg01;

public class GoldFish01 extends Animal01{    // 2번 서브클래스 상속 받기 (extends Animal01 입력)
    private int gill ; //아가미 개수  //3번 변수입력(다른 서브 클래스들도 2번,3번 반복)
                                    // (A_4번)자식 클래스에 클래스선언+필드선언 : 자식클래스는 자신만의 고유 속성을 가지므로.

    @Override  //(A_6번) showInfo()오버라이딩 : 부모클래스의 showInfo에 기능를 추가하려면 오버라이딘 필요
    public void showInfo() {
        super.showInfo(); //평균수명....라인 출력문구
        String message = super.getName() + "의 아가미 개수는 " + this.gill + "개입니다." ; //getter를 Animal01에 생성하고 돌아온다
        System.out.println(message);
    }

    public GoldFish01(String name, int lifespan, String habitat, int speed, int gill) {
        //(A_5번) 생성자만들기 -->부모생성자호출 :부모생성자가 먼저 실행되어야 객체가 완전히 생성되므로.
        //7번  AnimalMain에서 배열만든 후 거기 ()안 변수빨간줄에 마우스대고 creat constructor 클릭하면 서브클래스(여기)에 생성자 생긴다. 그러면 위의 ()안 입력, 아래 두줄까지 입력한다. AnimalMain 으로 간다.
        super(name,lifespan, habitat, speed);
        this.gill = gill ;
        // ( GoldFish01 완성 후 나머지 서브클래스(Lion01,Eagle01도 메인과 왔다갔다하며 만들어 준다.
    }

    public void swim(){ //헤엄치는 동작  //(A_7번)고유메서드 swim()작성
        // (A_8번 다른 자식 클래스도 반복,이때도 super(...), super.getName()등을 쓰기 때문에 다시 부모 클래스로 돌아가서
        // getter가 빠졌는지 체크하거나 필요하면 추가함.
        // 4번 각 서브클래스 메소드 구색 갖추기(public void swim(){} 금붕어는 헤엄치는 메소드이므로 swim 입력),
        // 아직 아랫줄은 입력하지 않는다.
        String message = super.getName() + "이(가) " + super.getSpeed() + "의 속도로 헤엄칩니다.";
        System.out.println(message);

    }
}
