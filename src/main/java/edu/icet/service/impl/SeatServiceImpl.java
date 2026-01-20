package edu.icet.service.impl;

import edu.icet.dto.Response;
import edu.icet.entity.Seat;
import edu.icet.enums.SeatStatus;
import edu.icet.repository.SeatRepository;
import edu.icet.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
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

    @Override
    public void holdSeat(Long seatId, Long userId) {

        Seat seat = SeatRepository.findByIdForUpdate(seatId)
                .orElseThrow(() -> new RuntimeException("Seat not found"));

        LocalDateTime now = LocalDateTime.now();

        if (seat.getStatus() == SeatStatus.AVAILABLE) {
            lockSeat(seat, userId, now);
            return;
        }

        if (seat.getStatus() == SeatStatus.HELD) {

            if (seat.getHoldExpiry().isBefore(now)) {
                lockSeat(seat, userId, now);
                return;
            }

            long remainingSeconds =
                    Duration.between(now, seat.getHoldExpiry()).getSeconds();

        }

        throw new RuntimeException("Seat already sold");
    }

    private void lockSeat(Seat seat, Long userId, LocalDateTime now) {
        seat.setStatus(SeatStatus.HELD);
        seat.setHoldExpiry(now.plusMinutes(10));
        SeatRepository.save(seat);
    }
    }
}
