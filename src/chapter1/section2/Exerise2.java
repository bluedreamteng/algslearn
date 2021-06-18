package chapter1.section2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exerise2 {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        Interval1D[] internals = createInternals(n);
        printAllIntersectsPairs(internals);
    }

    private static Interval1D[] createInternals(int n) {
        Interval1D[] intervals = new Interval1D[n];
        for (int i = 0; i < intervals.length; i++) {
            double min = StdRandom.uniform();
            double max = StdRandom.uniform();
            if (min > max) {
                double temp = min;
                min = max;
                max = temp;
            }


            Interval1D interval1D = new Interval1D(min, max);
            intervals[i] = interval1D;
        }
        return intervals;
    }

    private static void printAllIntersectsPairs(Interval1D[] internals) {
        for (int i = 0; i < internals.length-1; i++) {
            for (int j = i+1; j < internals.length; j++) {
                if(internals[i].intersects(internals[j])) {
                    StdOut.printf("Interval 1 - Min: %.3f  Max: %.3f \n", internals[i].min(), internals[i].max());
                    StdOut.printf("Interval 2 - Min: %.3f  Max: %.3f \n", internals[j].min(), internals[j].max());
                    StdOut.println();
                }
            }
        }
    }
}


