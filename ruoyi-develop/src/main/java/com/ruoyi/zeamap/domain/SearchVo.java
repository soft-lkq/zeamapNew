package com.ruoyi.zeamap.domain;

public class SearchVo {
    private String code;
    private String newSource;
    private String pastSource;
    private String pedigree;
    private Long year;
    private String location;
    private String trait;

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
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

    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

    public SearchVo() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNewSource() {
        return newSource;
    }

    public void setNewSource(String newSource) {
        this.newSource = newSource;
    }

    public String getPastSource() {
        return pastSource;
    }

    public void setPastSource(String pastSource) {
        this.pastSource = pastSource;
    }

    public SearchVo(String code, String newSource, String pastSource, String pedigree, Long year, String location, String trait) {
        this.code = code;
        this.newSource = newSource;
        this.pastSource = pastSource;
        this.pedigree = pedigree;
        this.year = year;
        this.location = location;
        this.trait = trait;
    }
}
