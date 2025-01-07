package equation.model;

public class EquationAppl {
    public static void main(String[] args) {

   //uravnenija
   QuadraticEquation eq1 = new QuadraticEquation(1, -3,2);
   QuadraticEquation eq2 = new QuadraticEquation(1, 2,1);
   QuadraticEquation eq3 = new QuadraticEquation(1, 0,1);

        // pechatem uravnenija
        System.out.println("Equation 1: ");
        eq1.display();
        System.out.println("Discriminant: " + eq1.delta());
        System.out.println("Roots of the equation: " + eq1.quantityRoots());
        System.out.println();

        System.out.println("Equation 2: ");
        eq1.display();
        System.out.println("Discriminant: " + eq2.delta());
        System.out.println("Roots of the equation: " + eq2.quantityRoots());
        System.out.println();

        System.out.println("Equation 3: ");
        eq1.display();
        System.out.println("Discriminant: " + eq3.delta());
        System.out.println("Roots of the equation: " + eq3.quantityRoots());
        System.out.println();

    }//ende main

}// ende klass
