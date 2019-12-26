package io.spring.tp5.controller;

import io.spring.tp5.model.Apiadresse;
import io.spring.tp5.model.Meteo;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MeteoController {

    private static final String KEY_DARKSKY = "07eeb89f8a0f0595c57ad8de62fbfb1b";
    String addressURI = "https://api-adresse.data.gouv.fr/search/";
    String meteoUI = "https://api.darksky.net/forecast/"+KEY_DARKSKY+"/";

    @GetMapping("/adresse")
    public String searchAdress(Model model) {

        return "searchAdress";
    }

    @PostMapping("/meteo")
    public String getMeteo(@RequestParam( name ="adresse", required=true) String adresse, Model model) {

        // get coords GPS from apigouv
        RestTemplate restTemplate = new RestTemplate();
        Apiadresse adresseResponse = restTemplate.getForObject(addressURI + "?q="+adresse, Apiadresse.class);

        Float lat = adresseResponse.getFeatures().get(0).getGeometry().getCoordinates().get(1);
        Float lon = adresseResponse.getFeatures().get(0).getGeometry().getCoordinates().get(0);

        //[latitude],[longitude]
        Meteo meteoResponse = restTemplate.getForObject(meteoUI + lat + "," + lon, Meteo.class);

        model.addAttribute("adresse", adresse);
        model.addAttribute("lat", lat);
        model.addAttribute("lon", lon);
        model.addAttribute("meteo", meteoResponse.getCurrently().getSummary());
        model.addAttribute("response", meteoResponse);

        return "meteo";
    }
}
