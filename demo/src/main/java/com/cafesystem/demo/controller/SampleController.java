package com.cafesystem.demo.controller;

import com.cafesystem.demo.entity.Sample;
import com.cafesystem.demo.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @GetMapping(value = "/samples")
    public List<Sample> getSamples(){
        return sampleService.getSamples();
    }

    @PostMapping(value = "/samples")
    public Sample addSample(String prdtNm, Long prdtPrice){
        return sampleService.addSample(prdtNm, prdtPrice);
    }
}