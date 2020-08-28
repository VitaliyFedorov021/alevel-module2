package ua.com.alevel.module;

public class CircleImpl implements Circle {
    private double radius;
    private double centreAngle;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Radius can't be less than zero");
        } else {
            this.radius = radius;
        }
    }

    public double getCentreAngle() {
        return centreAngle;
    }

    public void setCentreAngle(double centreAngle) {
        if (centreAngle <= 0) {
            throw new RuntimeException("Angle can't be less than zero");
        } else {
            this.centreAngle = centreAngle;
        }
    }

    @Override
    public double sector() {
        return (Math.PI * radius * radius * centreAngle) / 360.0;
    }

    @Override
    public double chord() {
        return Math.abs(2 * radius * Math.sin(centreAngle));
    }

    @Override
    public double arcLength() {
        return (Math.PI * radius * centreAngle) / 180.0;
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }
}
