package ua.com.alevel.module;

public class EquilateralTriangle extends TriangleImpl {
    public double getSides() {
        return firstSide;
    }

    public void setSides(double firstSide) {
        if (firstSide <= 0) {
            throw new RuntimeException("Size can't be less than zero");
        } else {
            this.firstSide = firstSide;
            this.secondSide = firstSide;
            this.thirdSide = firstSide;
        }
    }
}
