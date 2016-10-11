package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by yy on 2016/9/24
 * .
 */
@Entity
public class demoBean {
    @Id
    @GeneratedValue
    private  Long id;
    private  String title;
    private  String cont;

    public demoBean() {
    }

    public demoBean(String title, String content) {
        this.title = title;
        this.cont = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }
}
