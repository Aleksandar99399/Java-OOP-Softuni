package src.WorkshopLab.external;

import src.WorkshopLab.domain.entity.Money;
import src.WorkshopLab.domain.external.ExchangeService;

import java.math.BigDecimal;

public class StubbedExchangeService implements ExchangeService {
    @Override
    public Money exchange(Money from, String toCurrency) {
        return new Money(BigDecimal.ONE,"USD");
    }
}
