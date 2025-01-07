package homework26.dao;

import homework26.model.Detail;

import java.util.ArrayList;
import java.util.List;

public class StockImpl implements Stock {
    private List<Detail> details = new ArrayList<>();

    @Override
    public void addDetail(Detail detail) {
        details.add(detail);
    }

    @Override
    public Detail findDetailByBarCode(long barCode) {
        for (Detail detail : details) {
            if (detail.getBarCode() == barCode) {
                return detail;
            }
        }
        return null;
    }

    @Override
    public void updateDetail(Detail detail) {
        // Обновление логики
        Detail existingDetail = findDetailByBarCode(detail.getBarCode());
        if (existingDetail != null) {
        // Обновление полей если нужно
        }
    }

    @Override
    public void removeDetail(long barCode) {
        details.removeIf(detail -> detail.getBarCode() == barCode);
    }

    @Override
    public double totalWeight() {
        return details.stream().mapToDouble(detail -> detail.getWeight() ).sum();
    }

    @Override
    public double averageWeight() {
        return details.isEmpty() ? 0 : totalWeight() / details.size();
    }

}//klass ende
