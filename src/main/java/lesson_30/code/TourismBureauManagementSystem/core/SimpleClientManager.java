package TourismBureauManagementSystem.core;

import TourismBureauManagementSystem.model.Client;

import java.util.ArrayList;
import java.util.List;

public class SimpleClientManager extends ClientManager implements Manager<Client> {
    private List<Client> clients;

    public SimpleClientManager() {
        clients = new ArrayList<>();
    }

    @Override
    public void add(Client client) {
        clients.add(client);
    }

    @Override
    public List<Client> getAll() {
        return new ArrayList<>(clients); // Возвращаем копию списка
    }
} // klass ended
