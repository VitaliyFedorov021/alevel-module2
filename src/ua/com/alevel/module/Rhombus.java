package ua.com.alevel.module;

public class Rhombus extends QuadrilateralImpl {
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
    public double getBigAngle() {
        return bigAngle;
    }

    public void setBigAngle(double bigAngle) {
        if (bigAngle <= 0 || bigAngle >= 180) {
            throw new RuntimeException("Angle of quadrilateral can't be less than zero or higher than 180");
        } else {
            this.bigAngle = bigAngle;
        }
    }

    public double getLessAngle() {
        return lessAngle;
    }

    public void setLessAngle() {
        this.lessAngle = 180 - getBigAngle();
    }
}
