package homework26.dao;
//   Интерфейс Stock c методами:
//   добавить деталь на склад
//   найти деталь по barCode
//   обновить данные о детали
//   удалить деталь
//   общая масса всех деталей на складе
//   средняя масса деталей на складе

import homework26.model.Detail;

public interface Stock {
    void addDetail(Detail detail);

    Detail findDetailByBarCode(long barCode);

    void updateDetail(Detail detail);

    void removeDetail(long barCode);

    double totalWeight();

    double averageWeight();

} //klass ende