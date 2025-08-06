package ch06_abstract_interface.myshape;

public abstract class Shape {
    //일반화 : 모든 도형에서 사용하는 면적, 둘레, 라인 색상, 채우기 색상등은 수퍼 클래스에서 사용합니다.
    protected double area ;  //면적
    protected double perimeter ;  //도형의 둘레
    private String linecolor ;  //라인 색상
    private String fillcolor ;  //채우기 색상

    //내용이 정의되지 않는 모겔 개념으로, 불완전한 메소드 입니다.{}(body) 쓰지 않고 ; 세미콜론만 붙인다.
    public abstract double calaArea(); //이 추상메소드를 서브 3개의 클래스에도 동일하게 만든다.(오버라이딩,방법은 Circle클래스에 기입했음)
    public abstract double calxPerimeter();
    public abstract void display ();
//fanal 메소드는 오버라이딩을 하지 못하도록 막고자 할 때 사용합니다.(강제성 있음)
    protected final void  draw(){  //일반메소드 하위클래스가 오버라이딩 가능하다.--> 여기에 fanal붙인다.
        System.out.println("라인 색상 : " + this.linecolor);
        System.out.println("채우기 색상 : " + this.fillcolor);
    }

    public Shape(String linecolor, String fillcolor) { //빈생성자(Alt+Insert)먼저만들고 메인 가서 배열만든 후 삼각형 가서 super 만들고 돌아와서
        // 소괄호안(매개변수는 메인 생성자 매개변수와 동일하게 작성한다)작성한 후 아랫줄 this 두개까지 포함해서 생성하기(Alt+Insert).
        this.linecolor = linecolor;
        this.fillcolor = fillcolor;
    }

    public Shape() {
    }
}
