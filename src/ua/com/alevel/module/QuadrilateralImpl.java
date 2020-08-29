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
        double rad = Math.toRadians(lessAngle);
        return Math.abs(firstSide * Math.sin(rad));
    }

    @Override
    public double firstDiagonal() {
        double rad = Math.toRadians(lessAngle);
        return Math.abs(Math.sqrt(firstSide * firstSide + secondSide * secondSide * - 2 * firstSide * secondSide * Math.cos(rad)));
    }

    @Override
    public double secondDiagonal() {
        double rad = Math.toRadians(lessAngle);
        return Math.abs(Math.sqrt(firstSide * firstSide + secondSide * secondSide * + 2 * firstSide * secondSide * Math.cos(rad)));
    }
}
