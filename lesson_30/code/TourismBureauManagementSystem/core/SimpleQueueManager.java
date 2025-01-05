package TourismBureauManagementSystem.core;

import java.util.ArrayList;
import java.util.List;

public class SimpleQueueManager<T> implements Manager<T> {
    private List<T> queueItems;

    public SimpleQueueManager() {
        queueItems = new ArrayList<>();
    }

    @Override
    public void add(T queueItem) {
        queueItems.add(queueItem);
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(queueItems); // Возвращаем копию списка
    }
}
