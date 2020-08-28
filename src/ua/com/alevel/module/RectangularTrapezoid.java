package ua.com.alevel.module;

public class RectangularTrapezoid extends TrapezoidImpl {
    public double getBigBase() {
        return bigBase;
    }

    public void setBigBase(double bigBase) {
        if (bigBase <= 0) {
            throw new RuntimeException("Side can't be less than zero");
        } else {
            this.bigBase = bigBase;
        }
    }

    public double getLessBase() {
        return lessBase;
    }

    public void setLessBase(double lessBase) {
        if (lessBase <= 0) {
            throw new RuntimeException("Side can't be less than zero");
        } else {
            this.lessBase = lessBase;
        }
    }

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
        if (secondSide <= 0) {
            throw new RuntimeException("Side can't be less than zero");
        } else {
            this.secondSide = secondSide;
        }
    }

    public double getHigh() {
        return high;
    }

    public void setHigh() {
        this.high = getFirstSide();
    }
}
