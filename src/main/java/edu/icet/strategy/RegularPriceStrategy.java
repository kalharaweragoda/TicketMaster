package edu.icet.strategy;

import edu.icet.dto.PriceResponseDTO;
import edu.icet.entity.Event;
import edu.icet.entity.User;
import org.springframework.stereotype.Component;

@Component
public class RegularPriceStrategy implements PriceStrategy{

    @Override
    public PriceResponseDTO calculatePrice(User user, Event event) {
        return PriceResponseDTO.builder()
                .priorityAccess(false)
                .build();
    }

    @Override
    public User supportsTier() {
        return null;
    }
}
