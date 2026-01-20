package edu.icet.service.impl;

import edu.icet.dto.BookingDTO;
import edu.icet.dto.Response;
import edu.icet.entity.Booking;
import edu.icet.repository.BookingRepository;
import edu.icet.repository.SeatRepository;
import edu.icet.service.BookingService;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    private final SeatRepository seatRepository;
    private final ModelMapper modelMapper;
    private final UserService userService;

    @Override
    public Response getAllBookings() {
        return null;
    }

    @Override
    public Response createBooking(BookingDTO bookingDTO) {
        return null;
    }

    @Override
    public Response findBookingBookingByReferenceNo(String reference) {
        return null;
    }

    @Override
    public Response updateBooking(BookingDTO bookingDTO) {
        Booking booking = bookingRepository.findById(bookingDTO.getId())
                .orElseThrow(() -> new RuntimeException("Booking not found"));

        booking.setBookingStatus(bookingDTO.getBookingStatus());
        booking.setAmountPaid(bookingDTO.getAmountPaid());

        bookingRepository.save(booking);

        return Response.builder()
                .status(200)
                .message("Booking updated successfully")
                .build();
    }
    }
}
