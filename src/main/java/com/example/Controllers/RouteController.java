package com.example.Controllers;

import com.example.RequestDto.AddRouteDto;
import com.example.Services.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/route")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @PostMapping("/add")
    public String addRoute(@RequestBody AddRouteDto addRouteDto){
        return routeService.addRoutes(addRouteDto);
    }


}
