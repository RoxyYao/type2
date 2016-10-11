package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_USER", schema = "TYPE23", catalog = "")
public class BasUserEntity {
    private long id;
    private String brcno;
    private String userno;
    private String username;
    private String pwd;
    private long passcount;
    private Time passvalid;
    private Time logintime;
    private String usertype;
    private String loginflag;
    private Time begindate;
    private Time enddate;

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
    @Column(name = "USERNO")
    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno;
    }

    @Basic
    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "PWD")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "PASSCOUNT")
    public long getPasscount() {
        return passcount;
    }

    public void setPasscount(long passcount) {
        this.passcount = passcount;
    }

    @Basic
    @Column(name = "PASSVALID")
    public Time getPassvalid() {
        return passvalid;
    }

    public void setPassvalid(Time passvalid) {
        this.passvalid = passvalid;
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
    @Column(name = "USERTYPE")
    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Basic
    @Column(name = "LOGINFLAG")
    public String getLoginflag() {
        return loginflag;
    }

    public void setLoginflag(String loginflag) {
        this.loginflag = loginflag;
    }

    @Basic
    @Column(name = "BEGINDATE")
    public Time getBegindate() {
        return begindate;
    }

    public void setBegindate(Time begindate) {
        this.begindate = begindate;
    }

    @Basic
    @Column(name = "ENDDATE")
    public Time getEnddate() {
        return enddate;
    }

    public void setEnddate(Time enddate) {
        this.enddate = enddate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasUserEntity that = (BasUserEntity) o;

        if (id != that.id) return false;
        if (passcount != that.passcount) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (userno != null ? !userno.equals(that.userno) : that.userno != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (pwd != null ? !pwd.equals(that.pwd) : that.pwd != null) return false;
        if (passvalid != null ? !passvalid.equals(that.passvalid) : that.passvalid != null) return false;
        if (logintime != null ? !logintime.equals(that.logintime) : that.logintime != null) return false;
        if (usertype != null ? !usertype.equals(that.usertype) : that.usertype != null) return false;
        if (loginflag != null ? !loginflag.equals(that.loginflag) : that.loginflag != null) return false;
        if (begindate != null ? !begindate.equals(that.begindate) : that.begindate != null) return false;
        if (enddate != null ? !enddate.equals(that.enddate) : that.enddate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (userno != null ? userno.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        result = 31 * result + (int) (passcount ^ (passcount >>> 32));
        result = 31 * result + (passvalid != null ? passvalid.hashCode() : 0);
        result = 31 * result + (logintime != null ? logintime.hashCode() : 0);
        result = 31 * result + (usertype != null ? usertype.hashCode() : 0);
        result = 31 * result + (loginflag != null ? loginflag.hashCode() : 0);
        result = 31 * result + (begindate != null ? begindate.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        return result;
    }
}
