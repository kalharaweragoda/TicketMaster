package edu.icet.strategy;

import edu.icet.dto.PriceResponseDTO;
import edu.icet.dto.UserDTO;
import edu.icet.entity.Event;
import edu.icet.entity.User;
import edu.icet.enums.UserTire;
import org.springframework.stereotype.Component;

@Component
public class VipPriceStrategy implements PriceStrategy{


    @Override
    public PriceResponseDTO calculatePrice(User user, Event event) {
        double price = event.getPrice();

        return PriceResponseDTO.builder()
                .finalPrice(price)
                .priorityAccess(false)
                .build();
    }

    @Override
    public User supportsTier() {
        return UserTire.VIP;
    }
}
