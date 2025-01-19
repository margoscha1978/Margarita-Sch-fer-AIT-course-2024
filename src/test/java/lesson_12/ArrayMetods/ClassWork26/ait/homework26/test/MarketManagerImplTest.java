package lesson_12.ArrayMetods.ClassWork26.ait.homework26.test;
import homework27.dao.MarketManagerImpl;
import homework27.model.MeatFood;
import homework27.model.MilkFood;
import homework27.model.Produkt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MarketManagerImplTest {

    private MarketManagerImpl manager;

    @BeforeEach
    public void setUp() {
        manager = new MarketManagerImpl();

        // Добавление тестовых продуктов
        manager.addProduct(new MeatFood(1, "Beef", "1234567890123", "2023-12-01", "Meat", 10.5));
        manager.addProduct(new MilkFood(2, "Whole Milk", "1234567890124", "2024-01-15", "Dairy", 2.0));
        manager.addProduct(new MeatFood(3, "Chicken", "1234567890125", "2023-11-30", "Meat", 7.5));
        manager.addProduct(new MilkFood(4, "Skim Milk", "1234567890126", "2024-05-01", "Dairy", 1.5));
    }

    @Test
    public void testAddProduct() {
        int initialSize = manager.getProducts().size();
        manager.addProduct(new MeatFood(5, "Pork", "1234567890127", "2023-10-01", "Meat", 8.0));
        assertEquals(initialSize + 1, manager.getProducts().size());
    }

    @Test
    public void testRemoveProduct() {
        manager.removeProduct(1);
        assertNull(manager.findProductById(1));
        assertEquals(3, manager.getProducts().size());
    }

    @Test
    public void testCalculateTotalPrice() {
        double total = manager.calculateTotalPrice();
        assertEquals(21.5, total, 0.01); // 10.5 + 2.0 + 7.5 + 1.5
    }

    @Test
    public void testCalculateAveragePrice() {
        double average = manager.calculateAveragePrice();
        assertEquals(5.375, average, 0.01); // 21.5 / 4
    }

    @Test
    public void testFindProductById() {
        Produkt product = manager.findProductById(2);
        assertNotNull(product);
        assertEquals("Whole Milk", product.getName());
    }

    @Test
    public void testFindProductsByExpirationDate() {
        List<Produkt> expiredProducts = manager.findProductsByExpirationDate("2023-12-01");
        assertEquals(1, expiredProducts.size()); // Ожидаем 2 просроченных продукта
    }
}
