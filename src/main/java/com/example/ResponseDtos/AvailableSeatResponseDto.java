package com.example.ResponseDtos;


import com.example.Enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AvailableSeatResponseDto {

    private String seatNo;
    private SeatType seatType;
    private Integer seatPrice;

}
