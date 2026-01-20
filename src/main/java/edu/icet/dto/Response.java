package edu.icet.dto;

import java.util.List;

public class Response {

    private UserDTO user;
    private List<UserDTO> users;

    private int status;
    private String message;

    private BookingDTO booking;
    private List<BookingDTO> bookings;

    private SeatDTO seat;
    private List<SeatDTO> seats;
}
