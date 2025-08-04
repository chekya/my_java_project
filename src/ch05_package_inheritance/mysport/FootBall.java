package ch05_package_inheritance.mysport;

public class FootBall extends Sport{
    private int halves ;
    private int goals ;

    public FootBall(String name, int entry, int halves, int goals){
        super(name, entry); //자식객체가 생성되기전에 부모객체가 먼저 초기화되어야 하므로 생성자의 '첫 줄'에 반드시 호출되어야 한다.
        this.halves = halves ;
        this.goals = goals ;
    }

    public void printInfo(){
        super.showInfo();
        System.out.println(this.halves + "개의 하프타임으로 구성이 되며, " + this.goals + "골이 들어갔습니다.");
        System.out.println();
    }
}
