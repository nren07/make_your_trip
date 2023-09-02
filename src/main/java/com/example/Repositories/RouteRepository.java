package com.example.Repositories;

import com.example.Enums.*;
import com.example.Models.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RouteRepository extends JpaRepository<Routes,Integer> {

    List<Routes> findRoutesByFromCityAndToCityAndModeOfTransport(City fromCity, City toCity, ModeOfTransport modeOfTransport);
}
