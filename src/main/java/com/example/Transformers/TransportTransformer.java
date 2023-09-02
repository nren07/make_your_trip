package com.example.Transformers;

import com.example.Models.Transport;
import com.example.RequestDto.AddTransportDto;
import com.example.ResponseDtos.FlightResult;

public class TransportTransformer {

    public static Transport convertDtoToEntity(AddTransportDto addTransportDto){

        Transport transportObj = Transport.builder()
                .modeOfTransport(addTransportDto.getModeOfTransport())
                .journeyDate(addTransportDto.getJourneyDate())
                .journeyTime(addTransportDto.getJourneyTime())
                .startTime(addTransportDto.getStartTime())
                .companyName(addTransportDto.getCompanyName())
                .build();

        return transportObj;

    }

    public static FlightResult convertEntityToFlightResult(Transport transport){

        return FlightResult.builder().journeyDate(transport.getJourneyDate()).journeyTime(transport.getJourneyTime())
                .startTime(transport.getStartTime()).companyName(transport.getCompanyName()).build();

    }

}
