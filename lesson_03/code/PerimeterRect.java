public class PerimeterRect {
    public static void main(String[] args) {

        // P= a+a+b+b,P=(a+b)*2,P=a*2+b*2

        int a=1000;
        int b=2000;
        System.out.println(a+a+b+b);
        int rest= a+a+b+b;

        System.out.println((a+b)*2);
        int rest1 = (a+b)*2;

        System.out.println(a*2+b*2);
        int rest2 = a*2+b*2;
    }
}
