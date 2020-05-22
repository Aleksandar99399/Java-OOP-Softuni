package src.WorkshopLab.domain.repositoty;

import src.WorkshopLab.domain.entity.Money;

import java.util.List;

public interface ConversionHistoryRepository {
    List<String> getLast(int n);

    void save(Money from, Money to);
}
