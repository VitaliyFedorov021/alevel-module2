package ua.com.alevel.module;

public abstract class QuadrilateralImpl implements Quadrilateral {
    protected double bigAngle, lessAngle;
    protected double firstSide, secondSide;

    @Override
    public double square() {
        return firstSide * findHigh();
    }

    @Override
    public double perimeter() {
        return 2 * (firstSide + secondSide);
    }

    @Override
    public double findHigh() {
        return Math.abs(firstSide * Math.sin(lessAngle));
    }

    @Override
    public double firstDiagonal() {
        return Math.abs(Math.sqrt(firstSide * firstSide + secondSide * secondSide * - 2 * firstSide * secondSide * Math.cos(lessAngle)));
    }

    @Override
    public double secondDiagonal() {
        return Math.abs(Math.sqrt(firstSide * firstSide + secondSide * secondSide * + 2 * firstSide * secondSide * Math.cos(lessAngle)));
    }
}
