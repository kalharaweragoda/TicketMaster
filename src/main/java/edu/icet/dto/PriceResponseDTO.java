package edu.icet.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PriceResponseDTO {
    private double finalPrice;
    private boolean priorityAccess;
}
