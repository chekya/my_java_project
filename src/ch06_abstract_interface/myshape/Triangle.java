package ch06_abstract_interface.myshape;

public class Triangle extends Shape {
    private double width;  //너비
    private double height;  //높이

    //@Override
    //protected void draw() {
    //  System.out.println("하하");


    public Triangle(String linecolor, String fillcolor, double width, double height) {
        super(linecolor, fillcolor);
        //부모생성자 호출하기 눈에 안보이는 생성자 super()가 존재하지만 옆라인 입력해줌으로써 자동으로 존재하던 눈에 안보이는 super()는 사라지게 된다.
        this.width = width;
        this.height = height;
    }

    //Implementation : 구체화(구현)
    @Override  //부모 클래스의 추상 메소들를 오버라이딩 했습니다.
    public double calaArea() { //각 클래스는 각자의 맡은 역할을 여기에 구현하면 됩니다.
        return this.width * this.height / 2.0;
        //(public class Triangle extends Shape에 빨간 줄 생겨있는데 거기에 마우스커서 대면 나오는 창의 Implement methods 클릭-->다시 나오는 창의 calaArea(): double 클릭하면 이렇게 오버라이딩 됨. 나머지 두개(Rectangle,Circle)의 클래스도 동일하게 진행

    }

    @Override
    public double calxPerimeter() {
        //삼각형의 둘레 길이를 구하려면, 삼각 함수를 공부해야 합니다.
        return 20.0;  //편의상 20.0이라고 가정
    }

    @Override
    public void display() {
        super.area = this.calaArea();
        super.perimeter = this.calxPerimeter();
        System.out.println("삼각형 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);

    }
}
