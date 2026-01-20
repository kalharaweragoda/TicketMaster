package edu.icet.service.impl;

import edu.icet.dto.Response;
import edu.icet.enums.SeatStatus;
import edu.icet.service.SeatService;

import java.time.LocalDate;

public class SeatServiceImpl implements SeatService {

    @Override
    public Response getAllSeats() {
        return null;
    }

    @Override
    public Response deleteSeat(Long id) {
        return null;
    }

    @Override
    public Response getAvailableSeats(LocalDate checkInDate, LocalDate checkOutDate, SeatStatus seatStatus) {
        return null;
    }

    @Override
    public Response searchSeat(String input) {
        return null;
    }
}
