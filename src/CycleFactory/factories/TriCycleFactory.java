package CycleFactory.factories;

import CycleFactory.cycles.*;

public class TriCycleFactory {
    public Cycle getCycle(){
        return new TriCycle();
    }
}
