package edu.icet.service.impl;

import edu.icet.dto.PriceResponseDTO;
import edu.icet.entity.Event;
import edu.icet.entity.User;
import edu.icet.strategy.PriceStrategy;
import org.springframework.stereotype.Service;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Service
public class PriceCalculatorService {

    private final Map<User, PriceStrategy> strategyMap = new EnumMap<>(User.class);

    public PriceCalculatorService(List<PriceStrategy> strategies) {
        for (PriceStrategy strategy : strategies) {
            strategyMap.put(strategy.supportsTier(), strategy);
        }
    }

    public PriceResponseDTO calculate(User user, Event event) {

        PriceStrategy strategy = strategyMap.get(user.getTier());

        if (strategy == null) {
            throw new IllegalStateException("No pricing strategy for tier: " + user.getTier());
        }

        return strategy.calculatePrice(user, event);
    }
}
