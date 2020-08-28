package ua.com.alevel.module;

public class Rectangle extends QuadrilateralImpl {
    public double getSide() {
        return firstSide;
    }

    public void setSide(double firstSide) {
        if (firstSide <= 0) {
            throw new RuntimeException("Side can't be less than zero");
        } else {
            this.firstSide = firstSide;
            this.secondSide = firstSide;
        }
    }

    public double getAngle() {
        return bigAngle;
    }

    public void setAngle() {
        this.bigAngle = 90;
        this.lessAngle = 90;
    }
}
