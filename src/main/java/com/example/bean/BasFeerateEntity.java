package com.example.bean;

import javax.persistence.*;

/**
 * Created by yy on 2016/10/10
 * .
 */
@Entity
@Table(name = "BAS_FEERATE", schema = "TYPE23", catalog = "")
public class BasFeerateEntity {
    private long id;
    private String brcno;
    private String feeno;
    private String ccy;
    private String feetype;
    private Long minbal;
    private Long maxbal;
    private Long feerate;
    private Long maxamt;
    private Long minamt;
    private Long fixamt;
    private String feeccy;
    private String payflag;
    private String paybrc;
    private String payautoid;
    private String feebrcflag;
    private String feebrc;
    private String feechgflag;
    private String feechgway;
    private Long feemaxbal;
    private Long feeminbal;
    private String feedesc;

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
    @Column(name = "FEENO")
    public String getFeeno() {
        return feeno;
    }

    public void setFeeno(String feeno) {
        this.feeno = feeno;
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
    @Column(name = "FEETYPE")
    public String getFeetype() {
        return feetype;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }

    @Basic
    @Column(name = "MINBAL")
    public Long getMinbal() {
        return minbal;
    }

    public void setMinbal(Long minbal) {
        this.minbal = minbal;
    }

    @Basic
    @Column(name = "MAXBAL")
    public Long getMaxbal() {
        return maxbal;
    }

    public void setMaxbal(Long maxbal) {
        this.maxbal = maxbal;
    }

    @Basic
    @Column(name = "FEERATE")
    public Long getFeerate() {
        return feerate;
    }

    public void setFeerate(Long feerate) {
        this.feerate = feerate;
    }

    @Basic
    @Column(name = "MAXAMT")
    public Long getMaxamt() {
        return maxamt;
    }

    public void setMaxamt(Long maxamt) {
        this.maxamt = maxamt;
    }

    @Basic
    @Column(name = "MINAMT")
    public Long getMinamt() {
        return minamt;
    }

    public void setMinamt(Long minamt) {
        this.minamt = minamt;
    }

    @Basic
    @Column(name = "FIXAMT")
    public Long getFixamt() {
        return fixamt;
    }

    public void setFixamt(Long fixamt) {
        this.fixamt = fixamt;
    }

    @Basic
    @Column(name = "FEECCY")
    public String getFeeccy() {
        return feeccy;
    }

    public void setFeeccy(String feeccy) {
        this.feeccy = feeccy;
    }

    @Basic
    @Column(name = "PAYFLAG")
    public String getPayflag() {
        return payflag;
    }

    public void setPayflag(String payflag) {
        this.payflag = payflag;
    }

    @Basic
    @Column(name = "PAYBRC")
    public String getPaybrc() {
        return paybrc;
    }

    public void setPaybrc(String paybrc) {
        this.paybrc = paybrc;
    }

    @Basic
    @Column(name = "PAYAUTOID")
    public String getPayautoid() {
        return payautoid;
    }

    public void setPayautoid(String payautoid) {
        this.payautoid = payautoid;
    }

    @Basic
    @Column(name = "FEEBRCFLAG")
    public String getFeebrcflag() {
        return feebrcflag;
    }

    public void setFeebrcflag(String feebrcflag) {
        this.feebrcflag = feebrcflag;
    }

    @Basic
    @Column(name = "FEEBRC")
    public String getFeebrc() {
        return feebrc;
    }

    public void setFeebrc(String feebrc) {
        this.feebrc = feebrc;
    }

    @Basic
    @Column(name = "FEECHGFLAG")
    public String getFeechgflag() {
        return feechgflag;
    }

    public void setFeechgflag(String feechgflag) {
        this.feechgflag = feechgflag;
    }

    @Basic
    @Column(name = "FEECHGWAY")
    public String getFeechgway() {
        return feechgway;
    }

    public void setFeechgway(String feechgway) {
        this.feechgway = feechgway;
    }

    @Basic
    @Column(name = "FEEMAXBAL")
    public Long getFeemaxbal() {
        return feemaxbal;
    }

    public void setFeemaxbal(Long feemaxbal) {
        this.feemaxbal = feemaxbal;
    }

    @Basic
    @Column(name = "FEEMINBAL")
    public Long getFeeminbal() {
        return feeminbal;
    }

    public void setFeeminbal(Long feeminbal) {
        this.feeminbal = feeminbal;
    }

    @Basic
    @Column(name = "FEEDESC")
    public String getFeedesc() {
        return feedesc;
    }

    public void setFeedesc(String feedesc) {
        this.feedesc = feedesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasFeerateEntity that = (BasFeerateEntity) o;

        if (id != that.id) return false;
        if (brcno != null ? !brcno.equals(that.brcno) : that.brcno != null) return false;
        if (feeno != null ? !feeno.equals(that.feeno) : that.feeno != null) return false;
        if (ccy != null ? !ccy.equals(that.ccy) : that.ccy != null) return false;
        if (feetype != null ? !feetype.equals(that.feetype) : that.feetype != null) return false;
        if (minbal != null ? !minbal.equals(that.minbal) : that.minbal != null) return false;
        if (maxbal != null ? !maxbal.equals(that.maxbal) : that.maxbal != null) return false;
        if (feerate != null ? !feerate.equals(that.feerate) : that.feerate != null) return false;
        if (maxamt != null ? !maxamt.equals(that.maxamt) : that.maxamt != null) return false;
        if (minamt != null ? !minamt.equals(that.minamt) : that.minamt != null) return false;
        if (fixamt != null ? !fixamt.equals(that.fixamt) : that.fixamt != null) return false;
        if (feeccy != null ? !feeccy.equals(that.feeccy) : that.feeccy != null) return false;
        if (payflag != null ? !payflag.equals(that.payflag) : that.payflag != null) return false;
        if (paybrc != null ? !paybrc.equals(that.paybrc) : that.paybrc != null) return false;
        if (payautoid != null ? !payautoid.equals(that.payautoid) : that.payautoid != null) return false;
        if (feebrcflag != null ? !feebrcflag.equals(that.feebrcflag) : that.feebrcflag != null) return false;
        if (feebrc != null ? !feebrc.equals(that.feebrc) : that.feebrc != null) return false;
        if (feechgflag != null ? !feechgflag.equals(that.feechgflag) : that.feechgflag != null) return false;
        if (feechgway != null ? !feechgway.equals(that.feechgway) : that.feechgway != null) return false;
        if (feemaxbal != null ? !feemaxbal.equals(that.feemaxbal) : that.feemaxbal != null) return false;
        if (feeminbal != null ? !feeminbal.equals(that.feeminbal) : that.feeminbal != null) return false;
        if (feedesc != null ? !feedesc.equals(that.feedesc) : that.feedesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (brcno != null ? brcno.hashCode() : 0);
        result = 31 * result + (feeno != null ? feeno.hashCode() : 0);
        result = 31 * result + (ccy != null ? ccy.hashCode() : 0);
        result = 31 * result + (feetype != null ? feetype.hashCode() : 0);
        result = 31 * result + (minbal != null ? minbal.hashCode() : 0);
        result = 31 * result + (maxbal != null ? maxbal.hashCode() : 0);
        result = 31 * result + (feerate != null ? feerate.hashCode() : 0);
        result = 31 * result + (maxamt != null ? maxamt.hashCode() : 0);
        result = 31 * result + (minamt != null ? minamt.hashCode() : 0);
        result = 31 * result + (fixamt != null ? fixamt.hashCode() : 0);
        result = 31 * result + (feeccy != null ? feeccy.hashCode() : 0);
        result = 31 * result + (payflag != null ? payflag.hashCode() : 0);
        result = 31 * result + (paybrc != null ? paybrc.hashCode() : 0);
        result = 31 * result + (payautoid != null ? payautoid.hashCode() : 0);
        result = 31 * result + (feebrcflag != null ? feebrcflag.hashCode() : 0);
        result = 31 * result + (feebrc != null ? feebrc.hashCode() : 0);
        result = 31 * result + (feechgflag != null ? feechgflag.hashCode() : 0);
        result = 31 * result + (feechgway != null ? feechgway.hashCode() : 0);
        result = 31 * result + (feemaxbal != null ? feemaxbal.hashCode() : 0);
        result = 31 * result + (feeminbal != null ? feeminbal.hashCode() : 0);
        result = 31 * result + (feedesc != null ? feedesc.hashCode() : 0);
        return result;
    }
}
