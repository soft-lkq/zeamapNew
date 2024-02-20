package com.ruoyi.zeamap.domain;

public class GeVo {
    private String pedigree;
    private Long year;
    private String location;
    private String trait;

    public GeVo(String pedigree, Long year, String location, String trait) {
        this.pedigree = pedigree;
        this.year = year;
        this.location = location;
        this.trait = trait;
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

    public GeVo() {
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }
}
