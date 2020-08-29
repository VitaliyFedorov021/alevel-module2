package ua.com.alevel.module;

public abstract class TrapezoidImpl implements Trapezoid {
    protected double bigBase, lessBase, firstSide, secondSide, high;

    public double square() {
        return (bigBase + lessBase) * high * 0.5;
    }

    public double perimeter() {
        return bigBase + lessBase + firstSide + secondSide;
    }

    public double firstDiagonal() {
        return Math.sqrt(Math.abs(bigBase + secondSide  - (2 * bigBase)) * Math.sqrt(Math.abs(secondSide - high)));
    }
    public double secondDiagonal() {
        return Math.sqrt(Math.abs(bigBase + firstSide  - (2 * bigBase)) * Math.sqrt(Math.abs(firstSide - high)));
    }
    
}
