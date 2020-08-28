package ua.com.alevel.module;


public class IsoscelesTrapezoid extends TrapezoidImpl {
    public double getBigBase() {
        return bigBase;
    }

    public void setBigBase(double bigBase) {
        if (bigBase <= 0) {
            throw new RuntimeException("Size can't be less than zero");
        } else {
            this.bigBase = bigBase;
        }
    }

    public double getLessBase() {
        return lessBase;
    }

    public void setLessBase(double lessBase) {
        if (lessBase <= 0) {
            throw new RuntimeException("Size can't be less than zero");
        } else {
            this.lessBase = lessBase;
        }
    }

    public double getSide() {
        return firstSide;
    }

    public void setSide(double firstSide) {
        if (firstSide <= 0) {
            throw new RuntimeException("Size can't be less than zero");
        } else {
            this.firstSide = firstSide;
            this.secondSide = firstSide;
        }
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        if (high <= 0) {
            throw new RuntimeException("Size can't be less than zero");
        } else {
            this.high = high;
        }
    }

}
