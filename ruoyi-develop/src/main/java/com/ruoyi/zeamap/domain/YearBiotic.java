package com.ruoyi.zeamap.domain;

import java.math.BigDecimal;

public class YearBiotic {
    private Long year;
    private BigDecimal rates;

    public YearBiotic() {
    }

    public YearBiotic(Long year, BigDecimal rates) {
        this.year = year;
        this.rates = rates;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public BigDecimal getRates() {
        return rates;
    }

    public void setRates(BigDecimal rates) {
        this.rates = rates;
    }
}
