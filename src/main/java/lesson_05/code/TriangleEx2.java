public class TriangleEx2 {
    private static boolean isTriangle;

    public static void main(String[] args) {
        //seietn vom Dreieck
        double a = 3;
        double b = 4;
        double c = 5;
        // prufung
        boolean isTriangle1= (a + b > c);
        boolean isTriangle2 = (a + c > b);
        boolean isTriangle3 = (b + c > a);
        if (isTriangle1) {

            System.out.println("Triangle is true");
        } else {
            System.out.println("Triangle is fals");
        }
    }
}