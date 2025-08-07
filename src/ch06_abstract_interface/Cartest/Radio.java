package ch06_abstract_interface.Cartest;

public interface Radio {
    // 인터페이스 내에 선언된 static 메소드는 모든 클래스들이 사용할 수 있습니다.
    static void play(Frequency frequency, double chanel) {
        String freq = "";
        if (frequency == Frequency.FM) {
            freq = "FM";
        } else {
            freq = "AM";
        }
        String message = "라디오 " + freq + "채널 " + chanel + "을 재생합니다";
        System.out.println(message);
    }

    // 인스페이스 내에 default 메소드는 2개 이상 작성이 가능하며, 필요하다면 구현클래스에서 오버라이딩도 가능합니다.
    default void sayHello(String carName, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("안녕~~방가워~~" + carName);

        }
    }
}
