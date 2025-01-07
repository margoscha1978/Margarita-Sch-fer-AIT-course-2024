package homework17;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        // запрашиваем коэффициенты
        System.out.println("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // дискриминант
        double d = b * b - 4 * a * c;

        // проверяем
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d) / 2 * a);
            double x2 = (-b + Math.sqrt(d) / 2 * a);
            System.out.println(" The equation has 2 roots: x = " + x1 + ", x2 = " + x2);
        }else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println(" The equation has a root: x = " + x);
        }else {
            System.out.println("The equations has no root: ");
            }

        }

    }

