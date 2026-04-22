package org.td2.prog_3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.td2.prog_3.Model.Collectivity;
import org.td2.prog_3.Services.CollectivityServices;

@RestController
public class CollectivityController {

    private CollectivityServices service;

    public CollectivityController(CollectivityServices service) {
        this.service = service;
    }

    @PostMapping("/Collectivities")
    public Collectivity createCollectivity(@RequestBody Collectivity collectivity) {
        return service.create(collectivity);
    }
}