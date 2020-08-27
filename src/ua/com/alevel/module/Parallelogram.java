package ua.com.alevel.module;

public class Parallelogram extends QuadrilateralImpl {
    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getBigAngle() {
        return bigAngle;
    }

    public void setBigAngle(double bigAngle) {
        this.bigAngle = bigAngle;
    }

    public double getLessAngle() {
        return lessAngle;
    }

    public void setLessAngle(double lessAngle) {
        if (getBigAngle() + lessAngle != 180) {
            throw new RuntimeException("Sum of 2 angels of parallelogram must equals 180 ");
        }
        this.lessAngle = lessAngle;
    }
}
