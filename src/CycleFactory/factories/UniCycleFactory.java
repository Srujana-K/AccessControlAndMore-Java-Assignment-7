package CycleFactory.factories;

import CycleFactory.cycles.*;

public class UniCycleFactory {
    public Cycle getCycle(){
        return new UniCycle();
    }
}
