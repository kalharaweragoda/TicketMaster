package edu.icet.service;

import edu.icet.dto.BookingDTO;
import edu.icet.dto.Response;

public interface BookingService {
    Response getAllBookings();

    Response createBooking(BookingDTO bookingDTO);

    Response findBookingBookingByReferenceNo(String reference);

    Response updateBooking(BookingDTO bookingDTO);
}
