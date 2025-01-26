package lesson_33.homework33;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
3. Класс GiftManager: Управляет списком подарков, предоставляет методы для добавления подарков,
 фильтрации по категориям и обновления статусов. Сохраним список подарков в виде ArrayList<Gift>.
 Реализуем методы:
 - addGift(Gift gift) — добавляет подарок в список.
 - filterByCategory(GiftCategory category) — возвращает список подарков по указанной категории.
 - updateGiftStatus(String giftName, GiftStatus newStatus) — обновляет статус подарка по его имени.
 */

public class GiftManager {
    private List<Gift> gifts; // Список подарков

    public GiftManager() {
        gifts = new ArrayList<>();
    }

    // Метод для добавления подарка в список
    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    // Метод для фильтрации подарков по категории
    public List<Gift> filterByCategory(GiftCategory category) {
        return gifts.stream()
                .filter(gift -> gift.getCategory() == category)
                .collect(Collectors.toList());
    }

    // Метод для обновления статуса подарка по его имени
    public void updateGiftStatus(String giftName, GiftStatus newStatus) {
        for (Gift gift : gifts) {
            if (gift.getName().equalsIgnoreCase(giftName)) {
                gift.setStatus(newStatus);
                break;
            }
        }
    }

    // Метод для получения списка всех подарков
    public List<Gift> getAllGifts() {
        return new ArrayList<>(gifts);
    }

} // klass ended
