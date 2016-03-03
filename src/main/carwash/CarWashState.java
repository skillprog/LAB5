package carwash;

import random.ExponentialRandomStream;
import random.UniformRandomStream;
import simulator.SimState;


public class CarWashState implements SimState {

    int ZERO = 0;
    int fastWashers;
    int slowWashers;
    int initQueueSpace;
    int remainingQueueSpace;
    int maxQueueSize;
    int rejectedCars;


    double elapsedSimulationTime = 0;

    double lambda;
    double slowLower;
    double slowUpper;
    double fastLower;
    double fastUpper;
    long seed;

    ExponentialRandomStream exponentialRandomStream;
    UniformRandomStream slowDist;
    UniformRandomStream fastDist;;

    public CarWashState(double lambda,
                        double slowLower,
                        double slowUpper,
                        double fastLower,
                        double fastUpper,
                        long seed)
    {
        this.lambda = lambda;
        this.slowLower = slowLower;
        this.slowUpper = slowUpper;
        this.fastLower = fastLower;
        this.fastUpper = fastUpper;
        this.seed = seed;


        //TODO Initial simulation values.
        this.exponentialRandomStream = new ExponentialRandomStream(lambda, seed);
        this.slowDist = new UniformRandomStream(slowLower, slowUpper, seed);
        this.fastDist = new UniformRandomStream(fastLower, fastUpper, seed);

        this.fastWashers = 2;
        this.slowWashers = 2;
        this.initQueueSpace = 4;
        this.remainingQueueSpace = this.initQueueSpace;
        this.maxQueueSize = ZERO;
        this.rejectedCars = ZERO;

    }


    @Override
    public double getArrivalTime() {
        return exponentialRandomStream.next();
    }

    @Override
    public void addToElapsedSimulationTime(double elapsedSimulationTime) {
        this.elapsedSimulationTime =+ elapsedSimulationTime;
    }

    @Override
    public double getElapsedTime() {
        return this.elapsedSimulationTime;
    }

    @Override
    public double getLeaveTime() {
        return slowDist.next();
    }

    public int getFastWashers() {
        return fastWashers;
    }

    public void setFastWashers(int fastWashers) {
        this.fastWashers = fastWashers;
    }

    public int getSlowWashers() {
        return slowWashers;
    }

    public void setSlowWashers(int slowWashers) {
        this.slowWashers = slowWashers;
    }

    public int getInitQueueSpace() {
        return initQueueSpace;
    }

    public void setInitQueueSpace(int initQueueSpace) {
        this.initQueueSpace = initQueueSpace;
    }

    public int getRemainingQueueSpace() {
        return remainingQueueSpace;
    }

    public void setRemainingQueueSpace(int remainingQueueSpace) {
        this.remainingQueueSpace = remainingQueueSpace;
    }

    public int getMaxQueueSize() {
        return maxQueueSize;
    }

    public void setMaxQueueSize(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
    }

    public int getRejectedCars() {
        return rejectedCars;
    }

    public void setRejectedCars(int rejectedCars) {
        this.rejectedCars = rejectedCars;
    }

    public double getElapsedSimulationTime() {
        return elapsedSimulationTime;
    }

    public void setElapsedSimulationTime(double elapsedSimulationTime) {
        this.elapsedSimulationTime = elapsedSimulationTime;
    }

    public double getLambda() {
        return lambda;
    }

    public void setLambda(double lambda) {
        this.lambda = lambda;
    }

    public double getSlowLower() {
        return slowLower;
    }

    public void setSlowLower(double slowLower) {
        this.slowLower = slowLower;
    }

    public double getSlowUpper() {
        return slowUpper;
    }

    public void setSlowUpper(double slowUpper) {
        this.slowUpper = slowUpper;
    }

    public double getFastLower() {
        return fastLower;
    }

    public void setFastLower(double fastLower) {
        this.fastLower = fastLower;
    }

    public double getFastUpper() {
        return fastUpper;
    }

    public void setFastUpper(double fastUpper) {
        this.fastUpper = fastUpper;
    }

    public long getSeed() {
        return seed;
    }

    public void setSeed(long seed) {
        this.seed = seed;
    }

    public ExponentialRandomStream getExponentialRandomStream() {
        return exponentialRandomStream;
    }

    public void setExponentialRandomStream(ExponentialRandomStream exponentialRandomStream) {
        this.exponentialRandomStream = exponentialRandomStream;
    }

    public UniformRandomStream getSlowDist() {
        return slowDist;
    }

    public void setSlowDist(UniformRandomStream slowDist) {
        this.slowDist = slowDist;
    }

    public UniformRandomStream getFastDist() {
        return fastDist;
    }

    public void setFastDist(UniformRandomStream fastDist) {
        this.fastDist = fastDist;
    }
}
