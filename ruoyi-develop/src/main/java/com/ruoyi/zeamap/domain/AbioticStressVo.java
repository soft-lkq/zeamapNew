package com.ruoyi.zeamap.domain;

import com.ruoyi.common.annotation.Excel;

import java.math.BigDecimal;

public class AbioticStressVo {
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
    private Long rust;
    private BigDecimal stemrot;
    private BigDecimal roughdwarf;
    private Long blackpowder;

    public AbioticStressVo() {
    }

    public AbioticStressVo(Long code, String pedigree, String newsource, String pastsource, Long year, String location, Long rust, BigDecimal stemrot, BigDecimal roughdwarf, Long blackpowder) {
        this.code = code;
        this.pedigree = pedigree;
        this.newsource = newsource;
        this.pastsource = pastsource;
        this.year = year;
        this.location = location;
        this.rust = rust;
        this.stemrot = stemrot;
        this.roughdwarf = roughdwarf;
        this.blackpowder = blackpowder;
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
