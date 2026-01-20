package edu.icet.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "seat_id", nullable = false)
    private int seatId;

    @Column(name = "amount_paid", nullable = false)
    private double amountPaid;

    @Column(nullable = false)
    private String status;

//  @Enumerated(EnumType.STRING)
//  private PaymentStatus paymentStatus;


//  private String bookingReference;

//  @Enumerated(EnumType.STRING)
//  private BookingStatus bookingStatus;
}
