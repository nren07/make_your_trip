package com.example.RequestDto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class GetAvailableSeatsDto {

    private LocalDate journeyDate;
    private int transportId;

}
