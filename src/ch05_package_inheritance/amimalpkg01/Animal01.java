package ch05_package_inheritance.amimalpkg01; //P132

public class Animal01 {
    private String name ; //이름            //1번 (A_1번) 슈퍼클래스에 변수 만들기(필드정의: 자식 클래스에서도 공통으로 쓸 속성을 먼저 정의해둔다.)
    private int lifespan ; //평균수명
    private String habitat ; //서식지
    private int speed ; //속도

    public String getName() { //(A_3번) getter메서드 만들기 :
        // 자식클래스에서 super.getName()처럼 부모필들를 읽어올 수 있도록 미리 준비해둠.
        return name;
    }

    public Animal01() {//기본생성자
        // 5번 매개변수없는 생성자 만들기, Alt + Insert --> constructor --> 제일 상단 ch05_package_...클릭 -->OK 클릭
        // (매개변수 0개짜리 생성자 생성된다.)
    }

    public Animal01(String name, int lifespan, String habitat, int speed) { //(A_2번) 생성자 만들기 :
        // 자식클래스에서 super(...)로 호출할 생성자가 필요함
        this.name = name;
        this.lifespan = lifespan;
        this.habitat = habitat;
        this.speed = speed;   //여기까지 만든다.1_1번
    }

    public void showInfo() {
        String message = "평균 수명이 " + this.lifespan + "인 " + this.name + "의 ";
        message += "서식지는 " + this.habitat + "입니다." ;
        System.out.println(message);
    }

    public int getSpeed() {
        return speed;
    }
}
/*클래스 왔다갔다 하는 순서 흐름
1. Animal01: 변수정의->생성자만들기->getter 만들기->showInfo만들기
2. GoldFish01: 변수정의->생성자만들기(super)->showInfo 오버라이드->고유메서드 swim
3. Lion01, Eagle01도 같은 방식
4. 중간중간 부모 클래스에서 빠진 메서드나 필드 있으면 다시 돌아가서 추가
5. AnimalMain 에서 전체 흐름 조절->필요 시 다시 자식클래스로 이동
 */