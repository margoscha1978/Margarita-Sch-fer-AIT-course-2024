package ClassWork25.string_builder.sb_vs_string;
// 100 mal "May!"
// String vs StringBuilder,voina

public class PerformanceTest {

    private static final int N_ITERATION = 100_000;
    private static final String WORD = "May!";

    public static void main(String[] args) {

         // String
        long t1 = System.currentTimeMillis(); // sekundomer startuet
        String str = "";
        for (int i = 0; i < N_ITERATION; i++) {
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis();
        System.out.println("TimeString = " + (t2 - t1));

         // StringBuilder
        t1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < N_ITERATION; i++) {
            sb = sb.append(WORD);
        }
        t2 = System.currentTimeMillis();
        System.out.println("TimeStringBuilder = " + (t2 - t1));


    }
}
