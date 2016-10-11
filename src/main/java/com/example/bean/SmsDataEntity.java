package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "SMS_DATA", schema = "TYPE23", catalog = "")
public class SmsDataEntity {
    private long id;
    private String brcno;
    private String stype;
    private String seqno;
    private String mobile;
    private String custno;
    private String custname;
    private String content;
    private String sflag;
    private Time sdate;
    private String stime;
    private String smsflag;

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
    @Column(name = "STYPE")
    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    @Basic
    @Column(name = "SEQNO")
    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    @Basic
    @Column(name = "MOBILE")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "CUSTNO")
    public String getCustno() {
        return custno;
    }

    public void setCustno(String custno) {
        this.custno = custno;
    }

    @Basic
    @Column(name = "CUSTNAME")
    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Basic
    @Column(name = "CONTENT")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "SFLAG")
    public String getSflag() {
        return sflag;
    }

    public void setSflag(String sflag) {
        this.sflag = sflag;
    }

    @Basic
    @Column(name = "SDATE")
    public Time getSdate() {
        return sdate;
    }

    public void setSdate(Time sdate) {
        this.sdate = sdate;
    }

    @Basic
    @Column(name = "STIME")
    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    @Basic
    @Column(name = "SMSFLAG")
    public String getSmsflag() {
        return smsflag;
    }

    public void setSmsflag(String smsflag) {
        this.smsflag = smsflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmsDataEntity that = (SmsDataEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (stype != null ? !stype.equals(that.stype) : that.stype != null) return false;
        if (seqno != null ? !seqno.equals(that.seqno) : that.seqno != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (custno != null ? !custno.equals(that.custno) : that.custno != null) return false;
        if (custname != null ? !custname.equals(that.custname) : that.custname != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (sflag != null ? !sflag.equals(that.sflag) : that.sflag != null) return false;
        if (sdate != null ? !sdate.equals(that.sdate) : that.sdate != null) return false;
        if (stime != null ? !stime.equals(that.stime) : that.stime != null) return false;
        if (smsflag != null ? !smsflag.equals(that.smsflag) : that.smsflag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (stype != null ? stype.hashCode() : 0);
        result = 31 * result + (seqno != null ? seqno.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (custno != null ? custno.hashCode() : 0);
        result = 31 * result + (custname != null ? custname.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (sflag != null ? sflag.hashCode() : 0);
        result = 31 * result + (sdate != null ? sdate.hashCode() : 0);
        result = 31 * result + (stime != null ? stime.hashCode() : 0);
        result = 31 * result + (smsflag != null ? smsflag.hashCode() : 0);
        return result;
    }
}
