package com.lt.bootdemo.domain;

public class LearnResouce {
    private Long id;
    private String name;
    private String des;
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LearnResouce(String name, String des, String url) {
        this.name = name;
        this.des = des;
        this.url = url;
    }
}
