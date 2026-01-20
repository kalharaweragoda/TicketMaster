package edu.icet.strategy;

import edu.icet.dto.PriceResponseDTO;
import edu.icet.entity.Event;
import edu.icet.entity.User;

public interface PriceStrategy {
    PriceResponseDTO calculatePrice(User user, Event event);
    User supportsTier();
}
