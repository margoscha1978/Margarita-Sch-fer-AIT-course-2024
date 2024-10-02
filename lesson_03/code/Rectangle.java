public class Rectangle {
    public static void main(String[] args) {

// S=a*b

                double a = 125.37d;
                double b = 35.0;

                // solution 1
                double area = a * b;
                System.out.println("Area of rectangle: " + area);

                // solution with method

                area = areaOfRectangle(a, b);
                System.out.println(area);

            } // end of main

            public static double areaOfRectangle(double x, double y){
                double res = x * y;
                return res;
            }

        } // end of class



