package chapter1.section2;

import edu.princeton.cs.algs4.*;

/**
 * @author ztf
 */
public class Exerise1 {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        Point2D[] points = createOrDrawPoints(n);
        StdOut.println(calculateShortestDistance(points));
    }

    /**
     * 创建并画出随机点
     * @param n 随机点数量
     * @return 随机点数组
     */
    private static Point2D[] createOrDrawPoints(int n) {
        Point2D[] points = new Point2D[n];
        StdDraw.setCanvasSize(1024, 512);
        StdDraw.setPenRadius(.015);
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        for (int i = 0; i < points.length; i++) {
            double pointX = StdRandom.uniform();
            double pointY = StdRandom.uniform();
            Point2D point = new Point2D(pointX,pointY);
            StdDraw.point(point.x(),point.y());
            points[i] = point;
        }
        return points;
    }

    private static double calculateShortestDistance(Point2D[] points) {
        if(points == null || points.length < 2) {
            throw new IllegalArgumentException("not meet the calculation conditions");
        }
        double shortestDistance = Double.MAX_VALUE;
        double currentDistance;
        for (int i = 0; i < points.length-1; i++) {
            for (int j = i+1; j < points.length; j++) {
                currentDistance = points[i].distanceTo(points[j]);
                if(currentDistance < shortestDistance) {
                    shortestDistance = currentDistance;
                }
            }
        }
        return shortestDistance;
    }
}
