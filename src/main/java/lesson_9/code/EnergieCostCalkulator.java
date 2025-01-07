public class EnergieCostCalkulator {
    public static void main(String[] args) {


        // obcshee potreblenie priborob


        int refrigeratorPower = 150;// watt

        int airConditionerPower = 2000;// watt


        // summa obschaja

        int totalPowerWatt = refrigeratorPower + airConditionerPower;


        // perewod v kilowatt

        double totalPowerKW = totalPowerWatt / 1000.0;//kilowatt


        // potreblenie za mesjaz 30+24


        int hoursInMounth = 30 * 24;// mesjatz.thas

        double monthlyConsymptionKWh = totalPowerKW * hoursInMounth;


        // zena za thas

        double costPerKWh = 0.15;// euro


        //zena na mesjaz

        double totalCost = monthlyConsymptionKWh * costPerKWh;//euro


        // resultat


        System.out.println(" Total energy consumption per hour: " + totalPowerKW + "kW");

        System.out.println(" Total energy consumptionb fot the month: " + monthlyConsymptionKWh + "kWh");

        System.out.println("Total electricity cost for the month: %.2f euros:  " + totalCost);

    }

    }