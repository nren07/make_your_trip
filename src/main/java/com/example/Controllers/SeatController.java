package com.example.Controllers;

import com.example.RequestDto.AddFlightSeatDto;
import com.example.Services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class SeatController {

    @Autowired
    private SeatService seatService;

    @PostMapping("/addFlightSeats")
    public String addFlightSeats(AddFlightSeatDto seatDto){
        return seatService.addFlightSeats(seatDto);
    }

}