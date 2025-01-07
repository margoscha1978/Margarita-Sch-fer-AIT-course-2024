package lesson_12.ArrayMetods.homework23.Checker;

import org.junit.jupiter.api.Test;

import static homework23.Checker.PrimeChecker.isPrime;

class PrimeCheckerTest {

    @Test
    public void main(){
        // Тестирование метода isPrime с использованием assert
        assert isPrime(2) : "2 должен быть простым";
        assert isPrime(3) : "3 должен быть простым";
        assert isPrime(5) : "5 должен быть простым";
        assert !isPrime(4) : "4 не должен быть простым";
        assert !isPrime(1) : "1 не должен быть простым";
        assert isPrime(13) : "13 должен быть простым";
        assert !isPrime(15) : "15 не должен быть простым";
        assert isPrime(29) : "29 должен быть простым";

        System.out.println("Все тесты пройдены!");
    }
}