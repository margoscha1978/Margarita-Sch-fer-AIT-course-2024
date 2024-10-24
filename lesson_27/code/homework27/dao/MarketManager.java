package homework27.dao;

import homework27.model.Produkt;

import java.util.List;

    public interface MarketManager {
        void addProduct(Produkt product);
        void removeProduct(int productId);
        Produkt findProductById(int productId);

        List<Produkt> getProducts();

        List<Produkt> findProductsByExpirationDate(String expDate);
        double calculateTotalPrice();
        double calculateAveragePrice();
        List<Produkt>getProdukts();
}
