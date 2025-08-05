package ch05_package_inheritance.mybeverage;

public class Beverage04 {
    private String name;
    private double price;

    //메소드 은닉화 : 오버라이딩시 본의 아니게, 수펴 클래스의 메소드가 숨겨 지는 현상을 일컫는 말입니다.
    //@으로 시작하는 항목들을 어노테이션(Annotation)이라고 부릅니다.
    @Override //이 메소드는 오버라이딩 되었습니다. 라는 의미
    public String toString() {
        String message = "품명 :" + this.name + ", 단가 :" + this.price;
        return message;

    }

    public String getName() { //getter 생성 //alt + insert --> 박스안에 뜨는 것중 gutter 클릭하면 gutter 생성된다.
        return name;
    }

    public  Beverage04(){}

    protected void showInfo(){  //void 앞에 아무것도 안붙이면 기본 /이론 P81
        System.out.println("\n음료 이름 : " + this.name); // \n ->엔터키
        System.out.println("단가 : " + this.price);

    }
    public Beverage04(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
