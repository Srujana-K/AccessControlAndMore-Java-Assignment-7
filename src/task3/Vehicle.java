package task3;

public class Vehicle {
    public static void main(String args[]){
        Vehicle v= new Vehicle();
        Car c = new Car();
        v.firstIntMethod(c);
        v.secondIntMethod(c);
        v.thirdIntMethod(c);
        v.FourthIntMethod(c);
    }
    public void firstIntMethod(FirstInterface i){
        i.method11();
        i.method12();
    }
    public void secondIntMethod(SecondInterface i){
        i.method21();
        i.method22();
    }
    public void thirdIntMethod(ThirdInterface i){
        i.method31();
        i.method32();
    }
    public void FourthIntMethod(FourthInterface i){
        i.method();
    }
}
