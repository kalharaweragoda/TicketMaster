package edu.icet.dto;

import edu.icet.entity.Event;
import edu.icet.entity.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PricingRequestDTO {
    private User user;
    private Event event;
}
