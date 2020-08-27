package ua.com.alevel.module;

public class Square extends QuadrilateralImpl {
    @Override
    public double square() {
        return firstSide * firstSide;
    }

    @Override
    public double findHigh() {
        return firstSide;
    }

    @Override
    public double firstDiagonal() {
        return Math.sqrt(firstSide * firstSide + firstSide * firstSide);
    }

    @Override
    public double secondDiagonal() {
        return firstDiagonal();
    }

}
