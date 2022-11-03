package com.cafesystem.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "product")
public class Sample {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prdtCd;

    private String prdtNm;

    private Long prdtPrice;

    @Builder
    public Sample(Long prdtCd, String prdtNm, Long prdtPrice) {
        this.prdtCd = prdtCd;
        this.prdtNm = prdtNm;
        this.prdtPrice = prdtPrice;
    }

}