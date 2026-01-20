package edu.icet.strategy;

import edu.icet.dto.PriceResponseDTO;
import edu.icet.entity.Event;
import edu.icet.entity.User;

public class PlatinumPriceStrategy implements PriceStrategy{
    @Override
    public PriceResponseDTO calculatePrice(User user, Event event) {
        return PriceResponseDTO.builder()
                .finalPrice(event.getBasePrice())
                .priorityAccess(true)
                .build();
    }

    @Override
    public User supportsTier() {
        return null;
    }
}
