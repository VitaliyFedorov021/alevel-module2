package ua.com.alevel.module;

public abstract class TrapezoidImpl {
    protected double bigBase, lessBase, firstSide, secondSide, high;

    public double square() {
        return (bigBase + lessBase) * high * 0.5;
    }

    public double perimeter() {
        return bigBase + lessBase + firstSide + secondSide;
    }

    public double firstDiagonal() {
        return Math.sqrt(bigBase + secondSide  - (2 * bigBase) * Math.sqrt(secondSide - high));
    }
    public double secondDiagonal() {
        return Math.sqrt(bigBase + firstSide  - (2 * bigBase) * Math.sqrt(firstSide - high));
    }
    
}
