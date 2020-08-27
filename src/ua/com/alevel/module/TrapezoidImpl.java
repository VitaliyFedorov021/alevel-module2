package ua.com.alevel.module;

public abstract class TrapezoidImpl {
    protected double bigBase, lessBase, side1, side2, high;

    public double square() {
        return (bigBase + lessBase) * high * 0.5;
    }

    public double perimeter() {
        return bigBase + lessBase + side1 + side2;
    }

    public double firstDiagonal() {
        return Math.sqrt(bigBase + side2  - (2 * bigBase) * Math.sqrt(side2 - high));
    }
    public double secondDiagonal() {
        return Math.sqrt(bigBase + side1  - (2 * bigBase) * Math.sqrt(side1 - high));
    }

    public double getBigBase() {
        return bigBase;
    }

    public void setBigBase(double bigBase) {
        this.bigBase = bigBase;
    }

    public double getLessBase() {
        return lessBase;
    }

    public void setLessBase(double lessBase) {
        this.lessBase = lessBase;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
