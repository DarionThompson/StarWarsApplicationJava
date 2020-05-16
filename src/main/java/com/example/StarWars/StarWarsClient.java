package com.example.StarWars;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class StarWarsClient implements IStarWarsClient{

    public String getPeople() {
        HttpResponse<String> response = null;
        try {
           HttpClient client = HttpClient.newBuilder().build();
           HttpRequest request = HttpRequest.newBuilder()
                   .GET()
                   .uri(URI.create("https://swapi.dev/api/people/"))
                   .build();

           HttpResponse.BodyHandler<StarWarsPeople> handlers = null;

            response = client.send(request, HttpResponse.BodyHandlers.ofString());
       }
       catch(IOException exception){
           exception.printStackTrace();
        } catch (InterruptedException e) {
           e.printStackTrace();
       }
        return response.body();
    }
}
