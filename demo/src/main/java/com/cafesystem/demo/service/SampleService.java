package com.cafesystem.demo.service;

import com.cafesystem.demo.entity.Sample;
import com.cafesystem.demo.repository.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository sampleRepository;

    public List<Sample> getSamples() {
        return sampleRepository.findAll();
    }

    public Sample addSample(String prdtNm, Long prdtPrice){
        return sampleRepository.save(Sample.builder().prdtNm(prdtNm).prdtPrice(prdtPrice).build());
    }
}