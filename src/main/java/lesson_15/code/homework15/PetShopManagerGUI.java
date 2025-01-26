
 /*
package homework15;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class PetShopManagerGUI extends Application {
    private ArrayList<String> products = new ArrayList<>();
    private ListView<String> listView = new ListView<>();
    private TextField productInput = new TextField();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Зоомагазин: Управление товарами");

        // Настройка поля для ввода товара
        productInput.setPromptText("Введите название товара");

        // Настройка кнопок с действиями
        Button addButton = new Button("Добавить");
        addButton.setOnAction(e -> addProduct());

        Button removeButton = new Button("Удалить");
        removeButton.setOnAction(e -> removeProduct());

        Button searchButton = new Button("Найти");
        searchButton.setOnAction(e -> searchProduct());

        Button updateButton = new Button("Обновить");
        updateButton.setOnAction(e -> updateProduct());

        Button sortButton = new Button("Сортировать");
        sortButton.setOnAction(e -> sortProducts());

        Button clearButton = new Button("Очистить список");
        clearButton.setOnAction(e -> clearProducts());

        // Настройка расположения элементов на экране
        HBox inputBox = new HBox(10, productInput, addButton, searchButton, updateButton);
        inputBox.setPadding(new Insets(10));

        HBox controlBox = new HBox(10, removeButton, sortButton, clearButton);
        controlBox.setPadding(new Insets(10));

        VBox root = new VBox(10, inputBox, controlBox, listView);
        root.setPadding(new Insets(10));

        // Обновление списка товаров
        updateListView();

        // Настройка сцены
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Метод добавления товара
    private void addProduct() {
        String name = productInput.getText().trim();
        if (!name.isEmpty()) {
            products.add(name);
            updateListView();
            productInput.clear();
            showAlert("Товар добавлен: " + name);
        } else {
            showAlert("Введите название товара.");
        }
    }

    // Метод удаления товара
    private void removeProduct() {
        String selectedProduct = listView.getSelectionModel().getSelectedItem();
        if (selectedProduct != null) {
            products.remove(selectedProduct);
            updateListView();
            showAlert("Товар удален: " + selectedProduct);
        } else {
            showAlert("Выберите товар для удаления.");
        }
    }

    // Метод поиска товара
    private void searchProduct() {
        String name = productInput.getText().trim();
        if (!name.isEmpty()) {
            if (products.contains(name)) {
                listView.getSelectionModel().select(name);
                showAlert("Товар найден: " + name);
            } else {
                showAlert("Товар не найден.");
            }
        } else {
            showAlert("Введите название товара для поиска.");
        }
    }

    // Метод обновления товара
    private void updateProduct() {
        String selectedProduct = listView.getSelectionModel().getSelectedItem();
        String newName = productInput.getText().trim();
        if (selectedProduct != null && !newName.isEmpty()) {
            int index = products.indexOf(selectedProduct);
            products.set(index, newName);
            updateListView();
            productInput.clear();
            showAlert("Товар обновлен: " + selectedProduct + " -> " + newName);
        } else {
            showAlert("Выберите товар и введите новое название для обновления.");
        }
    }

    // Метод сортировки товаров
    private void sortProducts() {
        Collections.sort(products);
        updateListView();
        showAlert("Список товаров отсортирован.");
    }

    // Метод очистки списка товаров
    private void clearProducts() {
        products.clear();
        updateListView();
        showAlert("Список товаров очищен.");
    }

    // Метод обновления отображения списка товаров
    private void updateListView() {
        listView.getItems().setAll(products);
    }

    // Метод для отображения сообщений
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Информация");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

} // klass ended

*/
