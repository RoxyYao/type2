package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_POWER", schema = "TYPE23", catalog = "")
public class BasPowerEntity {
    private long id;
    private String brcno;
    private String usertype;
    private String power;
    private Long record;
    private Time modtime;
    private Time logintime;
    private String ctrlflag;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "BRCNO")
    public String getBrcno() {
        return brcno;
    }

    public void setBrcno(String brcno) {
        this.brcno = brcno;
    }

    @Basic
    @Column(name = "USERTYPE")
    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Basic
    @Column(name = "POWER")
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Basic
    @Column(name = "RECORD")
    public Long getRecord() {
        return record;
    }

    public void setRecord(Long record) {
        this.record = record;
    }

    @Basic
    @Column(name = "MODTIME")
    public Time getModtime() {
        return modtime;
    }

    public void setModtime(Time modtime) {
        this.modtime = modtime;
    }

    @Basic
    @Column(name = "LOGINTIME")
    public Time getLogintime() {
        return logintime;
    }

    public void setLogintime(Time logintime) {
        this.logintime = logintime;
    }

    @Basic
    @Column(name = "CTRLFLAG")
    public String getCtrlflag() {
        return ctrlflag;
    }

    public void setCtrlflag(String ctrlflag) {
        this.ctrlflag = ctrlflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasPowerEntity that = (BasPowerEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (usertype != null ? !usertype.equals(that.usertype) : that.usertype != null) return false;
        if (power != null ? !power.equals(that.power) : that.power != null) return false;
        if (record != null ? !record.equals(that.record) : that.record != null) return false;
        if (modtime != null ? !modtime.equals(that.modtime) : that.modtime != null) return false;
        if (logintime != null ? !logintime.equals(that.logintime) : that.logintime != null) return false;
        if (ctrlflag != null ? !ctrlflag.equals(that.ctrlflag) : that.ctrlflag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (usertype != null ? usertype.hashCode() : 0);
        result = 31 * result + (power != null ? power.hashCode() : 0);
        result = 31 * result + (record != null ? record.hashCode() : 0);
        result = 31 * result + (modtime != null ? modtime.hashCode() : 0);
        result = 31 * result + (logintime != null ? logintime.hashCode() : 0);
        result = 31 * result + (ctrlflag != null ? ctrlflag.hashCode() : 0);
        return result;
    }
}
