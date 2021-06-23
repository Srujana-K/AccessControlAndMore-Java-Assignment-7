abstract class Rodent{
    Rodent(){
        System.out.println("In base class - Rodent");
    }
    public void eat(){
        System.out.println("In base class - eating");
    }
    public void teeth(){
        System.out.println("Rodents have no teeth");
    }
    abstract void sound();
}

class Mouse extends Rodent{
    Mouse(){
        System.out.println("In derived class - Mouse");
    }
    public void eat(){
        System.out.println("Mouse is eating");
    }
    public void teeth(){
        System.out.println("Mouse has teeth");
    }
    public void sound(){
        System.out.println("Mouse is making squeak sound");
    }
}
class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("In derived class - Gerbil");
    }
    public void eat(){
        System.out.println("Gerbil is eating");
    }
    public void teeth(){
        System.out.println("Gerbil has no teeth");
    }
    public void sound(){
        System.out.println("Gerbil is making squak sound");
    }
}
class Hamster extends Rodent{
    Hamster(){
        System.out.println("In derived class - Hamster");
    }
    public void eat(){
        System.out.println("Hamster is eating");
    }
    public void teeth(){
        System.out.println("Hamster has teeth");
    }
    public void sound(){
        System.out.println("Hamster is making whinning sound");
    }
}
public class InheritanceHeirarchy {
    public static void main(String args[]){
        Rodent r[] = { new Mouse(), new Gerbil(), new Hamster() };
        for(int i=0;i<r.length;i++){
            System.out.println("=======================");
            r[i].eat();
            r[i].teeth();
            r[i].sound();
            System.out.println("=======================");
        }
    }
}
