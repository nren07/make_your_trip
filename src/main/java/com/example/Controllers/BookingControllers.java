package com.example.Controllers;
import com.example.RequestDto.BookingRequest;
import com.example.RequestDto.GetAvailableSeatsDto;
import com.example.ResponseDtos.AvailableSeatResponseDto;
import com.example.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/booking")
public class BookingControllers {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/getAvailableSeats")
    public ResponseEntity getAvailableSeats(@RequestBody GetAvailableSeatsDto getAvailableSeatsDto){

        List<AvailableSeatResponseDto> result = bookingService.getAvailableSeatsResponse(getAvailableSeatsDto);
        return new ResponseEntity(result, HttpStatus.OK);

    }

    @PostMapping("/bookFlight")
    public ResponseEntity bookFlight(@RequestBody BookingRequest bookingRequest){

        return null;
    }




}
