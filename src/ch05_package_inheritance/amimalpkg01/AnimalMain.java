package ch05_package_inheritance.amimalpkg01;

public class AnimalMain {
    public static void main(String[] args) {
        // 타입[] 배열명 = {}   (A_9번) 배열로 객체만들기 : 이때 각 생성자의 인자 개수가 맞는지 확인해야 하므로
        // 자식 클래스 생성자 선언부를 다시 확인하거나 수정하게 됨.
        Animal01[] animal = {  //6번 동물 3마리 배열 만들기(1마리 끝내고 다음순으로 순차적으로)
                //6_1번 AnimalMain에서 배열 만든 후 아래의 ()안에 변수들 입력한 후 변수 빨간줄에 마우스대고 creat constructor 클릭하면 서브클래스에 생성자 생긴다.
                new GoldFish01("금붕어", 2, "거실 어항", 10, 2),
                new Lion01("라이언", 15, "세렝게티", 10, 4),
                new Eagle01("독수리", 20, "푸른 창공", 50,2 )
        };

        for (int i = 0; i < animal.length; i++) {  //(A_10번) showInfo()호출&타입별 메서드 실행: 어기서도 각 자식 클래스의 매서드 이름 확인 -->필요 시 자식 클래스로 돌아가서 매서드 수정 or 추가
        animal[i].showInfo(); //0번째는 금붕어, 현재 Animal01 있음
            if(animal[i] instanceof  GoldFish01) {
                GoldFish01 goldFish = (GoldFish01) animal[i];
                goldFish.swim();

            }else if(animal[i] instanceof  Lion01){
                Lion01 lion = (Lion01)animal[i];
                lion.run();

            }else if(animal[i] instanceof  Eagle01) {
                Eagle01 eagle = (Eagle01) animal[i];
                eagle.fly();

            }else {

            }
        //승급이 된 후 자식들 변수에 일시적 접근 못하므로 오리지널 타입 되돌리고 도트 찍으면 나온다.
        }

    }
}
