package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.QueueItem;
import TourismBureauManagementSystem.model.Tour;

import java.util.ArrayList;
import java.util.List;

public class SimpleTourManager implements Manager<Tour> {
    private List<Tour> tours;

    public SimpleTourManager() {
        tours = new ArrayList<>();
    }

    @Override
    public void add(Tour tour) {
        tours.add(tour);
    }

    @Override
    public List<Tour> getAll() {
        return new ArrayList<>(tours); // Возвращаем копию списка
    }

}
