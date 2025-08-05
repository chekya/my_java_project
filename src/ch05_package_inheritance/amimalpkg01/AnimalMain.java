package ch05_package_inheritance.amimalpkg01;

public class AnimalMain {
    public static void main(String[] args) {
        // 타입[] 배열명 = {}   //6번 동물 3마리 배열 만들기(1마리 끝내고 다음순으로 순차적으로)
        Animal01[] animal = {
                //6_1번 AnimalMain에서 배열 만든 후 아래의 ()안에 변수들 입력한 후 변수 빨간줄에 마우스대고 creat constructor 클릭하면 서브클래스에 생성자 생긴다.
                new GoldFish01("금붕어", 2, "거실 어항", 10, 2),
                new Lion01("라이언", 15, "세렝게티", 10, 4),
                new Eagle01("독수리", 20, "푸른 창공", 50,2 )
        };

        for (int i = 0; i < animal.length; i++) {
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
