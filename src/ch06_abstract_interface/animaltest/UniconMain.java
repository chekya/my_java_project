package ch06_abstract_interface.animaltest;

public class UniconMain {
    public static void main(String[] args) {
        Unicon unidol = new Unicon("유니돌", "M", "당근");
        unidol.display();
        unidol.flutter();

        System.out.println();

        Unicon unisoon = new Unicon("유니순", "F", "건초");
        unisoon.display();

        // 다형성 테스트
        // Unicon을 Animal, Horse, Bird 타입으로 다뤄 봅니다.
        // 승급
        Animal animal = new Unicon("다형성", "M", "사과"); //animal은 객체(메모리에 생성된 실체)를 가리키는 참조변수(그 객체를 가리키는 변수)이고 new Unicon(.....)이 만든 객체를 가리키는 참조 값을 저장한 것이다.
        animal.eat();

        // 강등
        Horse horse = (Horse) animal;
        horse.run();
        Bird bird = (Bird) animal;
        bird.fly();
    }
}
