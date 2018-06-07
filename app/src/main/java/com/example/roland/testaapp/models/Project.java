package com.example.roland.testaapp.models;

public class Project {

    private String name;
    private String url;
    private String description;


    public Project() {
        super();
    }

    public Project(String name,String url,String description ){
        this.description = description;
        this.name = name;
        this.url = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
