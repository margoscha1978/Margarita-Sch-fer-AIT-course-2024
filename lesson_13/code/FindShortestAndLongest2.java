public class FindShortestAndLongest2 {

    //massiv ischet samie dlinnie ili korotkie ctroki
    public static String[][] findShortestAndLongest(String[] cities) {
        if (cities == null || cities.length == 0) {
            throw new IllegalArgumentException();//massiv ne pustoi
        }
        String shortest = null;
        String longest = null;
        int shortestCount = 0;
        int longestCount = 0;

        // vse goroda
        for (String city : cities) {
            int lengt = city.length();

            //samaja korotkaja
            if (shortest  == null || lengt < (shortest != null ? shortest.length() : Integer.MAX_VALUE ) ) {
                shortest = city;
                shortestCount = 1;// cchetchik cbrosim esli naschli novoe korotkoe slovo
            } else if (lengt == shortest.length()) {
                shortestCount++;//schetchik plus esli nahli esche odno pohoschee slovo
            }
            //samaja dlinnaja
            if (longest == null || lengt >( longest != null ? longest.length() : 0 )) {
                longest = city;
                longestCount = 1;
            } else if (lengt == longest.length()) {
                longestCount++;
            }
        }
// mesto dlja dlinnih i korotkih slov,massiv 2
        String[] shortestCities = new String[shortestCount];
        String[] longestCities = new String[longestCount];

        // massiv zapolnim
        int shortestIndex = 0;
        int longestIndex = 0;

        for (String city : cities) {
            if (city.length()  == shortest.length() ) {
                shortestCities[shortestIndex++] = city;
            }
            if (city.length() == longest.length() ) {
                longestCities[longestIndex++] = city;
            }
        }
        if (shortestCities.length == 0){
            shortestCities = new String[]{};
        }
        if (longestCities.length == 0){
            longestCities = new String[]{};
        }
        return new String[][] { longestCities, shortestCities };
    }
        // main
     public static void main(String[] args){
        // goroda
         String[] cities = {"Moskow", "Paris", " Sydney", "New-York", "Tokyo", "London"};
        // metod
        String[][] result = findShortestAndLongest(cities);

        if (result[0].length > 0){
            System.out.println( " Longest : " + String.join( ", ", result[0]));

    System.out.println( " Shortest : " + String.join( ", ", result[1]));

}
        }// main ende

}//klass ende
















