package edu.icet.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EventDTO {
    private Long id;
    private String name;
    private Double basePrice;
    private boolean highDemand;
    private LocalDate eventDate;
}
