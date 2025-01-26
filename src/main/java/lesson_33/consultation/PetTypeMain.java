package lesson_33.consultation;

import java.util.Scanner;

public class PetTypeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип домашнего животного (DOG, CAT, HAMSTER, PARROT, FISH):");
        String inputPetType = scanner.nextLine().toUpperCase(); //dog-->DOG
        try {
            PetType selectedPetType = PetType.valueOf(inputPetType);
            System.out.println("Вы выбрали: " + selectedPetType.getDescription());
            System.out.println("Характеристики:");
            switch (selectedPetType) {
                case DOG:
                    System.out.println(PetCharacteristics.FRIENDLY.getDescription());
                    break;
                case CAT:
                    System.out.println(PetCharacteristics.INDEPENDENT.getDescription());
                    break;
                case HAMSTER:
                    System.out.println(PetCharacteristics.CRAZY.getDescription());
                    break;
                case PARROT:
                    System.out.println(PetCharacteristics.LOUD.getDescription());
                    break;
                case FISH:
                    System.out.println(PetCharacteristics.QUIET.getDescription());
                    break;
                default:
                    System.out.println("Неизвестное животное !!!!");
            }
        } catch (IllegalArgumentException exception) {
            System.out.println("Ошибка !!!!. Данного типа среди домашних животных нет. " + inputPetType);
            scanner.close();
        }

        /*for(PetType petType : PetType.values()){
            System.out.println(petType + " --> " + petType.getDescription());
        }*/
    }

} // klass ended
