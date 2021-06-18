package chapter1.section2;

import edu.princeton.cs.algs4.StdDraw;

/**
 * @author ztf
 */
public class Exerise10 {
    public static void main(String[] args) {
        VisualCounter visualCounter = new VisualCounter(1000,1000);
        for (int i = 0; i < 10; i++) {
            visualCounter.increment();
        }
        System.out.println(visualCounter);
    }
}

class VisualCounter{
    private int maxTimes;
    private int maxValue;

    private int currentTimes = 0;
    private int currentValue = 0;

    public VisualCounter(int maxTimes, int maxValue) {
        this.maxTimes = maxTimes;
        this.maxValue = maxValue;
        StdDraw.setCanvasSize(1024, 512);
        StdDraw.setPenRadius(.015);
        StdDraw.setXscale(0, maxTimes+1);
        StdDraw.setYscale(-maxValue-3, maxValue+3);
    }

    public void increment(){
        if(validate()) {
            currentValue++;
            currentTimes++;
            plotCounter();

        }
    }

    public void reduce(){
        if(validate()) {
            currentValue--;
            currentTimes++;
            plotCounter();
        }
    }

    private boolean validate() {
        return currentTimes <= maxTimes && Math.abs(currentValue) <= maxValue;
    }

    private void plotCounter() {
        StdDraw.point(currentTimes, currentValue);
    }

    @Override
    public String toString() {
        return "VisualCounter{" +
                "currentTimes=" + currentTimes +
                ", currentValue=" + currentValue +
                '}';
    }
}
