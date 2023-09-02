package com.example.RequestDto;

import com.example.Enums.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class SearchFlightDto {

    private City fromCity;
    private City toCity;
    private LocalDate journeyDate;

}
