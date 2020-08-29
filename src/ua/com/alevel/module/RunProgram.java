package ua.com.alevel.module;


import java.util.Scanner;

public class RunProgram {
    private String read(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String line = sc.nextLine();
        return line;
    }

    public void runProgram() {
        while (true) {
            System.out.println("1 - Triangle \n" +
                    "2 - Quadrilateral \n" +
                    "3 - Trapezoid \n" +
                    "4 - Circle \n" +
                    "0 - End of program");
            int a;
            try {
                a = Integer.parseInt(read("Choose a figure with whom you want to word"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            switch (a) {
                case 0: {
                    System.exit(1);
                }
                case 1: {
                    chooseTypeTriangle();
                }
                case 2: {
                    chooseTypeQuadrilateral();
                }
            }
        }
    }

    private void chooseTypeQuadrilateral() {
        Quadrilateral quadrilateral;
        boolean checkForType = true;
        while (checkForType) {
            System.out.println("1 - Parallelogram(Simple quadrilateral) \n" +
                    "2 - Rectangle \n" +
                    "3 - Square \n" +
                    "4 - Rhombus");
            int b;
            try {
                b = Integer.parseInt(read("Choose a type of figure with whom you want to word"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            switch (b) {
                case 1: {
                    checkForType = false;
                    quadrilateral = addParallelogram();
                    chooseActionQuadrilateral(quadrilateral);
                    break;
                }
                case 2: {
                    checkForType = false;
                    quadrilateral = addRectangle();
                    chooseActionQuadrilateral(quadrilateral);
                    break;
                }
                case 3: {
                    checkForType = false;
                    quadrilateral = addSquare();
                    chooseActionQuadrilateral(quadrilateral);
                    break;
                }
            }
        }

    }

    private void chooseActionQuadrilateral(Quadrilateral quadrilateral) {
        boolean checkForAction = true;
        while (checkForAction) {
            System.out.println("1 - Find square \n" +
                    "2 - Find perimeter \n" +
                    "3 - Find 1st diagonal \n" +
                    "4 - Find 2nd diagonal \n" +
                    "5 - Find high");
            int c;
            try {
                c = Integer.parseInt(read("Choose what you want to find"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            switch (c) {
                case 1: {
                    System.out.println(quadrilateral.square());
                    checkForAction = false;
                    break;
                }
                case 2: {
                    System.out.println(quadrilateral.perimeter());
                    checkForAction = false;
                    break;
                }
                case 3: {
                    System.out.println(quadrilateral.firstDiagonal());
                    checkForAction = false;
                    break;
                }
                case 4: {
                    System.out.println(quadrilateral.secondDiagonal());
                    checkForAction = false;
                    break;
                }
                case 5: {
                    System.out.println(quadrilateral.findHigh());
                    checkForAction = false;
                    break;
                }
            }
        }
    }

    private void chooseActionTriangle(Triangle triangle) {
        boolean checkForAction = true;
        while (checkForAction) {
            System.out.println("1 - Find square \n" +
                    "2 - Find perimeter \n" +
                    "3 - Find bisector \n" +
                    "4 - Find median \n" +
                    "5 - Find high \n" +
                    "6 - Find middle line");
            int c;
            try {
                c = Integer.parseInt(read("Choose what you want to find"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            switch (c) {
                case 1: {
                    System.out.println(triangle.square());
                    checkForAction = false;
                    break;
                }
                case 2: {
                    System.out.println(triangle.perimeter());
                    checkForAction = false;
                    break;
                }
                case 3: {
                    System.out.println(triangle.bisector());
                    checkForAction = false;
                    break;
                }
                case 4: {
                    System.out.println(triangle.median());
                    checkForAction = false;
                    break;
                }
                case 5: {
                    System.out.println(triangle.high());
                    checkForAction = false;
                    break;
                }
                case 6: {
                    System.out.println(triangle.middleLine());
                    checkForAction = false;
                    break;
                }
            }
        }
    }

    private void chooseTypeTriangle() {
        Triangle triangle;
        boolean checkForType = true;
        while (checkForType) {
            System.out.println("1 - Simple triangle \n" +
                    "2 - Isosceles triangle \n" +
                    "3 - Equilateral triangle");
            int b;
            try {
                b = Integer.parseInt(read("Choose a type of figure with whom you want to word"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            switch (b) {
                case 1: {
                    checkForType = false;
                    triangle = addSimpleTriangle();
                    chooseActionTriangle(triangle);
                    break;
                }
                case 2: {
                    checkForType = false;
                    triangle = addIsoscelesTriangle();
                    chooseActionTriangle(triangle);
                    break;
                }
                case 3: {
                    checkForType = false;
                    triangle = addEquilateralTriangle();
                    chooseActionTriangle(triangle);
                    break;

                }
            }
        }
    }

    private Triangle addSimpleTriangle() {
        SimpleTriangle triangle = new SimpleTriangle();
        double firstSide, secondSide, thirdSide;
        while (true) {
            try {
                firstSide = Double.parseDouble(read("Enter the first side of triangle"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
        triangle.setFirstSide(firstSide);
        while (true) {
            try {
                secondSide = Double.parseDouble(read("Enter the second side of triangle"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
        triangle.setSecondSide(secondSide);
        while (true) {
            try {
                thirdSide = Double.parseDouble(read("Enter the third side of triangle"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
        triangle.setThirdSide(thirdSide);
        return triangle;
    }

    private Triangle addIsoscelesTriangle() {
        IsoscelesTriangle triangle = new IsoscelesTriangle();
        double side;
        while (true) {
            try {
                side = Double.parseDouble(read("Enter the side of triangle"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
        triangle.setSide(side);
        double base;
        while (true) {
            try {
                base = Double.parseDouble(read("Enter the base of triangle"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
        triangle.setBase(base);
        return triangle;
    }

    private Triangle addEquilateralTriangle() {
        EquilateralTriangle triangle = new EquilateralTriangle();
        double side;
        while (true) {
            try {
                side = Double.parseDouble(read("Enter the side of triangle"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            triangle.setSides(side);
            break;
        }
        return triangle;
    }

    private Quadrilateral addParallelogram() {
        Parallelogram parallelogram = new Parallelogram();

        double firstSide, secondSide, bigAngle;
        while (true) {
            try {
                firstSide = Double.parseDouble(read("Enter the first side of parallelogram"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
        parallelogram.setFirstSide(firstSide);
        while (true) {
            try {
                secondSide = Double.parseDouble(read("Enter the second side of parallelogram"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
        parallelogram.setSecondSide(secondSide);
        while (true) {
            try {
                bigAngle = Double.parseDouble(read("Enter the big angle of parallelogram"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
        parallelogram.setBigAngle(bigAngle);
        parallelogram.setLessAngle();
        return parallelogram;
    }

    private Quadrilateral addRectangle() {
        Rectangle rectangle = new Rectangle();
        double firstSide, secondSide;
        while (true) {
            try {
                firstSide = Double.parseDouble(read("Enter the side of rectangle"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
        rectangle.setFirstSide(firstSide);
        while (true) {
            try {
                secondSide = Double.parseDouble(read("Enter the side of rectangle"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
        rectangle.setSecondSide(secondSide);
        rectangle.setAngle();
        return rectangle;
    }

    private Quadrilateral addSquare() {
        Square square = new Square();
        double side;
        while (true) {
            try {
                side = Double.parseDouble(read("Enter the side of rectangle"));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
        square.setSide(side);
        square.setAngle();
        return square;
    }
}
//add rhombus
