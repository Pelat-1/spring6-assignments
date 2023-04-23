package io.pelat1.jt.spring6.controller;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {
    public String getFauxDatasource() {
        throw new NotImplementedException();
    }
}
