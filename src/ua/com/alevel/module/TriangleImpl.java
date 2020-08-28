package ua.com.alevel.module;

public abstract class TriangleImpl implements Triangle {
    protected double firstSide, secondSide, thirdSide;

    @Override
    public double bisector() {
        double p = (firstSide + secondSide + thirdSide) / 2;
        return (2 * Math.sqrt(firstSide * secondSide * p * (p - thirdSide))) / (firstSide + secondSide);
    }

    @Override
    public double median() {
        return 0.5 * Math.sqrt(2 * secondSide * secondSide + 2 * thirdSide * thirdSide - firstSide * firstSide);
    }

    @Override
    public double high() {
        return (2 * square()) / firstSide;
    }

    @Override
    public double middleLine() {
        return 0.5 * thirdSide;
    }

    @Override
    public double square() {
        double p = (firstSide + secondSide + thirdSide) / 2;
        double result = Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
        return result;
    }

    @Override
    public double perimeter() {
        return firstSide + secondSide + thirdSide;
    }


}
