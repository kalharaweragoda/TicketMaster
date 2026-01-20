package edu.icet.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import edu.icet.enums.SeatStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeatDTO {
    private Long id;
    private Long eventId;
    private String seatNumber;
    private SeatStatus status;
    private Long heldByUserId;
    private LocalDateTime holdExpiry;
}
