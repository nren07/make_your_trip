package com.example.Transformers;

import com.example.Models.*;
import com.example.RequestDto.AddRouteDto;

public class RouteTransformers {

    public static Routes convertDtoToEntity(AddRouteDto addRouteDto){

        Routes routeObject = Routes.builder().
                fromCity(addRouteDto.getFromCity())
                .toCity(addRouteDto.getToCity())
                .listOfStopInBetween(addRouteDto.getStopsInBetween())
                .modeOfTransport(addRouteDto.getModeOfTransport())
                .build();
        return routeObject;

    }
}
