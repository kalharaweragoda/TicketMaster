package edu.icet.service;

import edu.icet.dto.Response;
import edu.icet.enums.SeatStatus;

import java.time.LocalDate;
import java.util.List;

public interface SeatService {

    Response getAllSeats();
    Response deleteSeat(Long id);
    Response getAvailableSeats(LocalDate checkInDate, LocalDate checkOutDate, SeatStatus seatStatus);
}
