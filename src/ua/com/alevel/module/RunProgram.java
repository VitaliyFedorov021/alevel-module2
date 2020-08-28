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

                }
            }
        }
    }
}
