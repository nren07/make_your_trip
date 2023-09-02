package com.example.Services;

import com.example.Models.Routes;
import com.example.Repositories.RouteRepository;
import com.example.RequestDto.AddRouteDto;
import com.example.Transformers.RouteTransformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public String addRoutes(AddRouteDto addRouteDto){
//        Routes route = new Routes();
        Routes routeObj = RouteTransformers.convertDtoToEntity(addRouteDto);
        routeRepository.save(routeObj);
        return "Routes has been successfully added to DB. ";
    }


}
