package ua.com.alevel.module;

public class Square extends QuadrilateralImpl {
    public double getSide() {
        return firstSide;
    }

    public void setSide(double firstSide) {
        this.firstSide = firstSide;
        this.secondSide = firstSide;
    }

    public double getAngle() {
        return bigAngle;
    }

    public void setAngle() {
        this.bigAngle = 90;
        this.lessAngle = 90;
    }

}
