package com.example.StarWars;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarWarsController {

    private IStarWarsClient starWarsClient;

    public StarWarsController(IStarWarsClient starWarsClient){
        this.starWarsClient = starWarsClient;
    }
    @RequestMapping("/getPeople")
    public String getStarWarsPeople() {
        var response = starWarsClient.getPeople();

        return response;
    }
}