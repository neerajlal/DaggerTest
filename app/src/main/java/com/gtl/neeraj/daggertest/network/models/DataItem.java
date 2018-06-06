package com.gtl.neeraj.daggertest.network.models;

import com.google.gson.annotations.SerializedName;


public class DataItem {

    @SerializedName("imgFileName")
    private String imgFileName;

    @SerializedName("pChange")
    private String pChange;

    @SerializedName("change")
    private String change;

    @SerializedName("name")
    private String name;

    @SerializedName("lastPrice")
    private String lastPrice;

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName;
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public void setPChange(String pChange) {
        this.pChange = pChange;
    }

    public String getPChange() {
        return pChange;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getChange() {
        return change;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    @Override
    public String toString() {
        return
                "DataItem{" +
                        "imgFileName = '" + imgFileName + '\'' +
                        ",pChange = '" + pChange + '\'' +
                        ",change = '" + change + '\'' +
                        ",name = '" + name + '\'' +
                        ",lastPrice = '" + lastPrice + '\'' +
                        "}";
    }
}