package homework23;
//Семья планирует поехать в отпуск в Италию из Германии и покрыть порядка 3000 км.
// Имеется информация о 5 автомобилях на жидком топливе (бензин или дизтопливо):
//марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
//тип расходуемого топлива: d, b, d, d, b
//стоимость 1 литра топлива: d - 1.6, b - 1.8
//расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
//стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49 Какой автомобиль ей следует выбрать,
// исходя из минимальной стоимости?

public class CarAppl {
    public static void main(String[] args) {

        Car[] cars = new Car[5]; //создаем массив машин

        cars[0] = new Car("Audi",false,1.6,6.6,45);
        cars[1] = new Car("BMW",true,1.8,6.8,49);
        cars[2] = new Car("Opel",false,1.6,6.9,45);
        cars[3] = new Car("VW",false,1.6,6.5,39);
        cars[4] = new Car("Mercedes",true,1.8,6.3,49);

        int distance = 3000; //общая дистанция
        int numberOfTravelDays = distance/200; //допустим, что за день будет проезжаться 200 км

        //общая стоимость эксплуатации каждой машины и помещение этих данных в массив totalCosts
        double[] totalCosts = new double[cars.length];
        for (int i = 0; i < cars.length; i++) {
            totalCosts[i] = cars[i].calculateTotalOperatingCost(distance, numberOfTravelDays);
        }

        // определяем индекс самой выгодной машины
        int BestChoiceIndex = indexOfBestChoice(totalCosts);

        // печатаем самую выгодную машину
        System.out.println("Для поездки выгоднее всего арендовать машину: " + cars[BestChoiceIndex].getBrand() +
                ", " +  "стоимость: " + Math.round(totalCosts[BestChoiceIndex]) + " евро");

    }//end of main

    private static int indexOfBestChoice(double[] totalCosts) {
        double minCost = totalCosts[0]; // записываем минимальное значение для дальнейшего сравнивания
        int index = 0; // записываем индекс минимального значения,
        // чтобы по нему потом найти машину в массиве машин

        for (int i = 1; i < totalCosts.length; i++) {
            if (totalCosts[i] < minCost) {
                minCost = totalCosts[i];
                index = i;
            }
        }
        return index;
    }
}
