package Ss04_Class_And_OOP.exercise.Class_stopwatch;

public class StopWatch {
    private double startTime;
    public  double endTime;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void stop(double runTime) {
        this.endTime = runTime;
    }

    public StopWatch() {
    }

    public void StartTime(double startTime) {
        this.startTime = startTime;
    }
    public  double getElapsedTime(){
        return  this.endTime - this.startTime;
    }
}
