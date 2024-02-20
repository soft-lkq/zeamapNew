package com.ruoyi.zeamap.domain;

import com.ruoyi.common.annotation.Excel;

import java.math.BigDecimal;

public class BioticStressVo {
    private Long code;

    /** 系谱 */
    @Excel(name = "系谱")
    private String pedigree;

    /** 新来源 */
    @Excel(name = "新来源")
    private String newsource;

    /** 旧来源 */
    @Excel(name = "旧来源")
    private String pastsource;

    /** 年份 */
    @Excel(name = "年份")
    private Long year;

    /** 地点 */
    @Excel(name = "地点")
    private String location;
    private BigDecimal rates;


    public BioticStressVo() {
    }

    public BioticStressVo(Long code, String pedigree, String newsource, String pastsource, Long year, String location, BigDecimal rates) {
        this.code = code;
        this.pedigree = pedigree;
        this.newsource = newsource;
        this.pastsource = pastsource;
        this.year = year;
        this.location = location;
        this.rates = rates;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public String getNewsource() {
        return newsource;
    }

    public void setNewsource(String newsource) {
        this.newsource = newsource;
    }

    public String getPastsource() {
        return pastsource;
    }

    public void setPastsource(String pastsource) {
        this.pastsource = pastsource;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getRates() {
        return rates;
    }

    public void setRates(BigDecimal rates) {
        this.rates = rates;
    }
}
