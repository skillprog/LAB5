import carwash.CarWashState;
import carwash.CarWashView;
import random.ExponentialRandomStream;
import random.UniformRandomStream;
import simulator.*;

public class MainSim {
    public static void main(String[] args) {

        SimState carWashState = new CarWashState(
                new ExponentialRandomStream(1.5, 1234),
                new UniformRandomStream(4.5, 9.5, 1234));
        SimView carWashView = new CarWashView();
        Simulator simulator = new Simulator(carWashState, carWashView);

        simulator.start();
    }
}


