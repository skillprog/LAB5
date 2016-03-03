package simulator;

import java.util.Observable;
import java.util.Observer;

public abstract class SimView implements Observer{
    @Override
    public void update(Observable o, Object arg) {
    }

    abstract public void printHeader();
    abstract public void printFooter();
}
