package edu.icet.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDTO {
    private int id;
    private UserDTO user;
    private SeatDTO seatId;
    private double amountPaid;
    private String status;

    //private PaymentStatus paymentStatus;
    //private String bookingReference;
    //private BookingStatus bookingStatus;

}
