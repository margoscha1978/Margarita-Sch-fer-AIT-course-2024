package ClassWork26.ait.homework26.test;

import homework26.dao.Stock;
import homework26.dao.StockImpl;
import homework26.model.Gear;
import homework26.model.Lever;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StockImplTest {

//добавление детали
    @Test
    public void testAddDetail() {
        Stock stock = new StockImpl();
        Gear gear = new Gear(123456L,2.5,"metals",20,25) ;
        stock.addDetail(gear);
        assertEquals(gear, stock.findDetailByBarCode(123456)); // Проверьте добавление
    }

//поиск детали по штрих-коду
    @Test
    public void testFindDetailByBarCode() {
        Stock stock = new StockImpl();
        Gear gear = new Gear(123456L,2.5,"metals",20,25);
        stock.addDetail(gear);
        assertNotNull(stock.findDetailByBarCode(123456)); // Проверка, что деталь найдена
        assertNull(stock.findDetailByBarCode(654321)); // Проверка, что не найдена деталь
    }
// обновление детали
    @Test
    public void testUpdateDetail() {
        Stock stock = new StockImpl();
        Gear gear = new Gear(123456L,2.5,"metals",20,25);
        stock.addDetail(gear);
        gear.setWeight(2.0); // Обновляем массу
        stock.updateDetail(gear);
        assertEquals(2.0, stock.findDetailByBarCode(123456).getWeight()); // Проверка обновления
    }
// удаление детали
    @Test
    public void testRemoveDetail() {
        Stock stock = new StockImpl();
        Gear gear = new Gear(123456L,2.5,"metals",20,25);
        stock.addDetail(gear);
        stock.removeDetail(123456);
        assertNull(stock.findDetailByBarCode(123456)); // Проверка, что деталь удалена
    }

// общую массу
    @Test
    public void testTotalWeight() {
        Stock stock = new StockImpl();
        stock.addDetail(new Gear(123456L,2.5,"metals",20,25));
        stock.addDetail(new Lever(654321L, 2.0, "steel", 20, 2.5, 100));
        assertEquals(3.5, stock.totalWeight()); // Проверка на общую массу
    }

// среднюю массу
    @Test
    public void testAverageWeight() {
        Stock stock = new StockImpl();
        stock.addDetail(new Gear(123456L,2.5,"metals",20,25));
        stock.addDetail(new Lever(654321L, 2.0, "steel", 20, 2.5, 100));
        assertEquals(1.75, stock.averageWeight()); // Проверка средней массы
    }
// если деталей нет в складе
    @Test
    public void testZeroTotalWeight() {
        Stock stock = new StockImpl();
        assertEquals(0, stock.totalWeight()); // Проверка при пустом складе


    }
} //klass ende

// Объяснение тестов
// - assertEquals:Проверяет, равны ли два значения.
// - assertNotNull:Проверяет, что объект не равен "null"
// - assertNull:Проверяет, что объект равен "null"

