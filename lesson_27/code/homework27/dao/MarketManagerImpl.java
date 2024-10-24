package homework27.dao;

import homework27.model.*;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MarketManagerImpl implements MarketManager {
    private List<Produkt> products;

    public MarketManagerImpl() {
        products = new ArrayList<>();
    }

    @Override
    public void addProduct(Produkt product) {
        products.add(product);
    }

    @Override
    public void removeProduct(int productId) {
        products.removeIf(product -> product.getPrime() == productId);
    }

    @Override
    public Produkt findProductById(int productId) {
        return products.stream()
                .filter(product -> product.getPrime() == productId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Produkt> getProducts() {
        return new ArrayList<>(products); // Возвращаем копию списка продуктов
    }

    @Override
    public List<Produkt> findProductsByExpirationDate(String expDate) {
        return products.stream()
                .filter(product -> product.getExpDate().compareTo(expDate) < 0)
                .collect(Collectors.toList());
    }

    @Override
    public double calculateTotalPrice() {
        return products.stream().mapToDouble(Produkt::getPrice).sum();
    }

    @Override
    public double calculateAveragePrice() {
        return products.size() > 0 ? calculateTotalPrice() / products.size() : 0;
    }

    @Override
    public List<Produkt> getProdukts() {
        return List.of();
    }
}
