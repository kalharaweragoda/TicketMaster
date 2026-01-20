package edu.icet.repository;

import edu.icet.entity.Seat;
import edu.icet.enums.SeatStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {

    @Query("""
            SELECT r FROM Seat r
            WHERE
                r.id NOT IN (
                    SELECT b.seat.id
                    FROM Booking b
                    WHERE :checkInDate <= b.checkOutDate
                    AND b.bookingStatus IN ('BOOKED', 'CHECKED_IN')
                )
                AND (:seatType IS NULL OR r.type = :seatType)
            """)
    List<Seat> findAvailableSeats(
            @Param("checkInDate") LocalDate checkInDate,
            @Param("seatType") SeatStatus seatStatus
    );


    @Query("""
                SELECT r FROM Seat r
                WHERE CAST(r.seatNumber AS string) LIKE %:searchParam%
                   OR LOWER(r.type) LIKE LOWER(:searchParam)
                   OR CAST(r.capacity AS string) LIKE %:searchParam%
                   OR LOWER(r.description) LIKE LOWER(CONCAT('%', :searchParam, '%'))
            """)
    List<Seat> searchSeats(@Param("searchParam") String searchParam);
}
