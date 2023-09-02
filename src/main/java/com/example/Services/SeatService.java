package com.example.Services;

import com.example.Enums.SeatType;
import com.example.Models.Seat;
import com.example.Models.Transport;
import com.example.Repositories.SeatRepository;
import com.example.Repositories.TransportRepository;
import com.example.RequestDto.AddFlightSeatDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {

    @Autowired
    private TransportRepository transportRepository;

    @Autowired
    private SeatRepository seatRepository;

    public String addFlightSeats(AddFlightSeatDto seatDto){

        Transport transport = transportRepository.findById(seatDto.getTransportId()).get();

        //assign no to seats by creating seatobject
        for(int i=1;i<= seatDto.getNoOfEconomySeats();i++){

            Seat seat = Seat.builder().seatNo("E"+i)
                    .seatType(SeatType.ECONOMY)
                    .price(seatDto.getPriceOfEconomySeat())
                    .transport(transport)
                    .build();


            //Bcz of bidirectional setting in the parent class also
            transport.getSeatList().add(seat);
        }

        for(int i=1;i<=seatDto.getNoOfBusinessSeats();i++){

            Seat seat = Seat.builder().seatNo(String.valueOf("B"+i))
                    .seatType(SeatType.BUSINESS)
                    .price(seatDto.getPriceOfBusinessSeat())
                    .transport(transport)
                    .build();

            //Bcz of bidirectional setting in the parent class also
            transport.getSeatList().add(seat);

        }
        transportRepository.save(transport);
        return "Defined seats have been added";
    }
}
