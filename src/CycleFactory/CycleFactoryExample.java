package CycleFactory;

import CycleFactory.cycles.BiCycle;
import CycleFactory.cycles.Cycle;
import CycleFactory.factories.BiCycleFactory;
import CycleFactory.factories.TriCycleFactory;
import CycleFactory.factories.UniCycleFactory;

public class CycleFactoryExample {
    public static void main(String args[]){
        Cycle unicycle = new UniCycleFactory().getCycle();
        Cycle bicycle = new BiCycleFactory().getCycle();
        Cycle tricycle = new TriCycleFactory().getCycle();
        unicycle.startRide();
        bicycle.startRide();
        tricycle.startRide();
    }
}
