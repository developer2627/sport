package com.example.About_sports;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Sport implements Serializable {

    @SerializedName("idSport")
    @Expose
    private String idSport;
    @SerializedName("strSport")
    @Expose
    private String strSport;
    @SerializedName("strFormat")
    @Expose
    private String strFormat;
    @SerializedName("strSportThumb")
    @Expose
    private String strSportThumb;
    @SerializedName("strSportThumbGreen")
    @Expose
    private String strSportThumbGreen;
    @SerializedName("strSportDescription")
    @Expose
    private String strSportDescription;

    public String getIdSport() {
        return idSport;
    }

    public void setIdSport(String idSport) {
        this.idSport = idSport;
    }

    public String getStrSport() {
        return strSport;
    }

    public void setStrSport(String strSport) {
        this.strSport = strSport;
    }

    public String getStrFormat() {
        return strFormat;
    }

    public void setStrFormat(String strFormat) {
        this.strFormat = strFormat;
    }

    public String getStrSportThumb() {
        return strSportThumb;
    }

    public void setStrSportThumb(String strSportThumb) {
        this.strSportThumb = strSportThumb;
    }

    public String getStrSportThumbGreen() {
        return strSportThumbGreen;
    }

    public void setStrSportThumbGreen(String strSportThumbGreen) {
        this.strSportThumbGreen = strSportThumbGreen;
    }

    public String getStrSportDescription() {
        return strSportDescription;
    }

    public void setStrSportDescription(String strSportDescription) {
        this.strSportDescription = strSportDescription;
    }

}