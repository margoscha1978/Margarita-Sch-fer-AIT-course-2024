public class Temperature {
    public static void main(String[] args) {

        double celsius = 25.0;
        double fahrenheit = celsiusToFahreiheit(celsius);
        System.out.println(celsius + "celsius grad ist " + fahrenheit + "grad von farenheit");
    }//ende
    private static double celsiusToFahreiheit( double celsius){
        return(celsius * 9/5) + 32;
    }//metod
}//kl.ende
