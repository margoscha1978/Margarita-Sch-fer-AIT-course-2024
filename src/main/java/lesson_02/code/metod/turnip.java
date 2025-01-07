package metod;

public class turnip {

    public static void main(String[] args) {

        planted();
        ententainer();
        pullOut();
    }
    public static void planted(){
        System.out.println("grandfater plantedt a turnip");
    }
public static void pullOut(){
    System.out.println("Pulled out a turnip");
}
public static void ententainer(){
        turnip();
        grandfater();
        grandmother();
        grandchildren();
        pets();
        mouse();

}

public static void turnip(){
    System.out.println("the turnip has grow");
}
public static void grandfater(){
    System.out.println("grandfater pulls and calls grandmother");
}
public static void grandmother(){
        System.out.println("grandmother pulls and calls grandchildren");
    }
public static void grandchildren(){
        System.out.println("grandchildren pulls and call pets");
    }
public static void pets(){
        System.out.println("pets pulls and call mouse");
    }
public static void mouse(){
        System.out.println("mouse pulls");
    }

} // klass ended
