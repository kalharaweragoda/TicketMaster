package edu.icet.controller;

import edu.icet.dto.Response;
import edu.icet.dto.SeatDTO;
import edu.icet.enums.SeatStatus;
import edu.icet.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/seats")
public class SeatController {

    private final SeatService seatService;

    @PostMapping("/{id}/hold")
    public String holdSeat(
            @PathVariable("id") Long seatId,
            @RequestParam Long userId) {

        seatService.holdSeat(seatId, userId);
        return "Seat held successfully for 10 minutes";
    }

    @PostMapping("/add")
    public ResponseEntity<Response> addSeat(
            @RequestParam Integer SeatNumber,
            @RequestParam SeatStatus seatStatus
    ){
        return null;
    }

    @PutMapping("/update")
    public ResponseEntity<Response> updateSeat(
            @RequestParam (value = "type", required = false)  SeatStatus status,
            @RequestParam (value = "id", required = true) Long id
    ){
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<Response> getAllSeats(){
        return ResponseEntity.ok(seatService.getAllSeats());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Response> deleteSeats(@PathVariable Long id){
        return ResponseEntity.ok(seatService.deleteSeat(id));
    }

    @GetMapping("/available")
    public ResponseEntity<Response> deleteSeat(
            @RequestParam LocalDate checkInDate,
            @RequestParam LocalDate checkOutDate,
            @RequestParam (required = false) SeatStatus seatStatus
    ){
        return ResponseEntity.ok(seatService.getAvailableSeats(checkInDate, checkOutDate, seatStatus));
    }

    @GetMapping("/types")
    public ResponseEntity<List<SeatStatus>> getAllSeatStatus(){
        return ResponseEntity.ok(SeatService.getAllSeatStatus());
    }

    @GetMapping("/search")
    public ResponseEntity<Response> searchSeat(@RequestParam String input){
        return ResponseEntity.ok(seatService.searchSeat(input));
    }


}
