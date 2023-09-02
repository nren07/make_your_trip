package com.example.Transformers;

import com.example.Models.*;
import com.example.RequestDto.BookingRequest;

public class BookingTransformers {

    public static Booking convertRequestToEntity(BookingRequest bookingRequest){

        Booking bookingObj = Booking.builder().journeyDate(bookingRequest.getJourneyDate())
                .seatNos(bookingRequest.getSeatNos())
                .transportId(bookingRequest.getTransportId())
                .build();

        return bookingObj;
    }
}
