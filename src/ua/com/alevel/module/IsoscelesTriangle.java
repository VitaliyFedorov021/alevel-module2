package ua.com.alevel.module;

public class IsoscelesTriangle extends TriangleImpl {
    public double getSide() {
        return firstSide;
    }

    public void setSide(double firstSide) {
        if (firstSide <= 0) {
            throw new RuntimeException("Size can't be less than zero");
        } else {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
        }
    }


    public double getBase() {
        return thirdSide;
    }

    public void setBase(double thirdSide) {
        if (thirdSide <= 0) {
            throw new RuntimeException("Size can't be less than zero");
        } else {
            this.thirdSide = thirdSide;
        }
    }
}
