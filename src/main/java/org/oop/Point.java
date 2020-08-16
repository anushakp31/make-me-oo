package org.oop;
class Point{

    private final double x;
    private final double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public  double distance(Point SecondPoint) {
        double xDistance = SecondPoint.x - this.x;
        double yDistance = SecondPoint.y - this.y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction(Point secondPoint) {
        double xDistance = secondPoint.x - this.x;
        double yDistance = secondPoint.y - this.y;
        return Math.atan2(yDistance, xDistance);

    }
}
