package ua.com.alevel.module;

public class Rectangle extends QuadrilateralImpl {
    public double getSide() {
        return firstSide;
    }

    public void setSide(double firstSide) {
        this.firstSide = firstSide;
        this.secondSide = firstSide;
    }

    public double getBigAngle() {
        return bigAngle;
    }

    public void setBigAngle() {
        this.bigAngle = 90;
    }

    public double getLessAngle() {
        return lessAngle;
    }

    public void setLessAngle() {
        this.lessAngle = 90;
    }
}
