package src.WorkshopLab.domain.external;

import src.WorkshopLab.domain.entity.Money;

public interface ExchangeService {

    Money exchange(Money from, String toCurrency);

}
