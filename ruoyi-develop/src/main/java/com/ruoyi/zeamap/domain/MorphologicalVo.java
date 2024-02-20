package com.ruoyi.zeamap.domain;

import com.ruoyi.common.annotation.Excel;

/**
 * @program: ruoyi
 * @description:
 * @author: wj
 **/
public class MorphologicalVo {
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
    private double height;
    private double stemDiameter;
    private double earHeight;
    private double leafLength;
    private double leafWidth;
    private double maleSpikes;
    private double spindleLength;

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getStemDiameter() {
        return stemDiameter;
    }

    public void setStemDiameter(double stemDiameter) {
        this.stemDiameter = stemDiameter;
    }

    public double getEarHeight() {
        return earHeight;
    }

    public void setEarHeight(double earHeight) {
        this.earHeight = earHeight;
    }

    public double getLeafLength() {
        return leafLength;
    }

    public void setLeafLength(double leafLength) {
        this.leafLength = leafLength;
    }

    public double getLeafWidth() {
        return leafWidth;
    }

    public void setLeafWidth(double leafWidth) {
        this.leafWidth = leafWidth;
    }

    public double getMaleSpikes() {
        return maleSpikes;
    }

    public void setMaleSpikes(double maleSpikes) {
        this.maleSpikes = maleSpikes;
    }

    public double getSpindleLength() {
        return spindleLength;
    }

    public void setSpindleLength(double spindleLength) {
        this.spindleLength = spindleLength;
    }

    public MorphologicalVo() {
    }

    public MorphologicalVo(Long code, String pedigree, String newsource, String pastsource, Long year, String location, double height, double stemDiameter, double earHeight, double leafLength, double leafWidth, double maleSpikes, double spindleLength) {
        this.code = code;
        this.pedigree = pedigree;
        this.newsource = newsource;
        this.pastsource = pastsource;
        this.year = year;
        this.location = location;
        this.height = height;
        this.stemDiameter = stemDiameter;
        this.earHeight = earHeight;
        this.leafLength = leafLength;
        this.leafWidth = leafWidth;
        this.maleSpikes = maleSpikes;
        this.spindleLength = spindleLength;
    }
}
