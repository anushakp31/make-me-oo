package org.oop;
class Point{

    private final double x;
    private final double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public  double distance(Point SecondPoint) {
        double xDistance = this.x-SecondPoint.x;
        double yDistance = this.y-SecondPoint.y ;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction(Point secondPoint) {
        double xDistance = secondPoint.x - this.x;
        double yDistance = secondPoint.y - this.y;
        return Math.atan2(yDistance, xDistance);

    }
}
