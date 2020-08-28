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
        if (bigAngle <= 0) {
           throw new RuntimeException("Angle can't be less than zero");
        } else {
            this.bigAngle = bigAngle;
        }
    }

    public double getLessAngle() {
        return lessAngle;
    }

    public void setLessAngle(double lessAngle) {
        if (getBigAngle() + lessAngle != 180 || lessAngle <= 0) {
            throw new RuntimeException("Sum of 2 angels of parallelogram must equals 180 ");
        } else {
            this.lessAngle = lessAngle;
        }
    }
}
