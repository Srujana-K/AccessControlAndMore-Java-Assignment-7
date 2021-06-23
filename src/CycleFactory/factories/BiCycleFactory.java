package CycleFactory.factories;

import CycleFactory.cycles.*;

public class BiCycleFactory {
    public Cycle getCycle(){
        return new BiCycle();
    }
}
