package com.ruoyi.zeamap.domain;

import com.ruoyi.common.annotation.Excel;

public class AgronomicalVo {
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
    private double spikeLength;
    private double spikeWidth;
    private double row;
    private double kernels;
    private double grainWeight;
    private double grainLength;
    private double grainWidth;
    private double yield;
    private double seedYield;

    @Override
    public String toString() {
        return "AgronomicalVo{" +
                "spikeLength=" + spikeLength +
                ", spikeWidth=" + spikeWidth +
                ", row=" + row +
                ", kernels=" + kernels +
                ", grainWeight=" + grainWeight +
                ", grainLength=" + grainLength +
                ", grainWidth=" + grainWidth +
                ", yield=" + yield +
                ", seedYield=" + seedYield +
                '}';
    }

    public double getSpikeLength() {
        return spikeLength;
    }

    public void setSpikeLength(double spikeLength) {
        this.spikeLength = spikeLength;
    }

    public double getSpikeWidth() {
        return spikeWidth;
    }

    public void setSpikeWidth(double spikeWidth) {
        this.spikeWidth = spikeWidth;
    }

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getKernels() {
        return kernels;
    }

    public void setKernels(double kernels) {
        this.kernels = kernels;
    }

    public double getGrainWeight() {
        return grainWeight;
    }

    public void setGrainWeight(double grainWeight) {
        this.grainWeight = grainWeight;
    }

    public double getGrainLength() {
        return grainLength;
    }

    public void setGrainLength(double grainLength) {
        this.grainLength = grainLength;
    }

    public double getGrainWidth() {
        return grainWidth;
    }

    public void setGrainWidth(double grainWidth) {
        this.grainWidth = grainWidth;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }

    public double getSeedYield() {
        return seedYield;
    }

    public void setSeedYield(double seedYield) {
        this.seedYield = seedYield;
    }

    public AgronomicalVo() {
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
}
