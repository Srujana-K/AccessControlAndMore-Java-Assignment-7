package task3;

public class Car extends Vehicle implements FourthInterface{
    @Override
    public void method11() {
        System.out.println("First Interface method-1");
    }

    @Override
    public void method12() {
        System.out.println("First Interface method-2");
    }

    @Override
    public void method21() {
        System.out.println("Second Interface method-1");
    }

    @Override
    public void method22() {
        System.out.println("Second Interface method-2");
    }

    @Override
    public void method31() {
        System.out.println("Third Interface method-1");
    }

    @Override
    public void method32() {
        System.out.println("Third Interface method-2");
    }

    @Override
    public void method() {
        System.out.println("Fourth Interface method");
    }

}
