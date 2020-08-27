package ua.com.alevel.module;

public class Rectangle extends QuadrilateralImpl {
    public void setSecondSide() {
        this.secondSide = getFirstSide();
    }

    @Override
    public double square() {
        return firstSide * secondSide;
    }

    @Override
    public double findHigh() {
        return firstSide;
    }

    @Override
    public double firstDiagonal() {
        return Math.sqrt(firstSide * firstSide + secondSide * secondSide);
    }

    @Override
    public double secondDiagonal() {
        return firstDiagonal();
    }
}
