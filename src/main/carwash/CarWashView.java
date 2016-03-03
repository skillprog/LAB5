package carwash;

import simulator.SimView;

public class CarWashView extends SimView {
    CarWashState carwash;

    private static String dashedLine = String.format("%-32s %n", "-------------------------------------------");


    public CarWashView(CarWashState carwash){
        this.carwash = carwash;
    }

    public void printHeader()
    {
        String seedString = String.format("%-8s %d%n", "Seed = ", this.carwash.getSeed());
        String fastMachinesString = String.format("%-12s %d %n", "Fast machines:", this.carwash.getFastWashers());
        String slowMachinesString = String.format("%-12s %d %n", "Slow machines:", this.carwash.getSlowWashers());
        String fastDistribution = String.format("%-16s" + "%1.1f %s %1.1f" + "%s %n", "Fast distribution: (",
                this.carwash.getFastLower(), ",", this.carwash.getFastUpper(), ")");

        String slowDistribution = String.format("%-16s" +
                                                "%1.1f %s %1.1f" + "%s %n",
                                                "Slow distribution: (",
                                                this.carwash.getSlowLower(), ",", this.carwash.getSlowUpper(), ")");

        String lambdaString = String.format("%-16s %1.1f  %n",
                                            "Exponential distribution with lambda = ", this.carwash.getLambda());
        String maxQueueSize = String.format("%-16s %d %n",
                                            "Max Queue Size: ", this.carwash.getMaxQueueSize());

        String columnHeadersShort = String.format("%-8s   %-8s    %-8s    %-8s  %-8s",
                                                  "Time", "Fast", "Slow", "Id", "Event");

        String columnHeadersLong = String.format("%-16s      %-16s        %-16s        %-16s %n",
                                                 "IdleTime", "QueueTime", "QueueSize", "Rejected");
        System.out.println(seedString +
                fastMachinesString +
                slowMachinesString +
                fastDistribution +
                slowDistribution +
                lambdaString +
                maxQueueSize +
                dashedLine +
                columnHeadersShort +
                columnHeadersLong
        );

    }

    public void printCurrentState(){
        String currentTime = String.format("%1.2f %-6s",12 ,"");
        String fastMachinesFree = String.format("%d %-10s", this.carwash.getFastWashers(), "");
        String slowMachinesFree = String.format("%d %-10s", this.carwash.getSlowWashers(), "");
        String carID = String.format("%d %7s", 9, "");
        System.out.println(
                currentTime
                        + fastMachinesFree
                        + slowMachinesFree
                        + carID
        );
    }


    public void printFooter(){
        String totalIdleTime = String.format("%-32s %2.2f %n", "Total idle machine time: ", 11.11);
        String totalQueueingTime = String.format("%-32s %2.2f %n", "Total queueing time: ", 11.111);
        String meanQueueingTime = String.format("%-32s %2.2f %n", "Mean queueing time: ", 6.66);
        String rejectedCars = String.format("%-32s %d %n", "Rejected cars: ", carwash.getRejectedCars());

        System.out.println(dashedLine
                            + totalIdleTime
                            + totalQueueingTime
                            + meanQueueingTime
                            + rejectedCars);
    }

}

