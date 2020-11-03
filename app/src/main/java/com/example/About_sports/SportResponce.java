package com.example.About_sports;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SportResponce {

    @SerializedName("sports")
    @Expose
    private List<Sport> sports = null;

    public List<Sport> getSports() {
        return sports;
    }

    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

}
