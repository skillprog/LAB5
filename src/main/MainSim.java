import carwash.CarWashState;
import carwash.CarWashView;
import simulator.*;

public class MainSim {
    public static void main(String[] args) {

        CarWashState carWashState = new CarWashState(1.5, 8.5, 10.6, 2.2, 4.4, 1234);
        SimView carWashView = new CarWashView(carWashState);
        Simulator simulator = new Simulator(carWashState, carWashView);

        simulator.start();
    }
}


