package com.manong.pojo;

public class ProductCategory {
    private Short id;

    private String name;

    private Short sorderorder=999;

    private Byte status=0;

    private Short parentid = 0;

    public Short getId() {
        return id;
    }

    public Short getSorderorder() {
        return sorderorder;
    }

    public void setSorderorder(Short sorderorder) {
        this.sorderorder = sorderorder;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }




    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Short getParentid() {
        return parentid;
    }

    public void setParentid(Short parentid) {
        this.parentid = parentid;
    }
}