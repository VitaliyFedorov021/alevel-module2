package ua.com.alevel.module;

public class IsoscelesTrapezoid extends TrapezoidImpl {
    public void setSide2() {
        this.side2 = getSide1();
    }
    @Override
    public double firstDiagonal() {
        return Math.sqrt(bigBase + side1 - (2 * bigBase) * Math.sqrt(side1 - high));
    }

    @Override
    public double secondDiagonal() {
        return firstDiagonal();
    }

}
