package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "CIS_CUSTACCTCOMP", schema = "TYPE23", catalog = "")
public class CisCustacctcompEntity {
    private long id;
    private String brcno;
    private String custno;
    private String acctno;
    private Time begindate;
    private Time moddate;
    private Time enddate;
    private String channel;
    private String flag23;
    private String openbrc;
    private String acct1;

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
    @Column(name = "CUSTNO")
    public String getCustno() {
        return custno;
    }

    public void setCustno(String custno) {
        this.custno = custno;
    }

    @Basic
    @Column(name = "ACCTNO")
    public String getAcctno() {
        return acctno;
    }

    public void setAcctno(String acctno) {
        this.acctno = acctno;
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
    @Column(name = "MODDATE")
    public Time getModdate() {
        return moddate;
    }

    public void setModdate(Time moddate) {
        this.moddate = moddate;
    }

    @Basic
    @Column(name = "ENDDATE")
    public Time getEnddate() {
        return enddate;
    }

    public void setEnddate(Time enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "CHANNEL")
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Basic
    @Column(name = "FLAG23")
    public String getFlag23() {
        return flag23;
    }

    public void setFlag23(String flag23) {
        this.flag23 = flag23;
    }

    @Basic
    @Column(name = "OPENBRC")
    public String getOpenbrc() {
        return openbrc;
    }

    public void setOpenbrc(String openbrc) {
        this.openbrc = openbrc;
    }

    @Basic
    @Column(name = "ACCT1")
    public String getAcct1() {
        return acct1;
    }

    public void setAcct1(String acct1) {
        this.acct1 = acct1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CisCustacctcompEntity that = (CisCustacctcompEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (custno != null ? !custno.equals(that.custno) : that.custno != null) return false;
        if (acctno != null ? !acctno.equals(that.acctno) : that.acctno != null) return false;
        if (begindate != null ? !begindate.equals(that.begindate) : that.begindate != null) return false;
        if (moddate != null ? !moddate.equals(that.moddate) : that.moddate != null) return false;
        if (enddate != null ? !enddate.equals(that.enddate) : that.enddate != null) return false;
        if (channel != null ? !channel.equals(that.channel) : that.channel != null) return false;
        if (flag23 != null ? !flag23.equals(that.flag23) : that.flag23 != null) return false;
        if (openbrc != null ? !openbrc.equals(that.openbrc) : that.openbrc != null) return false;
        if (acct1 != null ? !acct1.equals(that.acct1) : that.acct1 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (custno != null ? custno.hashCode() : 0);
        result = 31 * result + (acctno != null ? acctno.hashCode() : 0);
        result = 31 * result + (begindate != null ? begindate.hashCode() : 0);
        result = 31 * result + (moddate != null ? moddate.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        result = 31 * result + (channel != null ? channel.hashCode() : 0);
        result = 31 * result + (flag23 != null ? flag23.hashCode() : 0);
        result = 31 * result + (openbrc != null ? openbrc.hashCode() : 0);
        result = 31 * result + (acct1 != null ? acct1.hashCode() : 0);
        return result;
    }
}
