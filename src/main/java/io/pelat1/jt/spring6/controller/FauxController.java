package io.pelat1.jt.spring6.controller;

import io.pelat1.jt.spring6.service.FauxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {
    private final FauxService fauxService;

    @Autowired
    public FauxController(FauxService fauxService) {
        this.fauxService = fauxService;
    }

    public String getFauxDatasource() {
        return fauxService.getFauxDatasource();
    }
}
