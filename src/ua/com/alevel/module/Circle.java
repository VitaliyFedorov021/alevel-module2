package ua.com.alevel.module;

public interface Circle extends GeometricFigure {
    double sector();
    double chord();
    double arcLength();
    // для отдельной фигуры(f.e прямоугольный треугольгик) сделать свои геттеры и сеттеры, реализацию методов из интерфейса оставить 1 для всех)
}
