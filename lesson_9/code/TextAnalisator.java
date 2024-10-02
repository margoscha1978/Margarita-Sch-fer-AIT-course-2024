import java.util.Scanner;

public class TextAnalisator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        // polzovatel pischet ctroku

        System.out.println(" Schreiben Sie bitte ein Texst:  ");

        String input = scanner.nextLine().trim();



        // proverjaem chto vvel polzovatel

        input = input.trim();

        if (input.isEmpty()) {

            System.out.println(" Haben Sie nicht geschrieben?");

            return;// programma ne rabotaet

        }

        // delim na clova

        String[] words = input.split(" ");



        // schitaem bukvi i clova bes probelow

        int wordCount = words.length;

        int letterCount = 0;



        for (String word : words) {

            letterCount += word.length();

        }

        //perevorot ctroki



        StringBuilder reversed = new StringBuilder();

        for (int i = wordCount - 1; i >= 0; i--) {

            reversed.append(words[i]);



            if ( i > 0) {

                reversed.append(" ");

            }



            // probuem .proverjaem



            System.out.println(" Wörter " + wordCount);

            System.out.println(" Buchschtaben " + letterCount);

            System.out.println(" Revers " + reversed);

        }

    }

}




















