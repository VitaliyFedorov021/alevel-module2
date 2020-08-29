package ua.com.alevel.module;

public class SimpleTriangle extends TriangleImpl {
    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        if (firstSide <= 0) {
            throw new RuntimeException("Size can't be less than zero");
        } else {
            this.firstSide = firstSide;
        }
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        if (secondSide <= 0) {
            throw new RuntimeException("Size can't be less than zero");
        } else {
            this.secondSide = secondSide;
        }
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        if (thirdSide <= 0) {
            throw new RuntimeException("Size can't be less than zero");
        } else {
            this.thirdSide = thirdSide;
        }
    }
}
