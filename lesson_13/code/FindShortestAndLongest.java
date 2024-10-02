public class FindShortestAndLongest {

//metod ischet samie korotkie i dlinnie stroki
        public static String[] findShortestAndLongest (String[] cities){
            if (cities == null || cities.length == 0) {
               throw new IllegalArgumentException() ;
            }
            String shortest = cities[0];
            String longest = cities[0];

            for (String city : cities) {
                if (city.length() < shortest.length()) {
                    shortest = city;
                }
                if (city.length() > shortest.length()) {
                    longest = city;
                }
            }
            return new String[]{shortest, longest};
        }
        // nachalo main
        public static void main (String[]args){

            // goroda
            String[] cities = { "Moskow", "Paris", " Sydney", "New-York", "Tokyo", "London" };
            // massiv s gorodami
            String[] result = findShortestAndLongest(cities);
            //resultat
            System.out.println(" Shortest : " + result[0]);
            System.out.println(" Longest : " + result[1]);
        }

}


