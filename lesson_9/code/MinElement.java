public class MinElement {
    public static void main(String[] args) {

//massiv.vozrast studentov i nadem samogo molodogo

        int[] ages = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 43};

        int max = ages[0];
        int min = ages[0];
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < min) { //esli est kto to mensche,to on budet minimum
                min = ages[i];
            }

            if (ages[i] > max) { // vnutri massiva odna chasti ichodnix dannix,rabotat po formule s kachdim
                max = ages[i];
            }

        }
        System.out.println(" Max age = " + max);
        System.out.println(" Min age = " + min);
    }

}



