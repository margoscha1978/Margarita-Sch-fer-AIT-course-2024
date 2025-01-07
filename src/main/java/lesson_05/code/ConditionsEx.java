public class ConditionsEx {
    public static void main(String[] args) {
// postiv.oder negativ,teilt sich durch zwei.oder nicht,voll jahrig.oder nicht...

        int x = 56;
        if (x >= 0) {
            System.out.println(" x=" + x + " positive number");
        }
        if (x < 0) {
            System.out.println("x=" + x + " is negative number");
        }
//volle funktion

            x = -234;
            if (x >= 0) {
                System.out.println(" x= " + x + "is positive number");
            } else {
                System.out.println(" x= " + x + " is negative number");
            }

            x = 111;
            if (x % 2 == 0) {
                System.out.println(" x =" + x + " is even");
            } else {
                System.out.println(" x = " + x + " is odd");

            }
            int age = 20;
            if (age >= 18) {
                System.out.println("volljarig");
            } else {
                System.out.println("nicht volljahrig");
            }
        }
    }