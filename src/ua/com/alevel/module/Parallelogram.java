package ua.com.alevel.module;

public class Parallelogram extends QuadrilateralImpl {
    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        if (firstSide <= 0) {
            throw new RuntimeException("Side can't be less than zero");
        } else {
            this.firstSide = firstSide;
        }
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        if (firstSide <= 0) {
            throw new RuntimeException("Side can't be less than zero");
        } else {
            this.secondSide = secondSide;
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
