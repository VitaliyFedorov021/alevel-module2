package ua.com.alevel.module;

//public double getBigBase() {
//        return bigBase;
//        }
//
//public void setBigBase(double bigBase) {
//        this.bigBase = bigBase;
//        }
//
//public double getLessBase() {
//        return lessBase;
//        }
//
//public void setLessBase(double lessBase) {
//        this.lessBase = lessBase;
//        }
//
//public double getSide1() {
//        return side1;
//        }
//
//public void setSide1(double side1) {
//        this.side1 = side1;
//        }
//
//public double getSide2() {
//        return side2;
//        }
//
//public void setSide2(double side2) {
//        this.side2 = side2;
//        }
//
//public double getHigh() {
//        return high;
//        }
//
//public void setHigh(double high) {
//        this.high = high;
//        }

public class IsoscelesTrapezoid extends TrapezoidImpl {
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

    public double getSide() {
        return firstSide;
    }

    public void setSide(double firstSide) {
        this.firstSide = firstSide;
        this.secondSide = firstSide;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

}
