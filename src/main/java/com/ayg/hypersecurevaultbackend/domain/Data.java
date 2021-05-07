package com.ayg.hypersecurevaultbackend.domain;

public class Data {

    private Integer dataId;
    private Integer userId;
    private String title;
    private String message;
    private String type;

    public Data(Integer categoryId, Integer userId, String title, String message, String type) {
        this.dataId = categoryId;
        this.userId = userId;
        this.title = title;
        this.message = message;
        this.type = type;
    }

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
