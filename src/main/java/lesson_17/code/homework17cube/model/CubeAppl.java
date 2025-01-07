package homework17cube.model;

public class CubeAppl {
    public static void main(String[] args) {

        //parametr a
        Cube cube1 = new Cube(3.2);
        Cube cube2 = new Cube(4.5);
        Cube cube3 = new Cube(2.7);

        //massiv kubov
        Cube[] cubes = {cube1, cube2, cube3};
        //schitaem p,s,v
        for (Cube cube : cubes) {
            System.out.printf("Side cube: %.2f ",cube.side);
            System.out.printf("Perimeter: %.2f ",cube.calkulatePerimeter());
            System.out.printf("Area: %.2f ",cube.calculateSurfaceArea());
            System.out.printf("Volume: %.2f ",cube.calculateVolume());
            System.out.println();

        }
    }
}