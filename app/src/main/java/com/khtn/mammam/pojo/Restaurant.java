package com.khtn.mammam.pojo;

import java.io.Serializable;

/**
 * Created by Sayuri Kurata on 2017/01/31.
 */

public class Restaurant implements Serializable{

    private String restAddr;
    private String restImg;
    private String restName;
    private String restTopComment;
    private String restTopCommenter;
    private Double Latitude;
    private Double Longitude;
    private String restDetailLink;
    private Rating rating;

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestImg() {
        return restImg;
    }

    public void setRestImg(String restImg) {
        this.restImg = restImg;
    }

    public String getRestAddr() {
        return restAddr;
    }

    public void setRestAddr(String restAddr) {
        this.restAddr = restAddr;
    }

    public String getRestTopCommenter() {
        return restTopCommenter;
    }

    public void setRestTopCommenter(String restTopCommenter) {
        this.restTopCommenter = restTopCommenter;
    }

    public String getRestTopComment() {
        return restTopComment;
    }

    public void setRestTopComment(String restTopComment) {
        this.restTopComment = restTopComment;
    }


    public String getRestDetailLink() {
        return restDetailLink;
    }

    public void setRestDetailLink(String restDetailLink) {
        this.restDetailLink = restDetailLink;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double longitude) {
        Longitude = longitude;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }
}
