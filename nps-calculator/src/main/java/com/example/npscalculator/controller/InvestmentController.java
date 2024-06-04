package com.example.npscalculator.controller;

import com.example.npscalculator.model.Investment;
import com.example.npscalculator.model.InvestmentResult;
import com.example.npscalculator.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nps")
public class InvestmentController {

    @Autowired
    private InvestmentService investmentService;

    @PostMapping("/calculate")
    public InvestmentResult calculateNps(@RequestBody Investment investment) {
        return investmentService.calculateNps(investment);
    }
}
