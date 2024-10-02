public class Mile {
    public static void main(String[] args) {

        double mile = 25.0;
        double kilometr = mileToKilometr(mile);
        System.out.println(mile + " mile " + kilometr + " kilometr " );
    }
    private static double mileToKilometr( double mile){
        return mile * 1.6;
    }

}
