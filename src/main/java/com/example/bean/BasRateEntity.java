package com.example.bean;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_RATE", schema = "TYPE23", catalog = "")
public class BasRateEntity {
    private long id;
    private String brcno;
    private String rateno;
    private String ccy;
    private String rateunit;
    private Long rateterm;
    private Time eftdate;
    private Long rate;
    private String ratetype;
    private Long upval;
    private Long downval;
    private Long upper;
    private Long downper;
    private String ratedesc;

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
    @Column(name = "RATENO")
    public String getRateno() {
        return rateno;
    }

    public void setRateno(String rateno) {
        this.rateno = rateno;
    }

    @Basic
    @Column(name = "CCY")
    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    @Basic
    @Column(name = "RATEUNIT")
    public String getRateunit() {
        return rateunit;
    }

    public void setRateunit(String rateunit) {
        this.rateunit = rateunit;
    }

    @Basic
    @Column(name = "RATETERM")
    public Long getRateterm() {
        return rateterm;
    }

    public void setRateterm(Long rateterm) {
        this.rateterm = rateterm;
    }

    @Basic
    @Column(name = "EFTDATE")
    public Time getEftdate() {
        return eftdate;
    }

    public void setEftdate(Time eftdate) {
        this.eftdate = eftdate;
    }

    @Basic
    @Column(name = "RATE")
    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "RATETYPE")
    public String getRatetype() {
        return ratetype;
    }

    public void setRatetype(String ratetype) {
        this.ratetype = ratetype;
    }

    @Basic
    @Column(name = "UPVAL")
    public Long getUpval() {
        return upval;
    }

    public void setUpval(Long upval) {
        this.upval = upval;
    }

    @Basic
    @Column(name = "DOWNVAL")
    public Long getDownval() {
        return downval;
    }

    public void setDownval(Long downval) {
        this.downval = downval;
    }

    @Basic
    @Column(name = "UPPER")
    public Long getUpper() {
        return upper;
    }

    public void setUpper(Long upper) {
        this.upper = upper;
    }

    @Basic
    @Column(name = "DOWNPER")
    public Long getDownper() {
        return downper;
    }

    public void setDownper(Long downper) {
        this.downper = downper;
    }

    @Basic
    @Column(name = "RATEDESC")
    public String getRatedesc() {
        return ratedesc;
    }

    public void setRatedesc(String ratedesc) {
        this.ratedesc = ratedesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasRateEntity that = (BasRateEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (rateno != null ? !rateno.equals(that.rateno) : that.rateno != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (rateunit != null ? !rateunit.equals(that.rateunit) : that.rateunit != null) return false;
        if (rateterm != null ? !rateterm.equals(that.rateterm) : that.rateterm != null) return false;
        if (eftdate != null ? !eftdate.equals(that.eftdate) : that.eftdate != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;
        if (ratetype != null ? !ratetype.equals(that.ratetype) : that.ratetype != null) return false;
        if (upval != null ? !upval.equals(that.upval) : that.upval != null) return false;
        if (downval != null ? !downval.equals(that.downval) : that.downval != null) return false;
        if (upper != null ? !upper.equals(that.upper) : that.upper != null) return false;
        if (downper != null ? !downper.equals(that.downper) : that.downper != null) return false;
        if (ratedesc != null ? !ratedesc.equals(that.ratedesc) : that.ratedesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (rateno != null ? rateno.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (rateunit != null ? rateunit.hashCode() : 0);
        result = 31 * result + (rateterm != null ? rateterm.hashCode() : 0);
        result = 31 * result + (eftdate != null ? eftdate.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (ratetype != null ? ratetype.hashCode() : 0);
        result = 31 * result + (upval != null ? upval.hashCode() : 0);
        result = 31 * result + (downval != null ? downval.hashCode() : 0);
        result = 31 * result + (upper != null ? upper.hashCode() : 0);
        result = 31 * result + (downper != null ? downper.hashCode() : 0);
        result = 31 * result + (ratedesc != null ? ratedesc.hashCode() : 0);
        return result;
    }
}
