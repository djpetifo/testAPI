package org.launchcode.api.controllers;

import org.launchcode.api.models.Planet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("planets")
public class PlanetController {

    @GetMapping
    public List<Planet> planets() {
        return Arrays.asList(
                new Planet("Tatooine",
                        "10465 km",
                        "Tatoo I & Tatoo II",
                        "43000 light years from galactic core",
                        "https://www.nasa.gov/sites/default/files/images/587837main_Kepler16_transit_art2_full.jpg",
                        3),
                new Planet("Pern",
                        "measurement is under dispute",
                        "Alpha Sagittarius (a.k.a. Rukbat)",
                        "Varies - find a library",
                        "https://www.nasa.gov/centers/langley/images/content/698148main_Brains_904_2.jpg",
                        2)
        );
    }
}