package com.example.RequestDto;

import com.example.Enums.*;
import lombok.Data;

@Data
public class AddRouteDto {

    private City fromCity;
    private City  toCity;
    private String stopsInBetween;
    private ModeOfTransport modeOfTransport;
}
