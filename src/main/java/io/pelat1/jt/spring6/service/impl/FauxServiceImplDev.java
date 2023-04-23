package io.pelat1.jt.spring6.service.impl;

import io.pelat1.jt.spring6.service.FauxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = {"dev"})
@Service
public class FauxServiceImplDev implements FauxService {
    private String profile;

    @Autowired
    public FauxServiceImplDev(@Value("#{profile}") String profile) {
        this.profile = profile;
    }

    @Override
    public String getFauxDatasource() {
        return "You are in: " + profile;
    }
}
