class Cycle{

}
class UniCycle extends Cycle{
    public void balance(){
        System.out.println("Balancing Unicycle");
    }
}
class BiCycle extends Cycle{
    public void balance(){
        System.out.println("Balancing BiCycle");
    }
}
class TriCycle extends Cycle{

}

public class CycleExample{
    public static void main(String args[]){
        Cycle c[] = { new UniCycle(), new BiCycle(), new TriCycle()};
       /* for(int i=0;i<c.length;i++){
            c[i].balance();   //As Cycle and TriCycle has no balance method, it throws error
        }*/
        UniCycle uc = (UniCycle) c[0];
        BiCycle bc = (BiCycle) c[1];
        TriCycle tc = (TriCycle) c[2];
        uc.balance();
        bc.balance();
    }
}
