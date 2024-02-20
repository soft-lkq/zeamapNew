package com.ruoyi.zeamap.domain;

import java.math.BigDecimal;

public class YearAbiotic {
    private Long year;
    private Long rust;
    private BigDecimal stemrot;
    private BigDecimal roughdwarf;
    private Long blackpowder;

    public YearAbiotic() {
    }

    public YearAbiotic(Long year, Long rust, BigDecimal stemrot, BigDecimal roughdwarf, Long blackpowder) {
        this.year = year;
        this.rust = rust;
        this.stemrot = stemrot;
        this.roughdwarf = roughdwarf;
        this.blackpowder = blackpowder;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Long getRust() {
        return rust;
    }

    public void setRust(Long rust) {
        this.rust = rust;
    }

    public BigDecimal getStemrot() {
        return stemrot;
    }

    public void setStemrot(BigDecimal stemrot) {
        this.stemrot = stemrot;
    }

    public BigDecimal getRoughdwarf() {
        return roughdwarf;
    }

    public void setRoughdwarf(BigDecimal roughdwarf) {
        this.roughdwarf = roughdwarf;
    }

    public Long getBlackpowder() {
        return blackpowder;
    }

    public void setBlackpowder(Long blackpowder) {
        this.blackpowder = blackpowder;
    }
}
