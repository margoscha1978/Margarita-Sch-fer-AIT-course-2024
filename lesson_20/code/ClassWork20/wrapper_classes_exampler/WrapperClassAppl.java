package ClassWork20.wrapper_classes_exampler;

import java.math.BigInteger;

public class WrapperClassAppl {
    public static void main(String[] args) {

        int k = 1234567890;
        System.out.println(k);
        System.out.println("-------------------");

        Integer integer = Integer.parseInt("1234567890");
        System.out.println(integer);
        System.out.println("--------------------");

        integer = integer + 5;//5 perechodin d tip int po ymolchaniju
        System.out.println(integer);
        System.out.println("---------------------");

        integer = integer + 1225;//moschno iskat max ili minimum
        System.out.println(integer);
        System.out.println("---------------------");
        //rabotaet iskljuchitelno c ziframi,bukvi zaoresceni - drugoi klass

        int value1 = 123;
        Integer a = new Integer(value1);
        System.out.println(value1);
        System.out.println("---------------------");

        //avtoupakovka
        Integer x = 5;
        System.out.println(x * 10);
        System.out.println("---------------------");

        //raspakovka
        integer = 7;
        int z = x + integer;
        System.out.println(z);
        System.out.println("----------------------");

        BigInteger myBigInt = new BigInteger("1234567890234567890");
        System.out.println(myBigInt);
        System.out.println("----------------------");

        //kolichestvo zift v haschem chisle 2 versija
        int b = 1234567890;
        Integer bInt = b;//upakovali v Intedjer
        //smena tipa na string,avtoupakovka - zavernuli
        String str = bInt.toString();
        System.out.println(str);
        System.out.println("-----------------------");
        int l = str.length();
        System.out.println("Number: " + b + " contais " + l + " digits");
        System.out.println("------------------------");

        System.out.println("Max value of int: " + bInt.MAX_VALUE);//maximalnoe prinimaemoe znachenie
        System.out.println("Min value of int: " + bInt.MIN_VALUE);//minimalnoe prinimaemoe znachenie
        System.out.println("---------------------------");

        double d = 0.0;
        System.out.println("Max value of double: " + Double.MAX_VALUE);
        System.out.println("Min value of double: " + Double.MIN_VALUE);
        System.out.println("---------------------------");

        //matematicheskie vichislenija
        int n = 20;
        Integer m = 10;
        m = m + n;
        System.out.println(m);
        n = n + m;
        System.out.println(n + 1);
        System.out.println("----------------------------");

        Double pi = 3.14;
        double circleLenth = 2 * pi * 10;
        System.out.println(circleLenth);

        System.out.printf("Lenght of cirkle: %.2f ", circleLenth);
        System.out.println();
        System.out.println("---------------------------------");

        //NaN(ne suschestvyet),Infinite
        double p = 20 / 0.0;//moschno zamenit na lujboe choslo i prozess rabotaet,esli Double s bolschoi,
        // sistema srasu predloschin NaN ili Infinite,
        // eto tip vnutri klassa,isNaN ili isInfinite budet metod

        if (Double.isNaN(p) || Double.isInfinite(p)) {
            System.out.println("Wrong operation, division by Zero ");
        } else System.out.println(p);
        System.out.println("------------------------------------------");

        //perevod iz String v number
        String str1 = "0098765432100";//ne previschat kolichestvo zifr dlja string,y vsech ostalnix znachenie ne menjaetsja
        long num = Long.parseLong(str1);
       // int num = Integer.parseInt(str1);//integer pererabativaet string
        System.out.println(num);
        System.out.println("--------------------------------------------");











    }

}//klass ende