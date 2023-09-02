package com.example.Models;

import com.example.Enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "seats")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
    @Id
    private int seatId;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;
    private Integer price;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Transport transport;    //parent is transport so here many to one mapping is done


}
