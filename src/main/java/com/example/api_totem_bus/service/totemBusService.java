package com.example.api_totem_bus.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class totemBusService {

    private String consultarURL(String apiUrl) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody();
        } else {
            return "Falha ao obter dados. Código de status: " + responseEntity.getStatusCode();
        }
    }

    // public String consultarMarcas() {
    //     return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas");
    // }

    // public String consultarModelos(int id) {
    //     return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/" + id + "/modelos");
    // }

    // public String consultarAnos(int marca, int modelo) {
    //     return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/" + marca + "/modelos/" + modelo + "/anos");
    // }

    // public String consultarValor(int marca, int modelo, String ano) {
    //     return consultarURL("https://parallelum.com.br/fipe/api/v1/carros/marcas/" + marca + "/modelos/" + modelo + "/anos/" + ano);
    // }

    public String prevParada(int id){
        return consultarURL("http://mobile-l.sitbus.com.br:6060/siumobile-ws-v01/rest/ws/buscarPrevisoes/" + id + "/0/retornoJSON");
    }

    public String coordIti(int id){
        return consultarURL("http://mobile-l.sitbus.com.br:6060/siumobile-ws-v01/rest/ws/buscarItinerario/" + id + "/0/retornoJSONItinerario");
    }

    public String coordVei(int id){
        return consultarURL("http://mobile-l.sitbus.com.br:6060/siumobile-ws-v01/rest/ws/retornaVeiculosMapa/" + id + "/0/retornoJSONVeiculos");
    }
}
