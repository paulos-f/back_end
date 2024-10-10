package com.example.semana08.Controller;

import com.example.semana08.Models.Pessoa;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
public class DemoController {

    @GetMapping("/mundo")
    public String ola(@RequestParam String nome, @RequestParam String sobrenome){
        return "Olá," + nome + " " + sobrenome;
    }

    @PostMapping("/mundo")
    public String jogador(@RequestBody Pessoa pessoa){
        return "Olá" + " " + pessoa.getNome() + " " + pessoa.getSobrenome();
    }

    @PostMapping("/carros")
    @ResponseBody
    public String carros() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://parallelum.com.br/fipe/api/v1"))
                .header("User-Agent", "insomnia/10.0.0")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }

    @GetMapping("/marcas")
    @ResponseBody
    public String marcas() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://parallelum.com.br/fipe/api/v1/carros/marcas"))
                .header("User-Agent", "insomnia/10.0.0")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }

    @GetMapping("/modelo")
    @ResponseBody
    public String modelo() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://parallelum.com.br/fipe/api/v1/carros/marcas/59/modelos"))
                .header("User-Agent", "insomnia/10.0.0")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }

    @GetMapping("/anos")
    @ResponseBody
    public String anos() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://parallelum.com.br/fipe/api/v1/carros/marcas/59/modelos/5940/anos"))
                .header("User-Agent", "insomnia/10.0.0")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }

    @GetMapping("/valor")
    @ResponseBody
    public String valor() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://parallelum.com.br/fipe/api/v1/carros/marcas/59/modelos/5940/anos/2014-3"))
                .header("User-Agent", "insomnia/10.0.0")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }
}


