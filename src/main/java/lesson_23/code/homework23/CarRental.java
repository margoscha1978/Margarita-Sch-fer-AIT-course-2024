package homework23;
// Семья планирует поехать в отпуск в Италию из Германии и покрыть порядка 3000 км.
// Имеется информация о 5 автомобилях на жидком топливе (бензин или дизтопливо):
// марка автомобиля: Audi, BMW, Opel, VW, Mercedes.
// расход топлива: d, b, d, d, b
// стоимость 1 литра топлива: d - 1.6, b - 1.8
// расход на 100 км пути: 6.6, 6.8, 6.9, 6.5, 6.3
// стоимость недельной аренды автомобиля: 45, 49, 45, 39, 49 Какой автомобиль ей следует выбрать, исходя из минимальной стоимости?

public class CarRental {
        public static void main(String[] args) {
            // Данные об автомобилях
            String[] carBrands = {"Audi", "BMW", "Opel", "VW", "Mercedes"};
            char[] fuelTypes = {'d', 'b', 'd', 'd', 'b'}; // 'd' - дизель, 'b' - бензин
            double[] fuelCosts = {1.6, 1.8}; // Стоимость 1 литра топлива
            double[] fuelConsumptions = {6.6, 6.8, 6.9, 6.5, 6.3}; // Расход на 100 км
            double[] rentalCosts = {45, 49, 45, 39, 49}; // Стоимость аренды за неделю

            double distance = 3000; // Расстояние в км
            int rentalDuration = 1; // Продолжительность аренды в неделях
            double[] totalCosts = new double[carBrands.length];

            // Рассчёт стоимости для каждого автомобиля
            for (int i = 0; i < carBrands.length; i++) {
                double consumption = fuelConsumptions[i];
                double fuelCost = fuelTypes[i] == 'd' ? fuelCosts[0] : fuelCosts[1];

                // Расход топлива на всю поездку
                double totalFuelConsumption = (consumption / 100) * distance;
                // Общая стоимость топлива
                double totalFuelCost = totalFuelConsumption * fuelCost;
                // Общая стоимость аренды
                double totalRentalCost = rentalCosts[i] * rentalDuration;

                // Общая стоимость
                totalCosts[i] = totalFuelCost + totalRentalCost;
            }

            // Определение самого экономичного автомобиля
            double minCost = totalCosts[0];
            String bestCar = carBrands[0];
            for (int i = 1; i < totalCosts.length; i++) {
                if (totalCosts[i] < minCost) {
                    minCost = totalCosts[i];
                    bestCar = carBrands[i];
                }
            }

            // Вывод результата
            System.out.printf("Самый экономичный автомобиль для аренды: %s с общей стоимостью: %.2f €%n", bestCar, minCost);
        }
    }


