public class TimeSekonds {
    public static void main(String[] args) {

        int hours = 5;

        int minutes = 30;

        int sekonds = 15;



        int totalSekonds = calkulateSekonds(hours, minutes, sekonds );

        System.out.println(" Total quantity sekonds  from the beginning of the day: " + totalSekonds);

    }



    public static int calkulateSekonds(int hours, int minutes, int sekonds){



        return(hours*3600)+(minutes*60)+sekonds;

    }
}
