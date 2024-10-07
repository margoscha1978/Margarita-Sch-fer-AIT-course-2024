package homework17;
//**Задача 2(*).**
//Написать программу, определяющую, является ли год високосным. Значение года задается в программе или вводится пользователем с клавиатуры.
//Для того чтобы год был високосным, он должен:
// делится без остатка на 4 и, либо не должен делится без остатка на 100, либо если он делится на 100,
// то он должен делится также на 400.
// Проверить на годах 1700, 1800, 1900 - не високосные, а 2000 високосный.

import java.util.Scanner;
public class LeapYearCheker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        //proverka na visokosnii god
        boolean isLeapYear = false;
        if ((year % 4 == 0 &&  year % 100 != 0) || (year % 400 == 0)){
                 isLeapYear = true ;
        }
        //resultat
        if (isLeapYear){
            System.out.println(year + " Leap year");
        } else {
            System.out.println(year + "No leap year");
        }

    }
}
