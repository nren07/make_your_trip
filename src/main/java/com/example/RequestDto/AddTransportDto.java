package com.example.RequestDto;

import com.example.Enums.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class AddTransportDto {

    private ModeOfTransport modeOfTransport;
    private LocalDate journeyDate;
    private LocalTime startTime;
    private double journeyTime;
    private Integer routeId;
    private String companyName;

}
