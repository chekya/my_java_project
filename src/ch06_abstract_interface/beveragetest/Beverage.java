package ch06_abstract_interface.beveragetest;

public abstract class Beverage {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void drink();
    public abstract void make();

    public abstract void display();

    protected final void showData() {
        System.out.println("음료 " + this.name + "의 단가는 " + this.price + "입니다.");

    }

}
